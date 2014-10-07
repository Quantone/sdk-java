package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Annotation extends DecibelEntity { 
    private String textField;

    /**
     * @return the Text
     */
    public String getText() {
        return textField;
    }

    /**
     * @param text the Text to set
     */
    public void setText(String text) {
        this.textField = text;
    }

    private Verbosity verbosityField;

    /**
     * @return the Verbosity
     */
    public Verbosity getVerbosity() {
        return verbosityField;
    }

    /**
     * @param verbosity the Verbosity to set
     */
    public void setVerbosity(Verbosity verbosity) {
        this.verbosityField = verbosity;
    }

}
