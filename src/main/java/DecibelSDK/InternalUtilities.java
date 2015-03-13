package DecibelSDK;

import java.net.URLConnection;

public class InternalUtilities {
    public static final String BASEURL = "http://localhost:8080/v3/";  //"https://rest.decibel.net/v3/";
    
    /**
     * Sets the HttpGet request headers
     * 
     * @param urlConn The URLConnection object
     * @param appId Decibel Application ID
     * @param appKey Decibel Application Key
     */
    public static void SetDecibelRequestHeaders(URLConnection urlConn, String appId, String appKey){
        urlConn.setRequestProperty("DecibelAppId", appId);
        urlConn.setRequestProperty("DecibelAppKey", appKey);     
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
