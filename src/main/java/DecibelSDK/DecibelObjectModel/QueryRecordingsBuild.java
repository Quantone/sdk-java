package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryRecordingsBuild { 
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

    private List<String> composerField;

    /**
     * @return the Composer
     */
    public List<String> getComposer() {
        return composerField;
    }

    /**
     * @param composer the Composer to set
     */
    public void setComposer(List<String> composer) {
        this.composerField = composer;
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

    private List<OrderRecordingsBy> orderByField;

    /**
     * @return the OrderBy
     */
    public List<OrderRecordingsBy> getOrderBy() {
        return orderByField;
    }

    /**
     * @param orderBy the OrderBy to set
     */
    public void setOrderBy(List<OrderRecordingsBy> orderBy) {
        this.orderByField = orderBy;
    }

    private List<RecordingRetrievalDepth> depthField;

    /**
     * @return the Depth
     */
    public List<RecordingRetrievalDepth> getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(List<RecordingRetrievalDepth> depth) {
        this.depthField = depth;
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
        queryStr.append("Recordings?");

        queryStr.append(valueOrDefault("artist", artistField, null));
        queryStr.append(valueOrDefault("composer", composerField, null));
        queryStr.append(valueOrDefault("participant", participantField, null));
        queryStr.append(valueOrDefault("orderby", orderByField, null));
        queryStr.append(valueOrDefault("depth", depthField, null));
        queryStr.append(valueOrDefault("titlesearchtype", titleSearchTypeField, null));
        queryStr.append(valueOrDefault("artistsearchtype", artistSearchTypeField, null));
        queryStr.append(valueOrDefault("composersearchtype", composerSearchTypeField, null));
        queryStr.append(valueOrDefault("participantsearchtype", participantSearchTypeField, null));
        queryStr.append(valueOrDefault("title", titleField, null));
        queryStr.append(valueOrDefault("language", languageField, null));
        queryStr.append(valueOrDefault("minseconds", minSecondsField, null));
        queryStr.append(valueOrDefault("maxseconds", maxSecondsField, null));
        queryStr.append(valueOrDefault("islive", isLiveField, null));
        queryStr.append(valueOrDefault("dateproduced", dateProducedField, null));
        queryStr.append(valueOrDefault("pagenumber", pageNumberField, null));
        queryStr.append(valueOrDefault("pagesize", pageSizeField, null));
        queryStr.append(valueOrDefault("updatedsince", updatedSinceField, null));

        try {
            return new URI(InternalUtilities.trimEnd(queryStr.toString(), '&'));
        } catch (URISyntaxException ex) {
            Logger.getLogger(QueryRecordingsBuild.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private static String valueOrDefault(String paramName, Object value, Object defaultValue){
        if(value == null) return "";
        if(!value.getClass().toString().toLowerCase().contains("array"))
            return value == defaultValue ? "" : paramName + "=" + value + "&";

        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append(paramName).append("=");
        for(Object item : (List<Object>)value)
            queryStr.append(item).append(";");
        queryStr.append("&");
        return queryStr.toString();
    }
}
