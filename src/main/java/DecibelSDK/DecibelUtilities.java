package DecibelSDK;

public class DecibelUtilities {
    
    private static String appKey;
    private static String appId;

    /**
     * @return Your Decibel App Key
     */
    public static String getAppkey() {
        return appKey;
    }

    /**
     * @return Your Decibel App Id
     */
    public static String getAppId() {
        return appId;
    }
    
    /**
     * Set your Decibel App Key and Id. This must be done before any query can be run
     * 
     * @param yourAppId Your Decibel App Id
     * @param  yourAppKey Your Decibel App Key
     */
    public static void SetKeys(String yourAppId, String yourAppKey){
        appId = yourAppId;
        appKey = yourAppKey;
    }
}
