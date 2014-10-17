package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Identifier<TIdentifierType> extends DecibelEntity{
    private TIdentifierType identifierType;

    /**
     * @return the IdentifierType
     */
    public TIdentifierType getIdentifierType() {
        return identifierType;
    }

    /**
     * @param identifierType the IdentifierType to set
     */
    public void setIdentifierType(TIdentifierType identifierType) {
        this.identifierType = identifierType;
    }

    private String value;

    /**
     * @return the Value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the Value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    private String additionalInformation;

    /**
     * @return the AdditionalInformation
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * @param additionalInformation the AdditionalInformation to set
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

}
