package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum AlbumIdType{
    @SerializedName("Decibel")
    DECIBEL,
    @SerializedName("FreeDb")
    FREEDB,
    @SerializedName("EAN")
    EAN,
    @SerializedName("CatalogNumber")
    CATALOGNUMBER,
    @SerializedName("Spotify")
    SPOTIFY,
    @SerializedName("DiscogsMaster")
    DISCOGSMASTER,
    @SerializedName("DiscogsRelease")
    DISCOGSRELEASE,
    @SerializedName("MusicBrainz")
    MUSICBRAINZ,
}
