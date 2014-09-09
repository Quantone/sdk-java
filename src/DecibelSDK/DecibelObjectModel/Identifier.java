package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class Identifier extends DecibelEntity { 
    private String identifierTypeField;

    /**
     * @return the IdentifierType
     */
    public String getIdentifierType() {
        return identifierTypeField;
    }

    /**
     * @param identifierType the IdentifierType to set
     */
    public void setIdentifierType(String identifierType) {
        this.identifierTypeField = identifierType;
    }

    private String valueField;

    /**
     * @return the Value
     */
    public String getValue() {
        return valueField;
    }

    /**
     * @param value the Value to set
     */
    public void setValue(String value) {
        this.valueField = value;
    }

}
