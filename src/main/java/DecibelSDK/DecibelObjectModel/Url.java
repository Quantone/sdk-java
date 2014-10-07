package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Url extends DecibelEntity { 
    private String addressField;

    /**
     * @return the Address
     */
    public String getAddress() {
        return addressField;
    }

    /**
     * @param address the Address to set
     */
    public void setAddress(String address) {
        this.addressField = address;
    }

    private WebsiteName websiteField;

    /**
     * @return the Website
     */
    public WebsiteName getWebsite() {
        return websiteField;
    }

    /**
     * @param website the Website to set
     */
    public void setWebsite(WebsiteName website) {
        this.websiteField = website;
    }

}
