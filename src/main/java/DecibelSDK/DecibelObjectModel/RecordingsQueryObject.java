package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordingsQueryObject extends SearchQueryObject{
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

    private RecordingSearchType titleSearchType;

    /**
     * @return the TitleSearchType
     */
    public RecordingSearchType getTitleSearchType() {
        return titleSearchType;
    }

    /**
     * @param titleSearchType the TitleSearchType to set
     */
    public void setTitleSearchType(RecordingSearchType titleSearchType) {
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

    private RecordingIdType idType;

    /**
     * @return the IdType
     */
    public RecordingIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(RecordingIdType idType) {
        this.idType = idType;
    }

    private String dateProduced;

    /**
     * @return the DateProduced
     */
    public String getDateProduced() {
        return dateProduced;
    }

    /**
     * @param dateProduced the DateProduced to set
     */
    public void setDateProduced(String dateProduced) {
        this.dateProduced = dateProduced;
    }

    private List<String> composers;

    /**
     * @return the Composers
     */
    public List<String> getComposers() {
        return composers;
    }

    /**
     * @param composers the Composers to set
     */
    public void setComposers(List<String> composers) {
        this.composers = composers;
    }

    private List<String> composerIds;

    /**
     * @return the ComposerIds
     */
    public List<String> getComposerIds() {
        return composerIds;
    }

    /**
     * @param composerIds the ComposerIds to set
     */
    public void setComposerIds(List<String> composerIds) {
        this.composerIds = composerIds;
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

    private Double maxSeconds;

    /**
     * @return the MaxSeconds
     */
    public Double getMaxSeconds() {
        return maxSeconds;
    }

    /**
     * @param maxSeconds the MaxSeconds to set
     */
    public void setMaxSeconds(Double maxSeconds) {
        this.maxSeconds = maxSeconds;
    }

    private Double minSeconds;

    /**
     * @return the MinSeconds
     */
    public Double getMinSeconds() {
        return minSeconds;
    }

    /**
     * @param minSeconds the MinSeconds to set
     */
    public void setMinSeconds(Double minSeconds) {
        this.minSeconds = minSeconds;
    }

    private List<OrderRecordingsBy> orderingProperties;

    /**
     * @return the OrderingProperties
     */
    public List<OrderRecordingsBy> getOrderingProperties() {
        return orderingProperties;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderRecordingsBy> orderingProperties) {
        this.orderingProperties = orderingProperties;
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

    private ArtistSearchType composerSearchType;

    /**
     * @return the ComposerSearchType
     */
    public ArtistSearchType getComposerSearchType() {
        return composerSearchType;
    }

    /**
     * @param composerSearchType the ComposerSearchType to set
     */
    public void setComposerSearchType(ArtistSearchType composerSearchType) {
        this.composerSearchType = composerSearchType;
    }

    private ArtistIdType composerIdType;

    /**
     * @return the ComposerIdType
     */
    public ArtistIdType getComposerIdType() {
        return composerIdType;
    }

    /**
     * @param composerIdType the ComposerIdType to set
     */
    public void setComposerIdType(ArtistIdType composerIdType) {
        this.composerIdType = composerIdType;
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

    private RecordingRetrievalDepth retrievalDepth;

    /**
     * @return the RetrievalDepth
     */
    public RecordingRetrievalDepth getRetrievalDepth() {
        return retrievalDepth;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(RecordingRetrievalDepth retrievalDepth) {
        this.retrievalDepth = retrievalDepth;
    }

}
