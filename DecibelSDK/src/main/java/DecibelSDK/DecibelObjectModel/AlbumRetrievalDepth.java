package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum AlbumRetrievalDepth{
    @SerializedName("Recordings")
    RECORDINGS,
    @SerializedName("Identifiers")
    IDENTIFIERS,
    @SerializedName("Works")
    WORKS,
    @SerializedName("Participations")
    PARTICIPATIONS,
    @SerializedName("Genres")
    GENRES,
    @SerializedName("ArtistDetails")
    ARTISTDETAILS,
    @SerializedName("Releases")
    RELEASES,
    @SerializedName("RecordingArtistDetails")
    RECORDINGARTISTDETAILS,
}
