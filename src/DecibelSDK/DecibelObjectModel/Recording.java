package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class Recording extends DecibelEntity { 
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

    private String originalAlbumTitleField;

    /**
     * @return the OriginalAlbumTitle
     */
    public String getOriginalAlbumTitle() {
        return originalAlbumTitleField;
    }

    /**
     * @param originalAlbumTitle the OriginalAlbumTitle to set
     */
    public void setOriginalAlbumTitle(String originalAlbumTitle) {
        this.originalAlbumTitleField = originalAlbumTitle;
    }

    private String originalAlbumIdField;

    /**
     * @return the OriginalAlbumId
     */
    public String getOriginalAlbumId() {
        return originalAlbumIdField;
    }

    /**
     * @param originalAlbumId the OriginalAlbumId to set
     */
    public void setOriginalAlbumId(String originalAlbumId) {
        this.originalAlbumIdField = originalAlbumId;
    }

    private Integer albumSequenceField;

    /**
     * @return the AlbumSequence
     */
    public Integer getAlbumSequence() {
        return albumSequenceField;
    }

    /**
     * @param albumSequence the AlbumSequence to set
     */
    public void setAlbumSequence(Integer albumSequence) {
        this.albumSequenceField = albumSequence;
    }

    private double durationField;

    /**
     * @return the Duration
     */
    public double getDuration() {
        return durationField;
    }

    /**
     * @param duration the Duration to set
     */
    public void setDuration(double duration) {
        this.durationField = duration;
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

    private boolean isConcertField;

    /**
     * @return the IsConcert
     */
    public boolean getIsConcert() {
        return isConcertField;
    }

    /**
     * @param isConcert the IsConcert to set
     */
    public void setIsConcert(boolean isConcert) {
        this.isConcertField = isConcert;
    }

    private double beatsPerMinuteField;

    /**
     * @return the BeatsPerMinute
     */
    public double getBeatsPerMinute() {
        return beatsPerMinuteField;
    }

    /**
     * @param beatsPerMinute the BeatsPerMinute to set
     */
    public void setBeatsPerMinute(double beatsPerMinute) {
        this.beatsPerMinuteField = beatsPerMinute;
    }

    private String mainArtistsLiteralField;

    /**
     * @return the MainArtistsLiteral
     */
    public String getMainArtistsLiteral() {
        return mainArtistsLiteralField;
    }

    /**
     * @param mainArtistsLiteral the MainArtistsLiteral to set
     */
    public void setMainArtistsLiteral(String mainArtistsLiteral) {
        this.mainArtistsLiteralField = mainArtistsLiteral;
    }

    private String featuredArtistsLiteralField;

    /**
     * @return the FeaturedArtistsLiteral
     */
    public String getFeaturedArtistsLiteral() {
        return featuredArtistsLiteralField;
    }

    /**
     * @param featuredArtistsLiteral the FeaturedArtistsLiteral to set
     */
    public void setFeaturedArtistsLiteral(String featuredArtistsLiteral) {
        this.featuredArtistsLiteralField = featuredArtistsLiteral;
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

    private List<Work> worksField;

    /**
     * @return the Works
     */
    public List<Work> getWorks() {
        return worksField;
    }

    /**
     * @param works the Works to set
     */
    public void setWorks(List<Work> works) {
        this.worksField = works;
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

    private List<MusicKey> musicalKeysField;

    /**
     * @return the MusicalKeys
     */
    public List<MusicKey> getMusicalKeys() {
        return musicalKeysField;
    }

    /**
     * @param musicalKeys the MusicalKeys to set
     */
    public void setMusicalKeys(List<MusicKey> musicalKeys) {
        this.musicalKeysField = musicalKeys;
    }

    private List<ProductionEvent> productionEventsField;

    /**
     * @return the ProductionEvents
     */
    public List<ProductionEvent> getProductionEvents() {
        return productionEventsField;
    }

    /**
     * @param productionEvents the ProductionEvents to set
     */
    public void setProductionEvents(List<ProductionEvent> productionEvents) {
        this.productionEventsField = productionEvents;
    }

}
