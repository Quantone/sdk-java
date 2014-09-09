package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleImageBuild { 
    private String idField;

    /**
     * @return the Id
     */
    public String getId() {
        return idField;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.idField = id;
    }

    private String imageTypeField;

    /**
     * @return the ImageType
     */
    public String getImageType() {
        return imageTypeField;
    }

    /**
     * @param imageType the ImageType to set
     */
    public void setImageType(String imageType) {
        this.imageTypeField = imageType;
    }

}
