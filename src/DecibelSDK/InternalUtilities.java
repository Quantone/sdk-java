package DecibelSDK;

import com.thoughtworks.xstream.XStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.JAXBException;
import org.apache.http.client.methods.HttpGet;

class InternalUtilities {
    public static final String BASEURL = "";
    
    /**
     * Sets the WebClient request headers
     * 
     * @param client The WebClient object
     * @param appId Decibel Application ID
     * @param appKey Decibel Application Key
     */
    public static void SetDecibelRequestHeaders(HttpGet client, String appId, String appKey){
        client.addHeader("DecibelAppId", appId);
        client.addHeader("DecibelAppKey", appKey);
        client.addHeader("DecibelTimestamp", new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date()));
    }
    
    /**
     * Deserialize an XML string into an object of type T
     * 
     * @param <T> The type of object to deserializes to
     * @param resultClass
     * @param str The XML string
     * @return
     * @throws JAXBException 
     */
    public static <T> T deserializeXmlString(String str) {
        
        XStream parser = new XStream();
        
        return (T)parser.fromXML(str);
        /* OLD CODE:
        // Convert result string to InputSource
        InputSource is = new InputSource(new StringReader(str));
        // Create a empty class of type T
        Class<T> resultClass;
        Object resultInstance = resultClass.newInstance();
        // Create a JAXB context and unmarshaller
        JAXBContext context = JAXBContext.newInstance(resultInstance);
        Unmarshaller handler = context.createUnmarshaller();

        // Deserialize the XML stream 
        return (T) handler.unmarshal(is);
        */
    }
    
    /**
     * Deserialize a JSON string to an object of type T
     * 
     * @param <T> The type of object
     * @param resultClass
     * @param str The JSON string
     * @return The object representation of the JSON
     */
    public static <T> T deserializeJsonString(Class<T> resultClass, String str){
        return null;
    }   
    
    /**
     * Check if a object is 0, null or empty
     * 
     * @param obj The object to check
     * @return True if 0 or null, false if not
     */
    public static boolean isZeroOrNull(Object obj){
        if(obj == null)
            return true;
        if(obj.equals(0) || obj.equals(""))
            return true;
        
        return false;
    }
    
    /**
   * Trim specified character from end of string. 
   * From: www.java2s.com/Code/Java/Data-Type/Trimspecifiedcharcaterfromendofstring.htm
   * 
   * @param text Text
   * @param character Character to remove
   * @return Trimmed text
   */
  public static String trimEnd(String text, char character) {
    String normalizedText;
    int index;

    if (isZeroOrNull(text)) {
      return text;
    }

    normalizedText = text.trim();
    index = normalizedText.length() - 1;

    while (normalizedText.charAt(index) == character) {
      if (--index < 0) {
        return "";
      }
    }
    return normalizedText.substring(0, index + 1).trim();
  }
}
