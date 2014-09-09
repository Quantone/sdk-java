package DecibelSDK;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.commons.io.IOUtils;

public class QueryBuilder {
    
    /**
     * Build a query string for the given query object
     * 
     * @param <T> The type of query object
     * @param queryObject The object itself
     * @return A query string which can then be used in the RunQuery method
     * @throws URISyntaxException 
     */
    public static <T> URI buildQuery(T queryObject) throws URISyntaxException{
        String topic = ""; // TODO: add topics dictionary
        
        // Create the base of the query string
        StringBuilder queryString = new StringBuilder(InternalUtilities.BASEURL);
        queryString.append(topic);
        
        // Find all the properties that belong to the query object
        Field[] properties = queryObject.getClass().getFields();
        
        // Get the name and value for each property
        for(Field property : properties){
            if("Xml".equals(property.getName())) continue;
            String propName = property.getName();
            Object propValue = null;
            try {
                propValue = property.get(queryObject);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(QueryBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Only add the property to the query if it has been set
            if(InternalUtilities.isZeroOrNull(propValue)) continue;
            // If property is an array - TODO: is this a ok check?
            if(propValue.toString().contains("[]")){
                queryString.append(propName).append("=");
                for(Object item : (List<Object>)propValue)
                    queryString.append(item).append(";");
                queryString.append("&");
            }
            else{
                queryString.append(propName).append("=").append(propValue).append("&");
            }
        }
        
        // Remove the trailing & if one exists and return the query string
        return new URI(InternalUtilities.trimEnd(queryString.toString(), '&'));
    }
    
    /**
     * Run a query against the Decibel API
     * 
     * @param <T> The type of return object expected
     * @param query The query to run
     * @param xml Whether the return the data as xml, false by default
     * @return A result object, containing the results of the query. A error handler if something went wrong
     */
    public static <T> Object runQuery(URI query, boolean xml){
        try{
            if(query == null)
                return null;
            
            // Create a new WebClient to make the query and add the necessary headers
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet client = new HttpGet(query);
            InternalUtilities.SetDecibelRequestHeaders(client, DecibelUtilities.getAppId(), DecibelUtilities.getAppkey());
            // If user asked for xml, add a request header for it
            if(xml)
                client.addHeader("accept", "application/xml");
            
            // Download the response
            CloseableHttpResponse response = httpClient.execute(client);
            try{
                // Get the content stream from the response and save it to a string
                HttpEntity entity = response.getEntity();
                String result = IOUtils.toString(entity.getContent());
                
                // Attempt to deserialise the response to type T
                if(xml){
                    Object resObj = InternalUtilities.deserializeXmlString(result);
                    return resObj;
                }else{
                    // TODO: add Json deserialiser
                    Object resObj = InternalUtilities.deserializeXmlString(result);
                    return resObj;
                }
            }finally{
                response.close();
            }
        }catch (IOException ex){
            // If something went wrong downloading the result string, return a null object
            return new ErrorHandler("An error occurred when querying the Decibel API: " + ex.getMessage());
        }
    }
}
