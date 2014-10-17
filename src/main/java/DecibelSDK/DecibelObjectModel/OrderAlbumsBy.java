package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum OrderAlbumsBy{
    @SerializedName("DecibelEminence")
    DECIBELEMINENCE,
    @SerializedName("ReleaseDateOldest")
    RELEASEDATEOLDEST,
    @SerializedName("ReleaseDateNewest")
    RELEASEDATENEWEST,
}
