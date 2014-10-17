package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductionEvent extends DecibelEntity{
    private Boolean isRecording;

    /**
     * @return the IsRecording
     */
    public Boolean getIsRecording() {
        return isRecording;
    }

    /**
     * @param isRecording the IsRecording to set
     */
    public void setIsRecording(Boolean isRecording) {
        this.isRecording = isRecording;
    }

    private Boolean isMixing;

    /**
     * @return the IsMixing
     */
    public Boolean getIsMixing() {
        return isMixing;
    }

    /**
     * @param isMixing the IsMixing to set
     */
    public void setIsMixing(Boolean isMixing) {
        this.isMixing = isMixing;
    }

    private Boolean isMastering;

    /**
     * @return the IsMastering
     */
    public Boolean getIsMastering() {
        return isMastering;
    }

    /**
     * @param isMastering the IsMastering to set
     */
    public void setIsMastering(Boolean isMastering) {
        this.isMastering = isMastering;
    }

    private Boolean isRemastering;

    /**
     * @return the IsRemastering
     */
    public Boolean getIsRemastering() {
        return isRemastering;
    }

    /**
     * @param isRemastering the IsRemastering to set
     */
    public void setIsRemastering(Boolean isRemastering) {
        this.isRemastering = isRemastering;
    }

    private String date;

    /**
     * @return the Date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the Date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    private Location[] locations;

    /**
     * @return the Locations
     */
    public Location[] getLocations() {
        return locations;
    }

    /**
     * @param locations the Locations to set
     */
    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

}
