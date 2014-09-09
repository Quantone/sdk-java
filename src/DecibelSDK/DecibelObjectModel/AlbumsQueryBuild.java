package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class AlbumsQueryBuild { 
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

    private AlbumSearchType titleSearchTypeField;

    /**
     * @return the TitleSearchType
     */
    public AlbumSearchType getTitleSearchType() {
        return titleSearchTypeField;
    }

    /**
     * @param titleSearchType the TitleSearchType to set
     */
    public void setTitleSearchType(AlbumSearchType titleSearchType) {
        this.titleSearchTypeField = titleSearchType;
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

    private String[] recordingField;

    /**
     * @return the Recording
     */
    public String[] getRecording() {
        return recordingField;
    }

    /**
     * @param recording the Recording to set
     */
    public void setRecording(String[] recording) {
        this.recordingField = recording;
    }

    private String recordingSearchTypeField;

    /**
     * @return the RecordingSearchType
     */
    public String getRecordingSearchType() {
        return recordingSearchTypeField;
    }

    /**
     * @param recordingSearchType the RecordingSearchType to set
     */
    public void setRecordingSearchType(String recordingSearchType) {
        this.recordingSearchTypeField = recordingSearchType;
    }

    private String recordingIdTypeField;

    /**
     * @return the RecordingIdType
     */
    public String getRecordingIdType() {
        return recordingIdTypeField;
    }

    /**
     * @param recordingIdType the RecordingIdType to set
     */
    public void setRecordingIdType(String recordingIdType) {
        this.recordingIdTypeField = recordingIdType;
    }

    private String dateReleasedField;

    /**
     * @return the DateReleased
     */
    public String getDateReleased() {
        return dateReleasedField;
    }

    /**
     * @param dateReleased the DateReleased to set
     */
    public void setDateReleased(String dateReleased) {
        this.dateReleasedField = dateReleased;
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

    private AlbumRetrievalDepth[] depthField;

    /**
     * @return the Depth
     */
    public AlbumRetrievalDepth[] getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(AlbumRetrievalDepth[] depth) {
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
