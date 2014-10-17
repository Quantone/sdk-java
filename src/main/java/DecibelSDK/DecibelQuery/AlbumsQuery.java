package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class AlbumsQuery implements Query<AlbumsQueryResult>{
    public String getQueryString() {
        return buildQueryString();
    }
    private List<String> artists;

    /**
     * @return the artists
     */
    public List<String> getArtists() {
        return artists;
    }

    /**
     * @param artists the artists to set
     */
    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    private List<String> artistIds;

    /**
     * @return the artistIds
     */
    public List<String> getArtistIds() {
        return artistIds;
    }

    /**
     * @param artistIds the artistIds to set
     */
    public void setArtistIds(List<String> artistIds) {
        this.artistIds = artistIds;
    }

    private List<String> participants;

    /**
     * @return the participants
     */
    public List<String> getParticipants() {
        return participants;
    }

    /**
     * @param participants the participants to set
     */
    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    private List<String> participantIds;

    /**
     * @return the participantIds
     */
    public List<String> getParticipantIds() {
        return participantIds;
    }

    /**
     * @param participantIds the participantIds to set
     */
    public void setParticipantIds(List<String> participantIds) {
        this.participantIds = participantIds;
    }

    private List<String> recordings;

    /**
     * @return the recordings
     */
    public List<String> getRecordings() {
        return recordings;
    }

    /**
     * @param recordings the recordings to set
     */
    public void setRecordings(List<String> recordings) {
        this.recordings = recordings;
    }

    private List<String> recordingIds;

    /**
     * @return the recordingIds
     */
    public List<String> getRecordingIds() {
        return recordingIds;
    }

    /**
     * @param recordingIds the recordingIds to set
     */
    public void setRecordingIds(List<String> recordingIds) {
        this.recordingIds = recordingIds;
    }

    private List<OrderAlbumsBy> orderBy;

    /**
     * @return the orderBy
     */
    public List<OrderAlbumsBy> getOrderBy() {
        return orderBy;
    }

    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(List<OrderAlbumsBy> orderBy) {
        this.orderBy = orderBy;
    }

    private List<AlbumRetrievalDepth> depth;

    /**
     * @return the depth
     */
    public List<AlbumRetrievalDepth> getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(List<AlbumRetrievalDepth> depth) {
        this.depth = depth;
    }

    private AlbumSearchType titleSearchType;

    /**
     * @return the titleSearchType
     */
    public AlbumSearchType getTitleSearchType() {
        return titleSearchType;
    }

    /**
     * @param titleSearchType the titleSearchType to set
     */
    public void setTitleSearchType(AlbumSearchType titleSearchType) {
        this.titleSearchType = titleSearchType;
    }

    private AlbumIdType idType;

    /**
     * @return the idType
     */
    public AlbumIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(AlbumIdType idType) {
        this.idType = idType;
    }

    private ArtistSearchType artistSearchType;

    /**
     * @return the artistSearchType
     */
    public ArtistSearchType getArtistSearchType() {
        return artistSearchType;
    }

    /**
     * @param artistSearchType the artistSearchType to set
     */
    public void setArtistSearchType(ArtistSearchType artistSearchType) {
        this.artistSearchType = artistSearchType;
    }

    private ArtistIdType artistIdType;

    /**
     * @return the artistIdType
     */
    public ArtistIdType getArtistIdType() {
        return artistIdType;
    }

    /**
     * @param artistIdType the artistIdType to set
     */
    public void setArtistIdType(ArtistIdType artistIdType) {
        this.artistIdType = artistIdType;
    }

    private ArtistSearchType participantSearchType;

    /**
     * @return the participantSearchType
     */
    public ArtistSearchType getParticipantSearchType() {
        return participantSearchType;
    }

    /**
     * @param participantSearchType the participantSearchType to set
     */
    public void setParticipantSearchType(ArtistSearchType participantSearchType) {
        this.participantSearchType = participantSearchType;
    }

    private ArtistIdType participantIdType;

    /**
     * @return the participantIdType
     */
    public ArtistIdType getParticipantIdType() {
        return participantIdType;
    }

    /**
     * @param participantIdType the participantIdType to set
     */
    public void setParticipantIdType(ArtistIdType participantIdType) {
        this.participantIdType = participantIdType;
    }

    private RecordingSearchType recordingSearchType;

    /**
     * @return the recordingSearchType
     */
    public RecordingSearchType getRecordingSearchType() {
        return recordingSearchType;
    }

    /**
     * @param recordingSearchType the recordingSearchType to set
     */
    public void setRecordingSearchType(RecordingSearchType recordingSearchType) {
        this.recordingSearchType = recordingSearchType;
    }

    private RecordingIdType recordingIdType;

    /**
     * @return the recordingIdType
     */
    public RecordingIdType getRecordingIdType() {
        return recordingIdType;
    }

    /**
     * @param recordingIdType the recordingIdType to set
     */
    public void setRecordingIdType(RecordingIdType recordingIdType) {
        this.recordingIdType = recordingIdType;
    }

    private String title;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    private String id;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private Language language;

    /**
     * @return the language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    private String dateReleased;

    /**
     * @return the dateReleased
     */
    public String getDateReleased() {
        return dateReleased;
    }

    /**
     * @param dateReleased the dateReleased to set
     */
    public void setDateReleased(String dateReleased) {
        this.dateReleased = dateReleased;
    }

    private Boolean isLive;

    /**
     * @return the isLive
     */
    public Boolean getIsLive() {
        return isLive;
    }

    /**
     * @param isLive the isLive to set
     */
    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    private Integer pageNumber;

    /**
     * @return the pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    private Integer pageSize;

    /**
     * @return the pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private Integer updatedSince;

    /**
     * @return the updatedSince
     */
    public Integer getUpdatedSince() {
        return updatedSince;
    }

    /**
     * @param updatedSince the updatedSince to set
     */
    public void setUpdatedSince(Integer updatedSince) {
        this.updatedSince = updatedSince;
    }

    public String buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Albums?");


        queryStr.append(valueOrDefault("artists", artists, null));
        queryStr.append(valueOrDefault("artistids", artistIds, null));
        queryStr.append(valueOrDefault("participants", participants, null));
        queryStr.append(valueOrDefault("participantids", participantIds, null));
        queryStr.append(valueOrDefault("recordings", recordings, null));
        queryStr.append(valueOrDefault("recordingids", recordingIds, null));
        queryStr.append(valueOrDefault("orderby", orderBy, null));
        queryStr.append(valueOrDefault("depth", depth, null));
        queryStr.append(valueOrDefault("titlesearchtype", titleSearchType, AlbumSearchType.FULLNAME));
        queryStr.append(valueOrDefault("idtype", idType, AlbumIdType.DECIBEL));
        queryStr.append(valueOrDefault("artistsearchtype", artistSearchType, ArtistSearchType.FULLNAME));
        queryStr.append(valueOrDefault("artistidtype", artistIdType, ArtistIdType.DECIBEL));
        queryStr.append(valueOrDefault("participantsearchtype", participantSearchType, ArtistSearchType.FULLNAME));
        queryStr.append(valueOrDefault("participantidtype", participantIdType, ArtistIdType.DECIBEL));
        queryStr.append(valueOrDefault("recordingsearchtype", recordingSearchType, RecordingSearchType.FULLNAME));
        queryStr.append(valueOrDefault("recordingidtype", recordingIdType, RecordingIdType.DECIBEL));
        queryStr.append(valueOrDefault("title", title, null));
        queryStr.append(valueOrDefault("id", id, null));
        queryStr.append(valueOrDefault("language", language, null));
        queryStr.append(valueOrDefault("datereleased", dateReleased, null));
        queryStr.append(valueOrDefault("islive", isLive, null));
        queryStr.append(valueOrDefault("pagenumber", pageNumber, null));
        queryStr.append(valueOrDefault("pagesize", pageSize, null));
        queryStr.append(valueOrDefault("updatedsince", updatedSince, null));

        return queryStr.toString().replaceAll("[&,?]+$", "");
    }

    private static String valueOrDefault(String paramName, Object value, Object defaultValue){
        if(value == null || value.equals(defaultValue)) return "";
        if(!value.getClass().toString().toLowerCase().contains("array"))
            return value == defaultValue ? "" : paramName + "=" + value + "&";

        StringBuilder queryStr = new StringBuilder();
        queryStr.append(paramName).append("=");
        for(Object item : (List<Object>)value)
            queryStr.append(item).append(",");

        return InternalUtilities.trimEnd(queryStr.toString(), ',') + "&";
    }
}
