package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiscTag extends DecibelEntity { 
    private List<FileTag> fileTagsField;

    /**
     * @return the FileTags
     */
    public List<FileTag> getFileTags() {
        return fileTagsField;
    }

    /**
     * @param fileTags the FileTags to set
     */
    public void setFileTags(List<FileTag> fileTags) {
        this.fileTagsField = fileTags;
    }

}
