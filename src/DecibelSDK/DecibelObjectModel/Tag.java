package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class Tag extends DecibelEntity { 
    private String nameField;

    /**
     * @return the Name
     */
    public String getName() {
        return nameField;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) {
        this.nameField = name;
    }

}
