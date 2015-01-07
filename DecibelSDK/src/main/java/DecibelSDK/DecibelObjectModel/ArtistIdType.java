package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ArtistIdType{
    @SerializedName("Decibel")
    DECIBEL,
    @SerializedName("DiscogsArtist")
    DISCOGSARTIST,
    @SerializedName("Spotify")
    SPOTIFY,
    @SerializedName("MusicBrainz")
    MUSICBRAINZ,
}
