package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Participation{
    private String activityLiteral;

    /**
     * @return the ActivityLiteral
     */
    public String getActivityLiteral() {
        return activityLiteral;
    }

    /**
     * @param activityLiteral the ActivityLiteral to set
     */
    public void setActivityLiteral(String activityLiteral) {
        this.activityLiteral = activityLiteral;
    }

    private Activity[] activities;

    /**
     * @return the Activities
     */
    public Activity[] getActivities() {
        return activities;
    }

    /**
     * @param activities the Activities to set
     */
    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }

    private Boolean isFeatured;

    /**
     * @return the IsFeatured
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    /**
     * @param isFeatured the IsFeatured to set
     */
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    private String artistsLiteral;

    /**
     * @return the ArtistsLiteral
     */
    public String getArtistsLiteral() {
        return artistsLiteral;
    }

    /**
     * @param artistsLiteral the ArtistsLiteral to set
     */
    public void setArtistsLiteral(String artistsLiteral) {
        this.artistsLiteral = artistsLiteral;
    }

    private Artist[] artists;

    /**
     * @return the Artists
     */
    public Artist[] getArtists() {
        return artists;
    }

    /**
     * @param artists the Artists to set
     */
    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

}
