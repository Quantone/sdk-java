package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Label extends DecibelEntity{
    private String id;

    /**
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private String name;

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    private Location[] locations;

    /**
     * @return the Locations
     */
    public Location[] getLocations() {
        return locations;
    }

    /**
     * @param locations the Locations to set
     */
    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    private LabelIdentifier[] identifiers;

    /**
     * @return the Identifiers
     */
    public LabelIdentifier[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(LabelIdentifier[] identifiers) {
        this.identifiers = identifiers;
    }

}
