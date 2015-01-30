package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnnotationReference extends DecibelEntity{
    private Integer referenceNumber;

    /**
     * @return the ReferenceNumber
     */
    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * @param referenceNumber the ReferenceNumber to set
     */
    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    private String displayText;

    /**
     * @return the DisplayText
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * @param displayText the DisplayText to set
     */
    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    private String decibelId;

    /**
     * @return the DecibelId
     */
    public String getDecibelId() {
        return decibelId;
    }

    /**
     * @param decibelId the DecibelId to set
     */
    public void setDecibelId(String decibelId) {
        this.decibelId = decibelId;
    }

    private DecibelType decibelType;

    /**
     * @return the DecibelType
     */
    public DecibelType getDecibelType() {
        return decibelType;
    }

    /**
     * @param decibelType the DecibelType to set
     */
    public void setDecibelType(DecibelType decibelType) {
        this.decibelType = decibelType;
    }

}
