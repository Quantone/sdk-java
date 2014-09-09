package DecibelSDK.DecibelObjectModel;

import java.util.List;

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
