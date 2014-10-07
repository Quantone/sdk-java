package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Activity extends DecibelEntity { 
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

    private Probability probabilityField;

    /**
     * @return the Probability
     */
    public Probability getProbability() {
        return probabilityField;
    }

    /**
     * @param probability the Probability to set
     */
    public void setProbability(Probability probability) {
        this.probabilityField = probability;
    }

}
