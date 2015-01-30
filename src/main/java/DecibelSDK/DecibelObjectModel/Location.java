package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Location extends DecibelEntity{
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

    private Double latitude;

    /**
     * @return the Latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the Latitude to set
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    private Double longitude;

    /**
     * @return the Longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the Longitude to set
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    private LocationCategory category;

    /**
     * @return the Category
     */
    public LocationCategory getCategory() {
        return category;
    }

    /**
     * @param category the Category to set
     */
    public void setCategory(LocationCategory category) {
        this.category = category;
    }

    private LocationIdentifier[] identifiers;

    /**
     * @return the Identifiers
     */
    public LocationIdentifier[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(LocationIdentifier[] identifiers) {
        this.identifiers = identifiers;
    }

    private Location[] parentLocations;

    /**
     * @return the ParentLocations
     */
    public Location[] getParentLocations() {
        return parentLocations;
    }

    /**
     * @param parentLocations the ParentLocations to set
     */
    public void setParentLocations(Location[] parentLocations) {
        this.parentLocations = parentLocations;
    }

}
