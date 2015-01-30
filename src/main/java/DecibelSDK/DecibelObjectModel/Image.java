package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Image extends DecibelEntity{
    private byte[] rawData;

    /**
     * @return the RawData
     */
    public byte[] getRawData() {
        return rawData;
    }

    /**
     * @param rawData the RawData to set
     */
    public void setRawData(byte[] rawData) {
        this.rawData = rawData;
    }

    private ImageSize size;

    /**
     * @return the Size
     */
    public ImageSize getSize() {
        return size;
    }

    /**
     * @param size the Size to set
     */
    public void setSize(ImageSize size) {
        this.size = size;
    }

    private String contentType;

    /**
     * @return the ContentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType the ContentType to set
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    private String id;

    /**
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

}
