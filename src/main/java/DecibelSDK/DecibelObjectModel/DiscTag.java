package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiscTag extends DecibelEntity{
    private FileTag[] fileTags;

    /**
     * @return the FileTags
     */
    public FileTag[] getFileTags() {
        return fileTags;
    }

    /**
     * @param fileTags the FileTags to set
     */
    public void setFileTags(FileTag[] fileTags) {
        this.fileTags = fileTags;
    }

}
