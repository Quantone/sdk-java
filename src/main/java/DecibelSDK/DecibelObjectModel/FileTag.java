package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTag extends DecibelEntity{
    private String albumId;

    /**
     * @return the AlbumId
     */
    public String getAlbumId() {
        return albumId;
    }

    /**
     * @param albumId the AlbumId to set
     */
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    private String albumTitle;

    /**
     * @return the AlbumTitle
     */
    public String getAlbumTitle() {
        return albumTitle;
    }

    /**
     * @param albumTitle the AlbumTitle to set
     */
    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    private String albumMediumId;

    /**
     * @return the AlbumMediumId
     */
    public String getAlbumMediumId() {
        return albumMediumId;
    }

    /**
     * @param albumMediumId the AlbumMediumId to set
     */
    public void setAlbumMediumId(String albumMediumId) {
        this.albumMediumId = albumMediumId;
    }

    private String mediaType;

    /**
     * @return the MediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType the MediaType to set
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    private String albumEAN;

    /**
     * @return the AlbumEAN
     */
    public String getAlbumEAN() {
        return albumEAN;
    }

    /**
     * @param albumEAN the AlbumEAN to set
     */
    public void setAlbumEAN(String albumEAN) {
        this.albumEAN = albumEAN;
    }

    private String publisher;

    /**
     * @return the Publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the Publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private String catalogNum;

    /**
     * @return the CatalogNum
     */
    public String getCatalogNum() {
        return catalogNum;
    }

    /**
     * @param catalogNum the CatalogNum to set
     */
    public void setCatalogNum(String catalogNum) {
        this.catalogNum = catalogNum;
    }

    private String releaseDate;

    /**
     * @return the ReleaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the ReleaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private String discTitle;

    /**
     * @return the DiscTitle
     */
    public String getDiscTitle() {
        return discTitle;
    }

    /**
     * @param discTitle the DiscTitle to set
     */
    public void setDiscTitle(String discTitle) {
        this.discTitle = discTitle;
    }

    private Integer discNum;

    /**
     * @return the DiscNum
     */
    public Integer getDiscNum() {
        return discNum;
    }

    /**
     * @param discNum the DiscNum to set
     */
    public void setDiscNum(Integer discNum) {
        this.discNum = discNum;
    }

    private Integer discCount;

    /**
     * @return the DiscCount
     */
    public Integer getDiscCount() {
        return discCount;
    }

    /**
     * @param discCount the DiscCount to set
     */
    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

    private String discEAN;

    /**
     * @return the DiscEAN
     */
    public String getDiscEAN() {
        return discEAN;
    }

    /**
     * @param discEAN the DiscEAN to set
     */
    public void setDiscEAN(String discEAN) {
        this.discEAN = discEAN;
    }

    private String cddbId;

    /**
     * @return the CddbId
     */
    public String getCddbId() {
        return cddbId;
    }

    /**
     * @param cddbId the CddbId to set
     */
    public void setCddbId(String cddbId) {
        this.cddbId = cddbId;
    }

    private String recordingId;

    /**
     * @return the RecordingId
     */
    public String getRecordingId() {
        return recordingId;
    }

    /**
     * @param recordingId the RecordingId to set
     */
    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    private Double duration;

    /**
     * @return the Duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * @param duration the Duration to set
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    private Integer trackNumber;

    /**
     * @return the TrackNumber
     */
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     * @param trackNumber the TrackNumber to set
     */
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    private Integer trackCount;

    /**
     * @return the TrackCount
     */
    public Integer getTrackCount() {
        return trackCount;
    }

    /**
     * @param trackCount the TrackCount to set
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    private String trackNumberLiteral;

    /**
     * @return the TrackNumberLiteral
     */
    public String getTrackNumberLiteral() {
        return trackNumberLiteral;
    }

    /**
     * @param trackNumberLiteral the TrackNumberLiteral to set
     */
    public void setTrackNumberLiteral(String trackNumberLiteral) {
        this.trackNumberLiteral = trackNumberLiteral;
    }

    private String trackTitle;

    /**
     * @return the TrackTitle
     */
    public String getTrackTitle() {
        return trackTitle;
    }

    /**
     * @param trackTitle the TrackTitle to set
     */
    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    private String puid;

    /**
     * @return the Puid
     */
    public String getPuid() {
        return puid;
    }

    /**
     * @param puid the Puid to set
     */
    public void setPuid(String puid) {
        this.puid = puid;
    }

    private String works;

    /**
     * @return the Works
     */
    public String getWorks() {
        return works;
    }

    /**
     * @param works the Works to set
     */
    public void setWorks(String works) {
        this.works = works;
    }

    private String trackArtist;

    /**
     * @return the TrackArtist
     */
    public String getTrackArtist() {
        return trackArtist;
    }

    /**
     * @param trackArtist the TrackArtist to set
     */
    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    private String genres;

    /**
     * @return the Genres
     */
    public String getGenres() {
        return genres;
    }

    /**
     * @param genres the Genres to set
     */
    public void setGenres(String genres) {
        this.genres = genres;
    }

    private String conductor;

    /**
     * @return the Conductor
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * @param conductor the Conductor to set
     */
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    private String recordingDate;

    /**
     * @return the RecordingDate
     */
    public String getRecordingDate() {
        return recordingDate;
    }

    /**
     * @param recordingDate the RecordingDate to set
     */
    public void setRecordingDate(String recordingDate) {
        this.recordingDate = recordingDate;
    }

    private String recordingVenue;

    /**
     * @return the RecordingVenue
     */
    public String getRecordingVenue() {
        return recordingVenue;
    }

    /**
     * @param recordingVenue the RecordingVenue to set
     */
    public void setRecordingVenue(String recordingVenue) {
        this.recordingVenue = recordingVenue;
    }

    private String matrix;

    /**
     * @return the Matrix
     */
    public String getMatrix() {
        return matrix;
    }

    /**
     * @param matrix the Matrix to set
     */
    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    private String participants;

    /**
     * @return the Participants
     */
    public String getParticipants() {
        return participants;
    }

    /**
     * @param participants the Participants to set
     */
    public void setParticipants(String participants) {
        this.participants = participants;
    }

    private String beatsPerMinute;

    /**
     * @return the BeatsPerMinute
     */
    public String getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     * @param beatsPerMinute the BeatsPerMinute to set
     */
    public void setBeatsPerMinute(String beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

}
