package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebAddress extends DecibelEntity{
    private String address;

    /**
     * @return the Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the Address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    private String website;

    /**
     * @return the Website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the Website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

}
