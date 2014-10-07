package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Album extends DecibelEntity { 
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

    private String titleField;

    /**
     * @return the Title
     */
    public String getTitle() {
        return titleField;
    }

    /**
     * @param title the Title to set
     */
    public void setTitle(String title) {
        this.titleField = title;
    }

    private String artistsLiteralField;

    /**
     * @return the ArtistsLiteral
     */
    public String getArtistsLiteral() {
        return artistsLiteralField;
    }

    /**
     * @param artistsLiteral the ArtistsLiteral to set
     */
    public void setArtistsLiteral(String artistsLiteral) {
        this.artistsLiteralField = artistsLiteral;
    }

    private List<Artist> artistsField;

    /**
     * @return the Artists
     */
    public List<Artist> getArtists() {
        return artistsField;
    }

    /**
     * @param artists the Artists to set
     */
    public void setArtists(List<Artist> artists) {
        this.artistsField = artists;
    }

    private String originalReleaseDateField;

    /**
     * @return the OriginalReleaseDate
     */
    public String getOriginalReleaseDate() {
        return originalReleaseDateField;
    }

    /**
     * @param originalReleaseDate the OriginalReleaseDate to set
     */
    public void setOriginalReleaseDate(String originalReleaseDate) {
        this.originalReleaseDateField = originalReleaseDate;
    }

    private ContentFormat formatField;

    /**
     * @return the Format
     */
    public ContentFormat getFormat() {
        return formatField;
    }

    /**
     * @param format the Format to set
     */
    public void setFormat(ContentFormat format) {
        this.formatField = format;
    }

    private boolean isLiveField;

    /**
     * @return the IsLive
     */
    public boolean getIsLive() {
        return isLiveField;
    }

    /**
     * @param isLive the IsLive to set
     */
    public void setIsLive(boolean isLive) {
        this.isLiveField = isLive;
    }

    private boolean isUnofficialField;

    /**
     * @return the IsUnofficial
     */
    public boolean getIsUnofficial() {
        return isUnofficialField;
    }

    /**
     * @param isUnofficial the IsUnofficial to set
     */
    public void setIsUnofficial(boolean isUnofficial) {
        this.isUnofficialField = isUnofficial;
    }

    private List<Genre> genresField;

    /**
     * @return the Genres
     */
    public List<Genre> getGenres() {
        return genresField;
    }

    /**
     * @param genres the Genres to set
     */
    public void setGenres(List<Genre> genres) {
        this.genresField = genres;
    }

    private String imageIdField;

    /**
     * @return the ImageId
     */
    public String getImageId() {
        return imageIdField;
    }

    /**
     * @param imageId the ImageId to set
     */
    public void setImageId(String imageId) {
        this.imageIdField = imageId;
    }

    private List<Participation> participationsField;

    /**
     * @return the Participations
     */
    public List<Participation> getParticipations() {
        return participationsField;
    }

    /**
     * @param participations the Participations to set
     */
    public void setParticipations(List<Participation> participations) {
        this.participationsField = participations;
    }

    private List<Identifier> identifiersField;

    /**
     * @return the Identifiers
     */
    public List<Identifier> getIdentifiers() {
        return identifiersField;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiersField = identifiers;
    }

    private List<Recording> recordingsField;

    /**
     * @return the Recordings
     */
    public List<Recording> getRecordings() {
        return recordingsField;
    }

    /**
     * @param recordings the Recordings to set
     */
    public void setRecordings(List<Recording> recordings) {
        this.recordingsField = recordings;
    }

    private List<Release> releasesField;

    /**
     * @return the Releases
     */
    public List<Release> getReleases() {
        return releasesField;
    }

    /**
     * @param releases the Releases to set
     */
    public void setReleases(List<Release> releases) {
        this.releasesField = releases;
    }

}
