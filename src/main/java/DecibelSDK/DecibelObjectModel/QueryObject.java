package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class QueryObject { 
    private Language languageField;

    /**
     * @return the Language
     */
    public Language getLanguage() {
        return languageField;
    }

    /**
     * @param language the Language to set
     */
    public void setLanguage(Language language) {
        this.languageField = language;
    }

}
