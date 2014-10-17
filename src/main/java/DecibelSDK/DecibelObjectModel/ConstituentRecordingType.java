package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ConstituentRecordingType{
    @SerializedName("Remaster")
    REMASTER,
    @SerializedName("Remix")
    REMIX,
    @SerializedName("Sampling")
    SAMPLING,
    @SerializedName("Overdub")
    OVERDUB,
    @SerializedName("Section")
    SECTION,
    @SerializedName("Revision")
    REVISION,
    @SerializedName("BasedOn")
    BASEDON,
}
