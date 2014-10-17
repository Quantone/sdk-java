package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiscTagsQueryObject extends SearchQueryObject{
    private String albumDecibelId;

    /**
     * @return the AlbumDecibelId
     */
    public String getAlbumDecibelId() {
        return albumDecibelId;
    }

    /**
     * @param albumDecibelId the AlbumDecibelId to set
     */
    public void setAlbumDecibelId(String albumDecibelId) {
        this.albumDecibelId = albumDecibelId;
    }

    private String mediumDecibelId;

    /**
     * @return the MediumDecibelId
     */
    public String getMediumDecibelId() {
        return mediumDecibelId;
    }

    /**
     * @param mediumDecibelId the MediumDecibelId to set
     */
    public void setMediumDecibelId(String mediumDecibelId) {
        this.mediumDecibelId = mediumDecibelId;
    }

    private String checksum;

    /**
     * @return the Checksum
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * @param checksum the Checksum to set
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    private String albumSpotifyUri;

    /**
     * @return the AlbumSpotifyUri
     */
    public String getAlbumSpotifyUri() {
        return albumSpotifyUri;
    }

    /**
     * @param albumSpotifyUri the AlbumSpotifyUri to set
     */
    public void setAlbumSpotifyUri(String albumSpotifyUri) {
        this.albumSpotifyUri = albumSpotifyUri;
    }

}
