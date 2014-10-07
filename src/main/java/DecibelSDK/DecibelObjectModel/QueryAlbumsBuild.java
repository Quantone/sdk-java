package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryAlbumsBuild { 
    private List<String> artistField;

    /**
     * @return the Artist
     */
    public List<String> getArtist() {
        return artistField;
    }

    /**
     * @param artist the Artist to set
     */
    public void setArtist(List<String> artist) {
        this.artistField = artist;
    }

    private List<String> participantField;

    /**
     * @return the Participant
     */
    public List<String> getParticipant() {
        return participantField;
    }

    /**
     * @param participant the Participant to set
     */
    public void setParticipant(List<String> participant) {
        this.participantField = participant;
    }

    private List<String> recordingField;

    /**
     * @return the Recording
     */
    public List<String> getRecording() {
        return recordingField;
    }

    /**
     * @param recording the Recording to set
     */
    public void setRecording(List<String> recording) {
        this.recordingField = recording;
    }

    private List<OrderAlbumsBy> orderByField;

    /**
     * @return the OrderBy
     */
    public List<OrderAlbumsBy> getOrderBy() {
        return orderByField;
    }

    /**
     * @param orderBy the OrderBy to set
     */
    public void setOrderBy(List<OrderAlbumsBy> orderBy) {
        this.orderByField = orderBy;
    }

    private List<AlbumRetrievalDepth> depthField;

    /**
     * @return the Depth
     */
    public List<AlbumRetrievalDepth> getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(List<AlbumRetrievalDepth> depth) {
        this.depthField = depth;
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

    private Language languageField;

    /**
     * @return the Language
     */
    public Language getLanguage() {
        return languageField;
    }

    /**
     * @param language the Language to set
     */
    public void setLanguage(Language language) {
        this.languageField = language;
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

    private long updatedSinceField;

    /**
     * @return the UpdatedSince
     */
    public long getUpdatedSince() {
        return updatedSinceField;
    }

    /**
     * @param updatedSince the UpdatedSince to set
     */
    public void setUpdatedSince(long updatedSince) {
        this.updatedSinceField = updatedSince;
    }

    public URI buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Albums?");

        queryStr.append(valueOrDefault("artist", artistField, null));
        queryStr.append(valueOrDefault("participant", participantField, null));
        queryStr.append(valueOrDefault("recording", recordingField, null));
        queryStr.append(valueOrDefault("orderby", orderByField, null));
        queryStr.append(valueOrDefault("depth", depthField, null));
        queryStr.append(valueOrDefault("titlesearchtype", titleSearchTypeField, null));
        queryStr.append(valueOrDefault("artistsearchtype", artistSearchTypeField, null));
        queryStr.append(valueOrDefault("participantsearchtype", participantSearchTypeField, null));
        queryStr.append(valueOrDefault("recordingsearchtype", recordingSearchTypeField, null));
        queryStr.append(valueOrDefault("title", titleField, null));
        queryStr.append(valueOrDefault("language", languageField, null));
        queryStr.append(valueOrDefault("datereleased", dateReleasedField, null));
        queryStr.append(valueOrDefault("islive", isLiveField, null));
        queryStr.append(valueOrDefault("pagenumber", pageNumberField, null));
        queryStr.append(valueOrDefault("pagesize", pageSizeField, null));
        queryStr.append(valueOrDefault("updatedsince", updatedSinceField, null));

        try {
            return new URI(URLEncoder.encode(InternalUtilities.trimEnd(queryStr.toString(), '&'), "UTF-8"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(QueryAlbumsBuild.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (UnsupportedEncodingException ex){
            Logger.getLogger(QueryAlbumsBuild.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private static String valueOrDefault(String paramName, Object value, Object defaultValue){
        if(value == null) return "";
        if(!value.getClass().toString().toLowerCase().contains("array"))
            return value == defaultValue ? "" : paramName + "=" + value + "&";

        StringBuilder queryStr = new StringBuilder();
        queryStr.append(paramName).append("=");
        for(Object item : (List<Object>)value)
            queryStr.append(item).append(";");
        queryStr.append("&");
        return queryStr.toString();
    }
}
