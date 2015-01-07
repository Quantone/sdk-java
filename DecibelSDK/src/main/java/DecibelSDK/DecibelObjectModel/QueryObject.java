package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class QueryObject{
    private Language language;

    /**
     * @return the Language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @param language the Language to set
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

}
