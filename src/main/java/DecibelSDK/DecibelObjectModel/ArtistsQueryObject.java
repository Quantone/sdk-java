package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArtistsQueryObject extends SearchQueryObject { 
    private String nameField;

    /**
     * @return the Name
     */
    public String getName() {
        return nameField;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) {
        this.nameField = name;
    }

    private ArtistSearchType nameSearchTypeField;

    /**
     * @return the NameSearchType
     */
    public ArtistSearchType getNameSearchType() {
        return nameSearchTypeField;
    }

    /**
     * @param nameSearchType the NameSearchType to set
     */
    public void setNameSearchType(ArtistSearchType nameSearchType) {
        this.nameSearchTypeField = nameSearchType;
    }

    private String birthDateField;

    /**
     * @return the BirthDate
     */
    public String getBirthDate() {
        return birthDateField;
    }

    /**
     * @param birthDate the BirthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDateField = birthDate;
    }

    private String deathDateField;

    /**
     * @return the DeathDate
     */
    public String getDeathDate() {
        return deathDateField;
    }

    /**
     * @param deathDate the DeathDate to set
     */
    public void setDeathDate(String deathDate) {
        this.deathDateField = deathDate;
    }

    private Gender genderField;

    /**
     * @return the Gender
     */
    public Gender getGender() {
        return genderField;
    }

    /**
     * @param gender the Gender to set
     */
    public void setGender(Gender gender) {
        this.genderField = gender;
    }

    private String genreField;

    /**
     * @return the Genre
     */
    public String getGenre() {
        return genreField;
    }

    /**
     * @param genre the Genre to set
     */
    public void setGenre(String genre) {
        this.genreField = genre;
    }

    private ArtistRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public ArtistRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(ArtistRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

    private List<OrderArtistsBy> orderingPropertiesField;

    /**
     * @return the OrderingProperties
     */
    public List<OrderArtistsBy> getOrderingProperties() {
        return orderingPropertiesField;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderArtistsBy> orderingProperties) {
        this.orderingPropertiesField = orderingProperties;
    }

}
