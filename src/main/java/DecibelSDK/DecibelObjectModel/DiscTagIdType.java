package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum DiscTagIdType{
    @SerializedName("DecibelAlbum")
    DECIBELALBUM,
    @SerializedName("DecibelMedium")
    DECIBELMEDIUM,
    @SerializedName("Spotify")
    SPOTIFY,
    @SerializedName("FreeDb")
    FREEDB,
}
