package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ContentFormat{
    @SerializedName("Single")
    SINGLE,
    @SerializedName("MaxiSingle")
    MAXISINGLE,
    @SerializedName("Ep")
    EP,
    @SerializedName("MiniAlbum")
    MINIALBUM,
    @SerializedName("Album")
    ALBUM,
    @SerializedName("SingleArtistCompilation")
    SINGLEARTISTCOMPILATION,
    @SerializedName("BoxSet")
    BOXSET,
    @SerializedName("Sampler")
    SAMPLER,
    @SerializedName("VariousArtistCompilation")
    VARIOUSARTISTCOMPILATION,
    @SerializedName("Soundtrack")
    SOUNDTRACK,
    @SerializedName("CastAlbum")
    CASTALBUM,
    @SerializedName("ConcertRecording")
    CONCERTRECORDING,
    @SerializedName("SpokenWord")
    SPOKENWORD,
    @SerializedName("Interview")
    INTERVIEW,
    @SerializedName("Audiobook")
    AUDIOBOOK,
    @SerializedName("Remix")
    REMIX,
    @SerializedName("DjMix")
    DJMIX,
}
