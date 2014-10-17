package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Annotation extends DecibelEntity{
    private String text;

    /**
     * @return the Text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the Text to set
     */
    public void setText(String text) {
        this.text = text;
    }

}
