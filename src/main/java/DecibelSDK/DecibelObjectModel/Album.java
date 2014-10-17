package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Album extends DecibelEntity{
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

    private String title;

    /**
     * @return the Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the Title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    private String artistsLiteral;

    /**
     * @return the ArtistsLiteral
     */
    public String getArtistsLiteral() {
        return artistsLiteral;
    }

    /**
     * @param artistsLiteral the ArtistsLiteral to set
     */
    public void setArtistsLiteral(String artistsLiteral) {
        this.artistsLiteral = artistsLiteral;
    }

    private Artist[] artists;

    /**
     * @return the Artists
     */
    public Artist[] getArtists() {
        return artists;
    }

    /**
     * @param artists the Artists to set
     */
    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

    private String originalReleaseDate;

    /**
     * @return the OriginalReleaseDate
     */
    public String getOriginalReleaseDate() {
        return originalReleaseDate;
    }

    /**
     * @param originalReleaseDate the OriginalReleaseDate to set
     */
    public void setOriginalReleaseDate(String originalReleaseDate) {
        this.originalReleaseDate = originalReleaseDate;
    }

    private ContentFormat format;

    /**
     * @return the Format
     */
    public ContentFormat getFormat() {
        return format;
    }

    /**
     * @param format the Format to set
     */
    public void setFormat(ContentFormat format) {
        this.format = format;
    }

    private Boolean isLive;

    /**
     * @return the IsLive
     */
    public Boolean getIsLive() {
        return isLive;
    }

    /**
     * @param isLive the IsLive to set
     */
    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    private Boolean isUnofficial;

    /**
     * @return the IsUnofficial
     */
    public Boolean getIsUnofficial() {
        return isUnofficial;
    }

    /**
     * @param isUnofficial the IsUnofficial to set
     */
    public void setIsUnofficial(Boolean isUnofficial) {
        this.isUnofficial = isUnofficial;
    }

    private Genre[] genres;

    /**
     * @return the Genres
     */
    public Genre[] getGenres() {
        return genres;
    }

    /**
     * @param genres the Genres to set
     */
    public void setGenres(Genre[] genres) {
        this.genres = genres;
    }

    private String imageId;

    /**
     * @return the ImageId
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * @param imageId the ImageId to set
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    private Participation[] participations;

    /**
     * @return the Participations
     */
    public Participation[] getParticipations() {
        return participations;
    }

    /**
     * @param participations the Participations to set
     */
    public void setParticipations(Participation[] participations) {
        this.participations = participations;
    }

    private AlbumIdentifier[] identifiers;

    /**
     * @return the Identifiers
     */
    public AlbumIdentifier[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(AlbumIdentifier[] identifiers) {
        this.identifiers = identifiers;
    }

    private Recording[] recordings;

    /**
     * @return the Recordings
     */
    public Recording[] getRecordings() {
        return recordings;
    }

    /**
     * @param recordings the Recordings to set
     */
    public void setRecordings(Recording[] recordings) {
        this.recordings = recordings;
    }

    private Release[] releases;

    /**
     * @return the Releases
     */
    public Release[] getReleases() {
        return releases;
    }

    /**
     * @param releases the Releases to set
     */
    public void setReleases(Release[] releases) {
        this.releases = releases;
    }

}
