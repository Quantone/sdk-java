package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class Participation { 
    private String activityLiteralField;

    /**
     * @return the ActivityLiteral
     */
    public String getActivityLiteral() {
        return activityLiteralField;
    }

    /**
     * @param activityLiteral the ActivityLiteral to set
     */
    public void setActivityLiteral(String activityLiteral) {
        this.activityLiteralField = activityLiteral;
    }

    private List<Activity> activitiesField;

    /**
     * @return the Activities
     */
    public List<Activity> getActivities() {
        return activitiesField;
    }

    /**
     * @param activities the Activities to set
     */
    public void setActivities(List<Activity> activities) {
        this.activitiesField = activities;
    }

    private boolean isFeaturedField;

    /**
     * @return the IsFeatured
     */
    public boolean getIsFeatured() {
        return isFeaturedField;
    }

    /**
     * @param isFeatured the IsFeatured to set
     */
    public void setIsFeatured(boolean isFeatured) {
        this.isFeaturedField = isFeatured;
    }

    private String artistsLiteralField;

    /**
     * @return the ArtistsLiteral
     */
    public String getArtistsLiteral() {
        return artistsLiteralField;
    }

    /**
     * @param artistsLiteral the ArtistsLiteral to set
     */
    public void setArtistsLiteral(String artistsLiteral) {
        this.artistsLiteralField = artistsLiteral;
    }

    private List<Artist> artistsField;

    /**
     * @return the Artists
     */
    public List<Artist> getArtists() {
        return artistsField;
    }

    /**
     * @param artists the Artists to set
     */
    public void setArtists(List<Artist> artists) {
        this.artistsField = artists;
    }

}
