package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ArtistRetrievalDepth{
    @SerializedName("Identifiers")
    IDENTIFIERS,
    @SerializedName("BiographySummary")
    BIOGRAPHYSUMMARY,
    @SerializedName("Biography")
    BIOGRAPHY,
    @SerializedName("Members")
    MEMBERS,
    @SerializedName("Groups")
    GROUPS,
    @SerializedName("Dates")
    DATES,
    @SerializedName("Genres")
    GENRES,
    @SerializedName("Urls")
    URLS,
    @SerializedName("RelatedArtists")
    RELATEDARTISTS,
}
