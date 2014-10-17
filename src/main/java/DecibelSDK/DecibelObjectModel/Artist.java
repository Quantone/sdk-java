package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Artist extends DecibelEntity{
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

    private Probability probability;

    /**
     * @return the Probability
     */
    public Probability getProbability() {
        return probability;
    }

    /**
     * @param probability the Probability to set
     */
    public void setProbability(Probability probability) {
        this.probability = probability;
    }

    private String join;

    /**
     * @return the Join
     */
    public String getJoin() {
        return join;
    }

    /**
     * @param join the Join to set
     */
    public void setJoin(String join) {
        this.join = join;
    }

    private AppearanceType appearanceType;

    /**
     * @return the AppearanceType
     */
    public AppearanceType getAppearanceType() {
        return appearanceType;
    }

    /**
     * @param appearanceType the AppearanceType to set
     */
    public void setAppearanceType(AppearanceType appearanceType) {
        this.appearanceType = appearanceType;
    }

    private String nameLiteral;

    /**
     * @return the NameLiteral
     */
    public String getNameLiteral() {
        return nameLiteral;
    }

    /**
     * @param nameLiteral the NameLiteral to set
     */
    public void setNameLiteral(String nameLiteral) {
        this.nameLiteral = nameLiteral;
    }

    private String stageName;

    /**
     * @return the StageName
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * @param stageName the StageName to set
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    private String legalName;

    /**
     * @return the LegalName
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * @param legalName the LegalName to set
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    private String membershipDate;

    /**
     * @return the MembershipDate
     */
    public String getMembershipDate() {
        return membershipDate;
    }

    /**
     * @param membershipDate the MembershipDate to set
     */
    public void setMembershipDate(String membershipDate) {
        this.membershipDate = membershipDate;
    }

    private ArtistType artistType;

    /**
     * @return the ArtistType
     */
    public ArtistType getArtistType() {
        return artistType;
    }

    /**
     * @param artistType the ArtistType to set
     */
    public void setArtistType(ArtistType artistType) {
        this.artistType = artistType;
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

    private Boolean isFictional;

    /**
     * @return the IsFictional
     */
    public Boolean getIsFictional() {
        return isFictional;
    }

    /**
     * @param isFictional the IsFictional to set
     */
    public void setIsFictional(Boolean isFictional) {
        this.isFictional = isFictional;
    }

    private Genre[] genres;

    /**
     * @return the Genres
     */
    public Genre[] getGenres() {
        return genres;
    }

    /**
     * @param genres the Genres to set
     */
    public void setGenres(Genre[] genres) {
        this.genres = genres;
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

    private String birthPlace;

    /**
     * @return the BirthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * @param birthPlace the BirthPlace to set
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    private String deathPlace;

    /**
     * @return the DeathPlace
     */
    public String getDeathPlace() {
        return deathPlace;
    }

    /**
     * @param deathPlace the DeathPlace to set
     */
    public void setDeathPlace(String deathPlace) {
        this.deathPlace = deathPlace;
    }

    private Annotation[] biographies;

    /**
     * @return the Biographies
     */
    public Annotation[] getBiographies() {
        return biographies;
    }

    /**
     * @param biographies the Biographies to set
     */
    public void setBiographies(Annotation[] biographies) {
        this.biographies = biographies;
    }

    private Annotation[] shortDescriptions;

    /**
     * @return the ShortDescriptions
     */
    public Annotation[] getShortDescriptions() {
        return shortDescriptions;
    }

    /**
     * @param shortDescriptions the ShortDescriptions to set
     */
    public void setShortDescriptions(Annotation[] shortDescriptions) {
        this.shortDescriptions = shortDescriptions;
    }

    private WebAddress[] webAddresses;

    /**
     * @return the WebAddresses
     */
    public WebAddress[] getWebAddresses() {
        return webAddresses;
    }

    /**
     * @param webAddresses the WebAddresses to set
     */
    public void setWebAddresses(WebAddress[] webAddresses) {
        this.webAddresses = webAddresses;
    }

    private Artist[] members;

    /**
     * @return the Members
     */
    public Artist[] getMembers() {
        return members;
    }

    /**
     * @param members the Members to set
     */
    public void setMembers(Artist[] members) {
        this.members = members;
    }

    private Artist[] groups;

    /**
     * @return the Groups
     */
    public Artist[] getGroups() {
        return groups;
    }

    /**
     * @param groups the Groups to set
     */
    public void setGroups(Artist[] groups) {
        this.groups = groups;
    }

    private Artist[] relatedArtists;

    /**
     * @return the RelatedArtists
     */
    public Artist[] getRelatedArtists() {
        return relatedArtists;
    }

    /**
     * @param relatedArtists the RelatedArtists to set
     */
    public void setRelatedArtists(Artist[] relatedArtists) {
        this.relatedArtists = relatedArtists;
    }

    private ArtistIdentifier[] identifiers;

    /**
     * @return the Identifiers
     */
    public ArtistIdentifier[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers the Identifiers to set
     */
    public void setIdentifiers(ArtistIdentifier[] identifiers) {
        this.identifiers = identifiers;
    }

}
