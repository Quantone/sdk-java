package DecibelSDK.DecibelObjectModel;

import java.util.List;

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
