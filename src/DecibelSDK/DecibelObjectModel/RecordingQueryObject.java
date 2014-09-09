package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class RecordingQueryObject extends SearchQueryObject { 
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

    private String recordingsField;

    /**
     * @return the Recordings
     */
    public String getRecordings() {
        return recordingsField;
    }

    /**
     * @param recordings the Recordings to set
     */
    public void setRecordings(String recordings) {
        this.recordingsField = recordings;
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

    private List<String> composersField;

    /**
     * @return the Composers
     */
    public List<String> getComposers() {
        return composersField;
    }

    /**
     * @param composers the Composers to set
     */
    public void setComposers(List<String> composers) {
        this.composersField = composers;
    }

    private List<String> participantsField;

    /**
     * @return the Participants
     */
    public List<String> getParticipants() {
        return participantsField;
    }

    /**
     * @param participants the Participants to set
     */
    public void setParticipants(List<String> participants) {
        this.participantsField = participants;
    }

    private List<String> artistsField;

    /**
     * @return the Artists
     */
    public List<String> getArtists() {
        return artistsField;
    }

    /**
     * @param artists the Artists to set
     */
    public void setArtists(List<String> artists) {
        this.artistsField = artists;
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

    private List<OrderRecordingsBy> orderingPropertiesField;

    /**
     * @return the OrderingProperties
     */
    public List<OrderRecordingsBy> getOrderingProperties() {
        return orderingPropertiesField;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderRecordingsBy> orderingProperties) {
        this.orderingPropertiesField = orderingProperties;
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

    private RecordingRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public RecordingRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(RecordingRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

}
