package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlbumsQueryObject extends SearchQueryObject{
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

    private AlbumSearchType titleSearchType;

    /**
     * @return the TitleSearchType
     */
    public AlbumSearchType getTitleSearchType() {
        return titleSearchType;
    }

    /**
     * @param titleSearchType the TitleSearchType to set
     */
    public void setTitleSearchType(AlbumSearchType titleSearchType) {
        this.titleSearchType = titleSearchType;
    }

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

    private AlbumIdType idType;

    /**
     * @return the IdType
     */
    public AlbumIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(AlbumIdType idType) {
        this.idType = idType;
    }

    private List<String> recordings;

    /**
     * @return the Recordings
     */
    public List<String> getRecordings() {
        return recordings;
    }

    /**
     * @param recordings the Recordings to set
     */
    public void setRecordings(List<String> recordings) {
        this.recordings = recordings;
    }

    private List<String> recordingIds;

    /**
     * @return the RecordingIds
     */
    public List<String> getRecordingIds() {
        return recordingIds;
    }

    /**
     * @param recordingIds the RecordingIds to set
     */
    public void setRecordingIds(List<String> recordingIds) {
        this.recordingIds = recordingIds;
    }

    private List<String> artists;

    /**
     * @return the Artists
     */
    public List<String> getArtists() {
        return artists;
    }

    /**
     * @param artists the Artists to set
     */
    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    private List<String> artistIds;

    /**
     * @return the ArtistIds
     */
    public List<String> getArtistIds() {
        return artistIds;
    }

    /**
     * @param artistIds the ArtistIds to set
     */
    public void setArtistIds(List<String> artistIds) {
        this.artistIds = artistIds;
    }

    private List<String> participants;

    /**
     * @return the Participants
     */
    public List<String> getParticipants() {
        return participants;
    }

    /**
     * @param participants the Participants to set
     */
    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    private List<String> participantIds;

    /**
     * @return the ParticipantIds
     */
    public List<String> getParticipantIds() {
        return participantIds;
    }

    /**
     * @param participantIds the ParticipantIds to set
     */
    public void setParticipantIds(List<String> participantIds) {
        this.participantIds = participantIds;
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

    private String dateReleased;

    /**
     * @return the DateReleased
     */
    public String getDateReleased() {
        return dateReleased;
    }

    /**
     * @param dateReleased the DateReleased to set
     */
    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    private List<OrderAlbumsBy> orderingProperties;

    /**
     * @return the OrderingProperties
     */
    public List<OrderAlbumsBy> getOrderingProperties() {
        return orderingProperties;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderAlbumsBy> orderingProperties) {
        this.orderingProperties = orderingProperties;
    }

    private RecordingSearchType recordingSearchType;

    /**
     * @return the RecordingSearchType
     */
    public RecordingSearchType getRecordingSearchType() {
        return recordingSearchType;
    }

    /**
     * @param recordingSearchType the RecordingSearchType to set
     */
    public void setRecordingSearchType(RecordingSearchType recordingSearchType) {
        this.recordingSearchType = recordingSearchType;
    }

    private RecordingIdType recordingIdType;

    /**
     * @return the RecordingIdType
     */
    public RecordingIdType getRecordingIdType() {
        return recordingIdType;
    }

    /**
     * @param recordingIdType the RecordingIdType to set
     */
    public void setRecordingIdType(RecordingIdType recordingIdType) {
        this.recordingIdType = recordingIdType;
    }

    private ArtistSearchType artistSearchType;

    /**
     * @return the ArtistSearchType
     */
    public ArtistSearchType getArtistSearchType() {
        return artistSearchType;
    }

    /**
     * @param artistSearchType the ArtistSearchType to set
     */
    public void setArtistSearchType(ArtistSearchType artistSearchType) {
        this.artistSearchType = artistSearchType;
    }

    private ArtistIdType artistIdType;

    /**
     * @return the ArtistIdType
     */
    public ArtistIdType getArtistIdType() {
        return artistIdType;
    }

    /**
     * @param artistIdType the ArtistIdType to set
     */
    public void setArtistIdType(ArtistIdType artistIdType) {
        this.artistIdType = artistIdType;
    }

    private ArtistSearchType participantSearchType;

    /**
     * @return the ParticipantSearchType
     */
    public ArtistSearchType getParticipantSearchType() {
        return participantSearchType;
    }

    /**
     * @param participantSearchType the ParticipantSearchType to set
     */
    public void setParticipantSearchType(ArtistSearchType participantSearchType) {
        this.participantSearchType = participantSearchType;
    }

    private ArtistIdType participantIdType;

    /**
     * @return the ParticipantIdType
     */
    public ArtistIdType getParticipantIdType() {
        return participantIdType;
    }

    /**
     * @param participantIdType the ParticipantIdType to set
     */
    public void setParticipantIdType(ArtistIdType participantIdType) {
        this.participantIdType = participantIdType;
    }

    private AlbumRetrievalDepth retrievalDepth;

    /**
     * @return the RetrievalDepth
     */
    public AlbumRetrievalDepth getRetrievalDepth() {
        return retrievalDepth;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(AlbumRetrievalDepth retrievalDepth) {
        this.retrievalDepth = retrievalDepth;
    }

}
