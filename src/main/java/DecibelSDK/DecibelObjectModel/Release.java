package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Release extends DecibelEntity{
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

    private String releaseDate;

    /**
     * @return the ReleaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the ReleaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private String releaseRegionLiteral;

    /**
     * @return the ReleaseRegionLiteral
     */
    public String getReleaseRegionLiteral() {
        return releaseRegionLiteral;
    }

    /**
     * @param releaseRegionLiteral the ReleaseRegionLiteral to set
     */
    public void setReleaseRegionLiteral(String releaseRegionLiteral) {
        this.releaseRegionLiteral = releaseRegionLiteral;
    }

    private String labelLiteral;

    /**
     * @return the LabelLiteral
     */
    public String getLabelLiteral() {
        return labelLiteral;
    }

    /**
     * @param labelLiteral the LabelLiteral to set
     */
    public void setLabelLiteral(String labelLiteral) {
        this.labelLiteral = labelLiteral;
    }

    private String formatTypes;

    /**
     * @return the FormatTypes
     */
    public String getFormatTypes() {
        return formatTypes;
    }

    /**
     * @param formatTypes the FormatTypes to set
     */
    public void setFormatTypes(String formatTypes) {
        this.formatTypes = formatTypes;
    }

    private ReleaseIdentifier[] identifiers;

    /**
     * @return the Identifiers
     */
    public ReleaseIdentifier[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(ReleaseIdentifier[] identifiers) {
        this.identifiers = identifiers;
    }

}
