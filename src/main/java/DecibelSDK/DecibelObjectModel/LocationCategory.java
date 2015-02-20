package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum LocationCategory{
    @SerializedName("Neighborhood")
    NEIGHBORHOOD,
    @SerializedName("County")
    COUNTY,
    @SerializedName("Village")
    VILLAGE,
    @SerializedName("Country")
    COUNTRY,
    @SerializedName("Department")
    DEPARTMENT,
    @SerializedName("Province")
    PROVINCE,
    @SerializedName("Colony")
    COLONY,
    @SerializedName("State")
    STATE,
    @SerializedName("Hamlet")
    HAMLET,
    @SerializedName("Town")
    TOWN,
    @SerializedName("Venue")
    VENUE,
    @SerializedName("City")
    CITY,
    @SerializedName("Region")
    REGION,
    @SerializedName("Borough")
    BOROUGH,
    @SerializedName("Territory")
    TERRITORY,
    @SerializedName("Principality")
    PRINCIPALITY,
}
