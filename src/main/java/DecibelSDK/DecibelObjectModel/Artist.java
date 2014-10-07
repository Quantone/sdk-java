package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Artist extends DecibelEntity { 
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

    private Probability probabilityField;

    /**
     * @return the Probability
     */
    public Probability getProbability() {
        return probabilityField;
    }

    /**
     * @param probability the Probability to set
     */
    public void setProbability(Probability probability) {
        this.probabilityField = probability;
    }

    private String joinField;

    /**
     * @return the Join
     */
    public String getJoin() {
        return joinField;
    }

    /**
     * @param join the Join to set
     */
    public void setJoin(String join) {
        this.joinField = join;
    }

    private AppearanceType appearanceTypeField;

    /**
     * @return the AppearanceType
     */
    public AppearanceType getAppearanceType() {
        return appearanceTypeField;
    }

    /**
     * @param appearanceType the AppearanceType to set
     */
    public void setAppearanceType(AppearanceType appearanceType) {
        this.appearanceTypeField = appearanceType;
    }

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

    private String nameLiteralField;

    /**
     * @return the NameLiteral
     */
    public String getNameLiteral() {
        return nameLiteralField;
    }

    /**
     * @param nameLiteral the NameLiteral to set
     */
    public void setNameLiteral(String nameLiteral) {
        this.nameLiteralField = nameLiteral;
    }

    private String stageNameField;

    /**
     * @return the StageName
     */
    public String getStageName() {
        return stageNameField;
    }

    /**
     * @param stageName the StageName to set
     */
    public void setStageName(String stageName) {
        this.stageNameField = stageName;
    }

    private String realNameField;

    /**
     * @return the RealName
     */
    public String getRealName() {
        return realNameField;
    }

    /**
     * @param realName the RealName to set
     */
    public void setRealName(String realName) {
        this.realNameField = realName;
    }

    private String datesField;

    /**
     * @return the Dates
     */
    public String getDates() {
        return datesField;
    }

    /**
     * @param dates the Dates to set
     */
    public void setDates(String dates) {
        this.datesField = dates;
    }

    private String membershipDetailsField;

    /**
     * @return the MembershipDetails
     */
    public String getMembershipDetails() {
        return membershipDetailsField;
    }

    /**
     * @param membershipDetails the MembershipDetails to set
     */
    public void setMembershipDetails(String membershipDetails) {
        this.membershipDetailsField = membershipDetails;
    }

    private ArtistType artistTypeField;

    /**
     * @return the ArtistType
     */
    public ArtistType getArtistType() {
        return artistTypeField;
    }

    /**
     * @param artistType the ArtistType to set
     */
    public void setArtistType(ArtistType artistType) {
        this.artistTypeField = artistType;
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

    private boolean isFictionalField;

    /**
     * @return the IsFictional
     */
    public boolean getIsFictional() {
        return isFictionalField;
    }

    /**
     * @param isFictional the IsFictional to set
     */
    public void setIsFictional(boolean isFictional) {
        this.isFictionalField = isFictional;
    }

    private List<Genre> genresField;

    /**
     * @return the Genres
     */
    public List<Genre> getGenres() {
        return genresField;
    }

    /**
     * @param genres the Genres to set
     */
    public void setGenres(List<Genre> genres) {
        this.genresField = genres;
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

    private String birthPlaceField;

    /**
     * @return the BirthPlace
     */
    public String getBirthPlace() {
        return birthPlaceField;
    }

    /**
     * @param birthPlace the BirthPlace to set
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlaceField = birthPlace;
    }

    private String deathPlaceField;

    /**
     * @return the DeathPlace
     */
    public String getDeathPlace() {
        return deathPlaceField;
    }

    /**
     * @param deathPlace the DeathPlace to set
     */
    public void setDeathPlace(String deathPlace) {
        this.deathPlaceField = deathPlace;
    }

    private List<Annotation> annotationsField;

    /**
     * @return the Annotations
     */
    public List<Annotation> getAnnotations() {
        return annotationsField;
    }

    /**
     * @param annotations the Annotations to set
     */
    public void setAnnotations(List<Annotation> annotations) {
        this.annotationsField = annotations;
    }

    private List<Url> urlsField;

    /**
     * @return the Urls
     */
    public List<Url> getUrls() {
        return urlsField;
    }

    /**
     * @param urls the Urls to set
     */
    public void setUrls(List<Url> urls) {
        this.urlsField = urls;
    }

    private List<Artist> membersField;

    /**
     * @return the Members
     */
    public List<Artist> getMembers() {
        return membersField;
    }

    /**
     * @param members the Members to set
     */
    public void setMembers(List<Artist> members) {
        this.membersField = members;
    }

    private List<Artist> groupsField;

    /**
     * @return the Groups
     */
    public List<Artist> getGroups() {
        return groupsField;
    }

    /**
     * @param groups the Groups to set
     */
    public void setGroups(List<Artist> groups) {
        this.groupsField = groups;
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
