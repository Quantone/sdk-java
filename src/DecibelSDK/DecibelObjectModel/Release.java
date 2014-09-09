package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class Release extends DecibelEntity { 
    private String idField;

    /**
     * @return the Id
     */
    public String getId() {
        return idField;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.idField = id;
    }

    private String releaseDateField;

    /**
     * @return the ReleaseDate
     */
    public String getReleaseDate() {
        return releaseDateField;
    }

    /**
     * @param releaseDate the ReleaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDateField = releaseDate;
    }

    private String releaseRegionLiteralField;

    /**
     * @return the ReleaseRegionLiteral
     */
    public String getReleaseRegionLiteral() {
        return releaseRegionLiteralField;
    }

    /**
     * @param releaseRegionLiteral the ReleaseRegionLiteral to set
     */
    public void setReleaseRegionLiteral(String releaseRegionLiteral) {
        this.releaseRegionLiteralField = releaseRegionLiteral;
    }

    private String labelLiteralField;

    /**
     * @return the LabelLiteral
     */
    public String getLabelLiteral() {
        return labelLiteralField;
    }

    /**
     * @param labelLiteral the LabelLiteral to set
     */
    public void setLabelLiteral(String labelLiteral) {
        this.labelLiteralField = labelLiteral;
    }

    private List<Identifier> identifiersField;

    /**
     * @return the Identifiers
     */
    public List<Identifier> getIdentifiers() {
        return identifiersField;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiersField = identifiers;
    }

}
