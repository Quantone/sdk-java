package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum WebsiteName{
    @SerializedName("Wikipedia")
    WIKIPEDIA,
    @SerializedName("YouTube")
    YOUTUBE,
    @SerializedName("Twitter")
    TWITTER,
    @SerializedName("Facebook")
    FACEBOOK,
    @SerializedName("MySpace")
    MYSPACE,
    @SerializedName("AllMusic")
    ALLMUSIC,
    @SerializedName("BBC")
    BBC,
    @SerializedName("PureVolume")
    PUREVOLUME,
    @SerializedName("SoundCloud")
    SOUNDCLOUD,
    @SerializedName("Bandcamp")
    BANDCAMP,
}
