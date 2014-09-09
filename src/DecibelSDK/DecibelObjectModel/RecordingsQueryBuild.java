package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class RecordingsQueryBuild { 
    private String[] artistField;

    /**
     * @return the Artist
     */
    public String[] getArtist() {
        return artistField;
    }

    /**
     * @param artist the Artist to set
     */
    public void setArtist(String[] artist) {
        this.artistField = artist;
    }

    private String[] artistNameField;

    /**
     * @return the ArtistName
     */
    public String[] getArtistName() {
        return artistNameField;
    }

    /**
     * @param artistName the ArtistName to set
     */
    public void setArtistName(String[] artistName) {
        this.artistNameField = artistName;
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

    private String[] composerField;

    /**
     * @return the Composer
     */
    public String[] getComposer() {
        return composerField;
    }

    /**
     * @param composer the Composer to set
     */
    public void setComposer(String[] composer) {
        this.composerField = composer;
    }

    private String[] participantField;

    /**
     * @return the Participant
     */
    public String[] getParticipant() {
        return participantField;
    }

    /**
     * @param participant the Participant to set
     */
    public void setParticipant(String[] participant) {
        this.participantField = participant;
    }

    private double minSecondsField;

    /**
     * @return the MinSeconds
     */
    public double getMinSeconds() {
        return minSecondsField;
    }

    /**
     * @param minSeconds the MinSeconds to set
     */
    public void setMinSeconds(double minSeconds) {
        this.minSecondsField = minSeconds;
    }

    private double maxSecondsField;

    /**
     * @return the MaxSeconds
     */
    public double getMaxSeconds() {
        return maxSecondsField;
    }

    /**
     * @param maxSeconds the MaxSeconds to set
     */
    public void setMaxSeconds(double maxSeconds) {
        this.maxSecondsField = maxSeconds;
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

    private RecordingSearchType titleSearchTypeField;

    /**
     * @return the TitleSearchType
     */
    public RecordingSearchType getTitleSearchType() {
        return titleSearchTypeField;
    }

    /**
     * @param titleSearchType the TitleSearchType to set
     */
    public void setTitleSearchType(RecordingSearchType titleSearchType) {
        this.titleSearchTypeField = titleSearchType;
    }

    private String titleIdTypeField;

    /**
     * @return the TitleIdType
     */
    public String getTitleIdType() {
        return titleIdTypeField;
    }

    /**
     * @param titleIdType the TitleIdType to set
     */
    public void setTitleIdType(String titleIdType) {
        this.titleIdTypeField = titleIdType;
    }

    private ArtistSearchType artistSearchTypeField;

    /**
     * @return the ArtistSearchType
     */
    public ArtistSearchType getArtistSearchType() {
        return artistSearchTypeField;
    }

    /**
     * @param artistSearchType the ArtistSearchType to set
     */
    public void setArtistSearchType(ArtistSearchType artistSearchType) {
        this.artistSearchTypeField = artistSearchType;
    }

    private String artistIdTypeField;

    /**
     * @return the ArtistIdType
     */
    public String getArtistIdType() {
        return artistIdTypeField;
    }

    /**
     * @param artistIdType the ArtistIdType to set
     */
    public void setArtistIdType(String artistIdType) {
        this.artistIdTypeField = artistIdType;
    }

    private ArtistSearchType composerSearchTypeField;

    /**
     * @return the ComposerSearchType
     */
    public ArtistSearchType getComposerSearchType() {
        return composerSearchTypeField;
    }

    /**
     * @param composerSearchType the ComposerSearchType to set
     */
    public void setComposerSearchType(ArtistSearchType composerSearchType) {
        this.composerSearchTypeField = composerSearchType;
    }

    private String composerIdTypeField;

    /**
     * @return the ComposerIdType
     */
    public String getComposerIdType() {
        return composerIdTypeField;
    }

    /**
     * @param composerIdType the ComposerIdType to set
     */
    public void setComposerIdType(String composerIdType) {
        this.composerIdTypeField = composerIdType;
    }

    private ArtistSearchType participantSearchTypeField;

    /**
     * @return the ParticipantSearchType
     */
    public ArtistSearchType getParticipantSearchType() {
        return participantSearchTypeField;
    }

    /**
     * @param participantSearchType the ParticipantSearchType to set
     */
    public void setParticipantSearchType(ArtistSearchType participantSearchType) {
        this.participantSearchTypeField = participantSearchType;
    }

    private String participantIdTypeField;

    /**
     * @return the ParticipantIdType
     */
    public String getParticipantIdType() {
        return participantIdTypeField;
    }

    /**
     * @param participantIdType the ParticipantIdType to set
     */
    public void setParticipantIdType(String participantIdType) {
        this.participantIdTypeField = participantIdType;
    }

    private String dateProducedField;

    /**
     * @return the DateProduced
     */
    public String getDateProduced() {
        return dateProducedField;
    }

    /**
     * @param dateProduced the DateProduced to set
     */
    public void setDateProduced(String dateProduced) {
        this.dateProducedField = dateProduced;
    }

    private String orderByField;

    /**
     * @return the OrderBy
     */
    public String getOrderBy() {
        return orderByField;
    }

    /**
     * @param orderBy the OrderBy to set
     */
    public void setOrderBy(String orderBy) {
        this.orderByField = orderBy;
    }

    private RecordingRetrievalDepth[] depthField;

    /**
     * @return the Depth
     */
    public RecordingRetrievalDepth[] getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(RecordingRetrievalDepth[] depth) {
        this.depthField = depth;
    }

    private Integer pageNumberField;

    /**
     * @return the PageNumber
     */
    public Integer getPageNumber() {
        return pageNumberField;
    }

    /**
     * @param pageNumber the PageNumber to set
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumberField = pageNumber;
    }

    private Integer pageSizeField;

    /**
     * @return the PageSize
     */
    public Integer getPageSize() {
        return pageSizeField;
    }

    /**
     * @param pageSize the PageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSizeField = pageSize;
    }

}
