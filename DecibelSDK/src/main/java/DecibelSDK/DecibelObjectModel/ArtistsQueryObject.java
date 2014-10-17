package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArtistsQueryObject extends SearchQueryObject{
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

    private ArtistSearchType nameSearchType;

    /**
     * @return the NameSearchType
     */
    public ArtistSearchType getNameSearchType() {
        return nameSearchType;
    }

    /**
     * @param nameSearchType the NameSearchType to set
     */
    public void setNameSearchType(ArtistSearchType nameSearchType) {
        this.nameSearchType = nameSearchType;
    }

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

    private ArtistIdType idType;

    /**
     * @return the IdType
     */
    public ArtistIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(ArtistIdType idType) {
        this.idType = idType;
    }

    private String birthDate;

    /**
     * @return the BirthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the BirthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private String deathDate;

    /**
     * @return the DeathDate
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * @param deathDate the DeathDate to set
     */
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    private Gender gender;

    /**
     * @return the Gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the Gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private String genre;

    /**
     * @return the Genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the Genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    private ArtistRetrievalDepth retrievalDepth;

    /**
     * @return the RetrievalDepth
     */
    public ArtistRetrievalDepth getRetrievalDepth() {
        return retrievalDepth;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(ArtistRetrievalDepth retrievalDepth) {
        this.retrievalDepth = retrievalDepth;
    }

    private List<OrderArtistsBy> orderingProperties;

    /**
     * @return the OrderingProperties
     */
    public List<OrderArtistsBy> getOrderingProperties() {
        return orderingProperties;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderArtistsBy> orderingProperties) {
        this.orderingProperties = orderingProperties;
    }

}
