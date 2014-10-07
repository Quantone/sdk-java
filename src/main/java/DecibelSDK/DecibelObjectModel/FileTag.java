package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTag extends DecibelEntity { 
    private String languageField;

    /**
     * @return the Language
     */
    public String getLanguage() {
        return languageField;
    }

    /**
     * @param language the Language to set
     */
    public void setLanguage(String language) {
        this.languageField = language;
    }

    private String albumIdField;

    /**
     * @return the AlbumId
     */
    public String getAlbumId() {
        return albumIdField;
    }

    /**
     * @param albumId the AlbumId to set
     */
    public void setAlbumId(String albumId) {
        this.albumIdField = albumId;
    }

    private String albumTitleField;

    /**
     * @return the AlbumTitle
     */
    public String getAlbumTitle() {
        return albumTitleField;
    }

    /**
     * @param albumTitle the AlbumTitle to set
     */
    public void setAlbumTitle(String albumTitle) {
        this.albumTitleField = albumTitle;
    }

    private String albumMediumIdField;

    /**
     * @return the AlbumMediumId
     */
    public String getAlbumMediumId() {
        return albumMediumIdField;
    }

    /**
     * @param albumMediumId the AlbumMediumId to set
     */
    public void setAlbumMediumId(String albumMediumId) {
        this.albumMediumIdField = albumMediumId;
    }

    private String mediaTypeField;

    /**
     * @return the MediaType
     */
    public String getMediaType() {
        return mediaTypeField;
    }

    /**
     * @param mediaType the MediaType to set
     */
    public void setMediaType(String mediaType) {
        this.mediaTypeField = mediaType;
    }

    private String albumBarcodeField;

    /**
     * @return the AlbumBarcode
     */
    public String getAlbumBarcode() {
        return albumBarcodeField;
    }

    /**
     * @param albumBarcode the AlbumBarcode to set
     */
    public void setAlbumBarcode(String albumBarcode) {
        this.albumBarcodeField = albumBarcode;
    }

    private String publisherField;

    /**
     * @return the Publisher
     */
    public String getPublisher() {
        return publisherField;
    }

    /**
     * @param publisher the Publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisherField = publisher;
    }

    private String catalogNumField;

    /**
     * @return the CatalogNum
     */
    public String getCatalogNum() {
        return catalogNumField;
    }

    /**
     * @param catalogNum the CatalogNum to set
     */
    public void setCatalogNum(String catalogNum) {
        this.catalogNumField = catalogNum;
    }

    private String releaseDateField;

    /**
     * @return the ReleaseDate
     */
    public String getReleaseDate() {
        return releaseDateField;
    }

    /**
     * @param releaseDate the ReleaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDateField = releaseDate;
    }

    private String discTitleField;

    /**
     * @return the DiscTitle
     */
    public String getDiscTitle() {
        return discTitleField;
    }

    /**
     * @param discTitle the DiscTitle to set
     */
    public void setDiscTitle(String discTitle) {
        this.discTitleField = discTitle;
    }

    private Integer discNumField;

    /**
     * @return the DiscNum
     */
    public Integer getDiscNum() {
        return discNumField;
    }

    /**
     * @param discNum the DiscNum to set
     */
    public void setDiscNum(Integer discNum) {
        this.discNumField = discNum;
    }

    private Integer discCountField;

    /**
     * @return the DiscCount
     */
    public Integer getDiscCount() {
        return discCountField;
    }

    /**
     * @param discCount the DiscCount to set
     */
    public void setDiscCount(Integer discCount) {
        this.discCountField = discCount;
    }

    private String discStringField;

    /**
     * @return the DiscString
     */
    public String getDiscString() {
        return discStringField;
    }

    /**
     * @param discString the DiscString to set
     */
    public void setDiscString(String discString) {
        this.discStringField = discString;
    }

    private String discBarcodeField;

    /**
     * @return the DiscBarcode
     */
    public String getDiscBarcode() {
        return discBarcodeField;
    }

    /**
     * @param discBarcode the DiscBarcode to set
     */
    public void setDiscBarcode(String discBarcode) {
        this.discBarcodeField = discBarcode;
    }

    private String cddbIdField;

    /**
     * @return the CddbId
     */
    public String getCddbId() {
        return cddbIdField;
    }

    /**
     * @param cddbId the CddbId to set
     */
    public void setCddbId(String cddbId) {
        this.cddbIdField = cddbId;
    }

    private String recordingIdField;

    /**
     * @return the RecordingId
     */
    public String getRecordingId() {
        return recordingIdField;
    }

    /**
     * @param recordingId the RecordingId to set
     */
    public void setRecordingId(String recordingId) {
        this.recordingIdField = recordingId;
    }

    private double secondsField;

    /**
     * @return the Seconds
     */
    public double getSeconds() {
        return secondsField;
    }

    /**
     * @param seconds the Seconds to set
     */
    public void setSeconds(double seconds) {
        this.secondsField = seconds;
    }

    private String timeStringField;

    /**
     * @return the TimeString
     */
    public String getTimeString() {
        return timeStringField;
    }

    /**
     * @param timeString the TimeString to set
     */
    public void setTimeString(String timeString) {
        this.timeStringField = timeString;
    }

    private String sideField;

    /**
     * @return the Side
     */
    public String getSide() {
        return sideField;
    }

    /**
     * @param side the Side to set
     */
    public void setSide(String side) {
        this.sideField = side;
    }

    private Integer trackNumField;

    /**
     * @return the TrackNum
     */
    public Integer getTrackNum() {
        return trackNumField;
    }

    /**
     * @param trackNum the TrackNum to set
     */
    public void setTrackNum(Integer trackNum) {
        this.trackNumField = trackNum;
    }

    private Integer trackCountField;

    /**
     * @return the TrackCount
     */
    public Integer getTrackCount() {
        return trackCountField;
    }

    /**
     * @param trackCount the TrackCount to set
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCountField = trackCount;
    }

    private String trackStringField;

    /**
     * @return the TrackString
     */
    public String getTrackString() {
        return trackStringField;
    }

    /**
     * @param trackString the TrackString to set
     */
    public void setTrackString(String trackString) {
        this.trackStringField = trackString;
    }

    private String trackTitleField;

    /**
     * @return the TrackTitle
     */
    public String getTrackTitle() {
        return trackTitleField;
    }

    /**
     * @param trackTitle the TrackTitle to set
     */
    public void setTrackTitle(String trackTitle) {
        this.trackTitleField = trackTitle;
    }

    private String trackPostscriptField;

    /**
     * @return the TrackPostscript
     */
    public String getTrackPostscript() {
        return trackPostscriptField;
    }

    /**
     * @param trackPostscript the TrackPostscript to set
     */
    public void setTrackPostscript(String trackPostscript) {
        this.trackPostscriptField = trackPostscript;
    }

    private String puidField;

    /**
     * @return the Puid
     */
    public String getPuid() {
        return puidField;
    }

    /**
     * @param puid the Puid to set
     */
    public void setPuid(String puid) {
        this.puidField = puid;
    }

    private String chromaprintIdField;

    /**
     * @return the ChromaprintId
     */
    public String getChromaprintId() {
        return chromaprintIdField;
    }

    /**
     * @param chromaprintId the ChromaprintId to set
     */
    public void setChromaprintId(String chromaprintId) {
        this.chromaprintIdField = chromaprintId;
    }

    private String worksField;

    /**
     * @return the Works
     */
    public String getWorks() {
        return worksField;
    }

    /**
     * @param works the Works to set
     */
    public void setWorks(String works) {
        this.worksField = works;
    }

    private String artistField;

    /**
     * @return the Artist
     */
    public String getArtist() {
        return artistField;
    }

    /**
     * @param artist the Artist to set
     */
    public void setArtist(String artist) {
        this.artistField = artist;
    }

    private String albumArtistField;

    /**
     * @return the AlbumArtist
     */
    public String getAlbumArtist() {
        return albumArtistField;
    }

    /**
     * @param albumArtist the AlbumArtist to set
     */
    public void setAlbumArtist(String albumArtist) {
        this.albumArtistField = albumArtist;
    }

    private String genresField;

    /**
     * @return the Genres
     */
    public String getGenres() {
        return genresField;
    }

    /**
     * @param genres the Genres to set
     */
    public void setGenres(String genres) {
        this.genresField = genres;
    }

    private String nationalityField;

    /**
     * @return the Nationality
     */
    public String getNationality() {
        return nationalityField;
    }

    /**
     * @param nationality the Nationality to set
     */
    public void setNationality(String nationality) {
        this.nationalityField = nationality;
    }

    private String conductorField;

    /**
     * @return the Conductor
     */
    public String getConductor() {
        return conductorField;
    }

    /**
     * @param conductor the Conductor to set
     */
    public void setConductor(String conductor) {
        this.conductorField = conductor;
    }

    private String composerField;

    /**
     * @return the Composer
     */
    public String getComposer() {
        return composerField;
    }

    /**
     * @param composer the Composer to set
     */
    public void setComposer(String composer) {
        this.composerField = composer;
    }

    private String recordingDateField;

    /**
     * @return the RecordingDate
     */
    public String getRecordingDate() {
        return recordingDateField;
    }

    /**
     * @param recordingDate the RecordingDate to set
     */
    public void setRecordingDate(String recordingDate) {
        this.recordingDateField = recordingDate;
    }

    private String recordingVenueField;

    /**
     * @return the RecordingVenue
     */
    public String getRecordingVenue() {
        return recordingVenueField;
    }

    /**
     * @param recordingVenue the RecordingVenue to set
     */
    public void setRecordingVenue(String recordingVenue) {
        this.recordingVenueField = recordingVenue;
    }

    private String recordingLocationField;

    /**
     * @return the RecordingLocation
     */
    public String getRecordingLocation() {
        return recordingLocationField;
    }

    /**
     * @param recordingLocation the RecordingLocation to set
     */
    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocationField = recordingLocation;
    }

    private String matrixField;

    /**
     * @return the Matrix
     */
    public String getMatrix() {
        return matrixField;
    }

    /**
     * @param matrix the Matrix to set
     */
    public void setMatrix(String matrix) {
        this.matrixField = matrix;
    }

    private String commentField;

    /**
     * @return the Comment
     */
    public String getComment() {
        return commentField;
    }

    /**
     * @param comment the Comment to set
     */
    public void setComment(String comment) {
        this.commentField = comment;
    }

    private String notesField;

    /**
     * @return the Notes
     */
    public String getNotes() {
        return notesField;
    }

    /**
     * @param notes the Notes to set
     */
    public void setNotes(String notes) {
        this.notesField = notes;
    }

    private String participantsField;

    /**
     * @return the Participants
     */
    public String getParticipants() {
        return participantsField;
    }

    /**
     * @param participants the Participants to set
     */
    public void setParticipants(String participants) {
        this.participantsField = participants;
    }

    private String thumbnailUrlField;

    /**
     * @return the ThumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrlField;
    }

    /**
     * @param thumbnailUrl the ThumbnailUrl to set
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrlField = thumbnailUrl;
    }

    private String coverUrlField;

    /**
     * @return the CoverUrl
     */
    public String getCoverUrl() {
        return coverUrlField;
    }

    /**
     * @param coverUrl the CoverUrl to set
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrlField = coverUrl;
    }

    private String bpmField;

    /**
     * @return the Bpm
     */
    public String getBpm() {
        return bpmField;
    }

    /**
     * @param bpm the Bpm to set
     */
    public void setBpm(String bpm) {
        this.bpmField = bpm;
    }

}
