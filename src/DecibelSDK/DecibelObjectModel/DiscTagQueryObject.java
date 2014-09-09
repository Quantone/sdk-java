package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class DiscTagQueryObject extends SearchQueryObject { 
    private String albumDecibelIdField;

    /**
     * @return the AlbumDecibelId
     */
    public String getAlbumDecibelId() {
        return albumDecibelIdField;
    }

    /**
     * @param albumDecibelId the AlbumDecibelId to set
     */
    public void setAlbumDecibelId(String albumDecibelId) {
        this.albumDecibelIdField = albumDecibelId;
    }

    private String mediumDecibelIdField;

    /**
     * @return the MediumDecibelId
     */
    public String getMediumDecibelId() {
        return mediumDecibelIdField;
    }

    /**
     * @param mediumDecibelId the MediumDecibelId to set
     */
    public void setMediumDecibelId(String mediumDecibelId) {
        this.mediumDecibelIdField = mediumDecibelId;
    }

    private String checksumField;

    /**
     * @return the Checksum
     */
    public String getChecksum() {
        return checksumField;
    }

    /**
     * @param checksum the Checksum to set
     */
    public void setChecksum(String checksum) {
        this.checksumField = checksum;
    }

    private String albumSpotifyUriField;

    /**
     * @return the AlbumSpotifyUri
     */
    public String getAlbumSpotifyUri() {
        return albumSpotifyUriField;
    }

    /**
     * @param albumSpotifyUri the AlbumSpotifyUri to set
     */
    public void setAlbumSpotifyUri(String albumSpotifyUri) {
        this.albumSpotifyUriField = albumSpotifyUri;
    }

}
