package DecibelSDK;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class Decibel {
    private final String appId;
    private final String appKey;
    
    /**
     * Create a new instance of the Decibel class with your credentials.
     * This is the main class that all queries are run through
     * 
     * @param yourAppId Your Decibel App Id
     * @param yourAppKey Your Decibel App Key
     */
    public Decibel(String yourAppId, String yourAppKey){
        appId = yourAppId;
        appKey = yourAppKey;
    }
    
    /**
     * Execute a query on the Decibel API
     * 
     * @param <TResult> The type of result object expected
     * @param query The query object to run
     * @return The result object returned by the query
     * @throws DecibelException 
     */
    public <TResult> TResult Execute(Query<TResult> query) 
            throws DecibelException{
        String result = Execute(query.getQueryString());
        if(result == null)
            throw new DecibelException("No data recieved from the Decibel API");
        
        Class queryClass = query.getClass();       
        Type[] superclassType = queryClass.getGenericInterfaces();
        Type tResultType = ((ParameterizedType)superclassType[0])
                .getActualTypeArguments()[0];
        
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        return gson.fromJson(result, tResultType);
    }
    
    /**
     * Execute a query on the Decibel API
     * 
     * @param query The query string to execute
     * @return The JSON string result of the query
     * @throws DecibelException 
     */
    private String Execute(String query) throws DecibelException{
        if(query == null)
            return null;
        
        try{
            // Get a input stream from Decibel API
            URL url = new URL(query);
            URI uri = new URI(
                    url.getProtocol(), 
                    url.getUserInfo(),
                    url.getHost(), 
                    url.getPort(),
                    url.getPath(), 
                    url.getQuery(), 
                    null);
            URLConnection urlConn = uri.toURL().openConnection();
            InternalUtilities.SetDecibelRequestHeaders(urlConn, appId, appKey);
            InputStream is = urlConn.getInputStream();
            // Read the input stream
            try {
              BufferedReader rd = new BufferedReader(
                      new InputStreamReader(is, Charset.forName("UTF-8")));
              String jsonText = readAll(rd);
              return jsonText;
            } finally {
              is.close();
            }
        }catch (IOException ex){
            // TODO: improve error handling here to match C# version
            throw new DecibelException(ex.getMessage());
        }catch (IllegalStateException ex) {
            throw new DecibelException(ex.getMessage()); // TODO: maybe add our own error message
        } catch (URISyntaxException ex) {
            throw new DecibelException(ex.getMessage());
        } 
    }

    private static String readAll(Reader rd) throws IOException 
    {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
          sb.append((char) cp);
        }
        return sb.toString();
    }
}
