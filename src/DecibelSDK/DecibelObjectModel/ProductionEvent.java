package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class ProductionEvent extends DecibelEntity { 
    private boolean isRecordingField;

    /**
     * @return the IsRecording
     */
    public boolean getIsRecording() {
        return isRecordingField;
    }

    /**
     * @param isRecording the IsRecording to set
     */
    public void setIsRecording(boolean isRecording) {
        this.isRecordingField = isRecording;
    }

    private boolean isMixingField;

    /**
     * @return the IsMixing
     */
    public boolean getIsMixing() {
        return isMixingField;
    }

    /**
     * @param isMixing the IsMixing to set
     */
    public void setIsMixing(boolean isMixing) {
        this.isMixingField = isMixing;
    }

    private boolean isMasteringField;

    /**
     * @return the IsMastering
     */
    public boolean getIsMastering() {
        return isMasteringField;
    }

    /**
     * @param isMastering the IsMastering to set
     */
    public void setIsMastering(boolean isMastering) {
        this.isMasteringField = isMastering;
    }

    private boolean isRemasteringField;

    /**
     * @return the IsRemastering
     */
    public boolean getIsRemastering() {
        return isRemasteringField;
    }

    /**
     * @param isRemastering the IsRemastering to set
     */
    public void setIsRemastering(boolean isRemastering) {
        this.isRemasteringField = isRemastering;
    }

    private String dateField;

    /**
     * @return the Date
     */
    public String getDate() {
        return dateField;
    }

    /**
     * @param date the Date to set
     */
    public void setDate(String date) {
        this.dateField = date;
    }

    private String locationField;

    /**
     * @return the Location
     */
    public String getLocation() {
        return locationField;
    }

    /**
     * @param location the Location to set
     */
    public void setLocation(String location) {
        this.locationField = location;
    }

}
