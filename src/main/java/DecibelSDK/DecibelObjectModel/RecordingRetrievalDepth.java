package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum RecordingRetrievalDepth{
    @SerializedName("Participations")
    PARTICIPATIONS,
    @SerializedName("ArtistDetails")
    ARTISTDETAILS,
    @SerializedName("Works")
    WORKS,
    @SerializedName("Genres")
    GENRES,
    @SerializedName("Identifiers")
    IDENTIFIERS,
    @SerializedName("SessionInfo")
    SESSIONINFO,
    @SerializedName("ConstituentRecordings")
    CONSTITUENTRECORDINGS,
}
