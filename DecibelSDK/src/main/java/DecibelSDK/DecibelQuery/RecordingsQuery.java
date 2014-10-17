package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class RecordingsQuery implements Query<RecordingsQueryResult>{
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

    private List<String> composers;

    /**
     * @return the composers
     */
    public List<String> getComposers() {
        return composers;
    }

    /**
     * @param composers the composers to set
     */
    public void setComposers(List<String> composers) {
        this.composers = composers;
    }

    private List<String> composerIds;

    /**
     * @return the composerIds
     */
    public List<String> getComposerIds() {
        return composerIds;
    }

    /**
     * @param composerIds the composerIds to set
     */
    public void setComposerIds(List<String> composerIds) {
        this.composerIds = composerIds;
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

    private List<OrderRecordingsBy> orderBy;

    /**
     * @return the orderBy
     */
    public List<OrderRecordingsBy> getOrderBy() {
        return orderBy;
    }

    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(List<OrderRecordingsBy> orderBy) {
        this.orderBy = orderBy;
    }

    private List<RecordingRetrievalDepth> depth;

    /**
     * @return the depth
     */
    public List<RecordingRetrievalDepth> getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(List<RecordingRetrievalDepth> depth) {
        this.depth = depth;
    }

    private RecordingSearchType titleSearchType;

    /**
     * @return the titleSearchType
     */
    public RecordingSearchType getTitleSearchType() {
        return titleSearchType;
    }

    /**
     * @param titleSearchType the titleSearchType to set
     */
    public void setTitleSearchType(RecordingSearchType titleSearchType) {
        this.titleSearchType = titleSearchType;
    }

    private RecordingIdType idType;

    /**
     * @return the idType
     */
    public RecordingIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(RecordingIdType idType) {
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

    private ArtistSearchType composerSearchType;

    /**
     * @return the composerSearchType
     */
    public ArtistSearchType getComposerSearchType() {
        return composerSearchType;
    }

    /**
     * @param composerSearchType the composerSearchType to set
     */
    public void setComposerSearchType(ArtistSearchType composerSearchType) {
        this.composerSearchType = composerSearchType;
    }

    private ArtistIdType composerIdType;

    /**
     * @return the composerIdType
     */
    public ArtistIdType getComposerIdType() {
        return composerIdType;
    }

    /**
     * @param composerIdType the composerIdType to set
     */
    public void setComposerIdType(ArtistIdType composerIdType) {
        this.composerIdType = composerIdType;
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

    private Double minSeconds;

    /**
     * @return the minSeconds
     */
    public Double getMinSeconds() {
        return minSeconds;
    }

    /**
     * @param minSeconds the minSeconds to set
     */
    public void setMinSeconds(Double minSeconds) {
        this.minSeconds = minSeconds;
    }

    private Double maxSeconds;

    /**
     * @return the maxSeconds
     */
    public Double getMaxSeconds() {
        return maxSeconds;
    }

    /**
     * @param maxSeconds the maxSeconds to set
     */
    public void setMaxSeconds(Double maxSeconds) {
        this.maxSeconds = maxSeconds;
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

    private String dateMade;

    /**
     * @return the dateMade
     */
    public String getDateMade() {
        return dateMade;
    }

    /**
     * @param dateMade the dateMade to set
     */
    public void setDateMade(String dateMade) {
        this.dateMade = dateMade;
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
        queryStr.append("Recordings?");


        queryStr.append(valueOrDefault("artists", artists, null));
        queryStr.append(valueOrDefault("artistids", artistIds, null));
        queryStr.append(valueOrDefault("composers", composers, null));
        queryStr.append(valueOrDefault("composerids", composerIds, null));
        queryStr.append(valueOrDefault("participants", participants, null));
        queryStr.append(valueOrDefault("participantids", participantIds, null));
        queryStr.append(valueOrDefault("orderby", orderBy, null));
        queryStr.append(valueOrDefault("depth", depth, null));
        queryStr.append(valueOrDefault("titlesearchtype", titleSearchType, RecordingSearchType.FULLNAME));
        queryStr.append(valueOrDefault("idtype", idType, RecordingIdType.DECIBEL));
        queryStr.append(valueOrDefault("artistsearchtype", artistSearchType, ArtistSearchType.FULLNAME));
        queryStr.append(valueOrDefault("artistidtype", artistIdType, ArtistIdType.DECIBEL));
        queryStr.append(valueOrDefault("composersearchtype", composerSearchType, ArtistSearchType.FULLNAME));
        queryStr.append(valueOrDefault("composeridtype", composerIdType, ArtistIdType.DECIBEL));
        queryStr.append(valueOrDefault("participantsearchtype", participantSearchType, ArtistSearchType.FULLNAME));
        queryStr.append(valueOrDefault("participantidtype", participantIdType, ArtistIdType.DECIBEL));
        queryStr.append(valueOrDefault("title", title, null));
        queryStr.append(valueOrDefault("id", id, null));
        queryStr.append(valueOrDefault("language", language, null));
        queryStr.append(valueOrDefault("minseconds", minSeconds, null));
        queryStr.append(valueOrDefault("maxseconds", maxSeconds, null));
        queryStr.append(valueOrDefault("islive", isLive, null));
        queryStr.append(valueOrDefault("datemade", dateMade, null));
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
