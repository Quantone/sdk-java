package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlbumsQueryObject extends SearchQueryObject { 
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

    private List<String> recordingsField;

    /**
     * @return the Recordings
     */
    public List<String> getRecordings() {
        return recordingsField;
    }

    /**
     * @param recordings the Recordings to set
     */
    public void setRecordings(List<String> recordings) {
        this.recordingsField = recordings;
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

    private List<OrderAlbumsBy> orderingPropertiesField;

    /**
     * @return the OrderingProperties
     */
    public List<OrderAlbumsBy> getOrderingProperties() {
        return orderingPropertiesField;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderAlbumsBy> orderingProperties) {
        this.orderingPropertiesField = orderingProperties;
    }

    private RecordingSearchType recordingSearchTypeField;

    /**
     * @return the RecordingSearchType
     */
    public RecordingSearchType getRecordingSearchType() {
        return recordingSearchTypeField;
    }

    /**
     * @param recordingSearchType the RecordingSearchType to set
     */
    public void setRecordingSearchType(RecordingSearchType recordingSearchType) {
        this.recordingSearchTypeField = recordingSearchType;
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

    private AlbumRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public AlbumRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(AlbumRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

}
