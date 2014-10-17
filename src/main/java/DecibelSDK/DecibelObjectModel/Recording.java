package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recording extends DecibelEntity{
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

    private String addenda;

    /**
     * @return the Addenda
     */
    public String getAddenda() {
        return addenda;
    }

    /**
     * @param addenda the Addenda to set
     */
    public void setAddenda(String addenda) {
        this.addenda = addenda;
    }

    private String originalAlbumTitle;

    /**
     * @return the OriginalAlbumTitle
     */
    public String getOriginalAlbumTitle() {
        return originalAlbumTitle;
    }

    /**
     * @param originalAlbumTitle the OriginalAlbumTitle to set
     */
    public void setOriginalAlbumTitle(String originalAlbumTitle) {
        this.originalAlbumTitle = originalAlbumTitle;
    }

    private String originalAlbumId;

    /**
     * @return the OriginalAlbumId
     */
    public String getOriginalAlbumId() {
        return originalAlbumId;
    }

    /**
     * @param originalAlbumId the OriginalAlbumId to set
     */
    public void setOriginalAlbumId(String originalAlbumId) {
        this.originalAlbumId = originalAlbumId;
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

    private Integer albumSequence;

    /**
     * @return the AlbumSequence
     */
    public Integer getAlbumSequence() {
        return albumSequence;
    }

    /**
     * @param albumSequence the AlbumSequence to set
     */
    public void setAlbumSequence(Integer albumSequence) {
        this.albumSequence = albumSequence;
    }

    private Double duration;

    /**
     * @return the Duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * @param duration the Duration to set
     */
    public void setDuration(Double duration) {
        this.duration = duration;
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

    private Boolean isConcert;

    /**
     * @return the IsConcert
     */
    public Boolean getIsConcert() {
        return isConcert;
    }

    /**
     * @param isConcert the IsConcert to set
     */
    public void setIsConcert(Boolean isConcert) {
        this.isConcert = isConcert;
    }

    private Double beatsPerMinute;

    /**
     * @return the BeatsPerMinute
     */
    public Double getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     * @param beatsPerMinute the BeatsPerMinute to set
     */
    public void setBeatsPerMinute(Double beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    private String mainArtistsLiteral;

    /**
     * @return the MainArtistsLiteral
     */
    public String getMainArtistsLiteral() {
        return mainArtistsLiteral;
    }

    /**
     * @param mainArtistsLiteral the MainArtistsLiteral to set
     */
    public void setMainArtistsLiteral(String mainArtistsLiteral) {
        this.mainArtistsLiteral = mainArtistsLiteral;
    }

    private String featuredArtistsLiteral;

    /**
     * @return the FeaturedArtistsLiteral
     */
    public String getFeaturedArtistsLiteral() {
        return featuredArtistsLiteral;
    }

    /**
     * @param featuredArtistsLiteral the FeaturedArtistsLiteral to set
     */
    public void setFeaturedArtistsLiteral(String featuredArtistsLiteral) {
        this.featuredArtistsLiteral = featuredArtistsLiteral;
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

    private Work[] works;

    /**
     * @return the Works
     */
    public Work[] getWorks() {
        return works;
    }

    /**
     * @param works the Works to set
     */
    public void setWorks(Work[] works) {
        this.works = works;
    }

    private RecordingIdentifier[] identifiers;

    /**
     * @return the Identifiers
     */
    public RecordingIdentifier[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(RecordingIdentifier[] identifiers) {
        this.identifiers = identifiers;
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

    private MusicKey[] musicalKeys;

    /**
     * @return the MusicalKeys
     */
    public MusicKey[] getMusicalKeys() {
        return musicalKeys;
    }

    /**
     * @param musicalKeys the MusicalKeys to set
     */
    public void setMusicalKeys(MusicKey[] musicalKeys) {
        this.musicalKeys = musicalKeys;
    }

    private ProductionEvent[] productionEvents;

    /**
     * @return the ProductionEvents
     */
    public ProductionEvent[] getProductionEvents() {
        return productionEvents;
    }

    /**
     * @param productionEvents the ProductionEvents to set
     */
    public void setProductionEvents(ProductionEvent[] productionEvents) {
        this.productionEvents = productionEvents;
    }

    private Recording[] constituentRecordings;

    /**
     * @return the ConstituentRecordings
     */
    public Recording[] getConstituentRecordings() {
        return constituentRecordings;
    }

    /**
     * @param constituentRecordings the ConstituentRecordings to set
     */
    public void setConstituentRecordings(Recording[] constituentRecordings) {
        this.constituentRecordings = constituentRecordings;
    }

    private ConstituentRecordingType constituentRecordingType;

    /**
     * @return the ConstituentRecordingType
     */
    public ConstituentRecordingType getConstituentRecordingType() {
        return constituentRecordingType;
    }

    /**
     * @param constituentRecordingType the ConstituentRecordingType to set
     */
    public void setConstituentRecordingType(ConstituentRecordingType constituentRecordingType) {
        this.constituentRecordingType = constituentRecordingType;
    }

}
