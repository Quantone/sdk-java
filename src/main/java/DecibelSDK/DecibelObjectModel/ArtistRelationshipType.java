package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ArtistRelationshipType{
    @SerializedName("Influenced")
    INFLUENCED,
    @SerializedName("InfluencedBy")
    INFLUENCEDBY,
    @SerializedName("Taught")
    TAUGHT,
    @SerializedName("TaughtBy")
    TAUGHTBY,
    @SerializedName("MarriedTo")
    MARRIEDTO,
    @SerializedName("RomanticallyInvolvedWith")
    ROMANTICALLYINVOLVEDWITH,
    @SerializedName("Parent")
    PARENT,
    @SerializedName("Child")
    CHILD,
    @SerializedName("Sibling")
    SIBLING,
    @SerializedName("WorkedWith")
    WORKEDWITH,
}
