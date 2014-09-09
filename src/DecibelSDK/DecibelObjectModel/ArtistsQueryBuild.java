package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class ArtistsQueryBuild { 
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

    private String dateBornField;

    /**
     * @return the DateBorn
     */
    public String getDateBorn() {
        return dateBornField;
    }

    /**
     * @param dateBorn the DateBorn to set
     */
    public void setDateBorn(String dateBorn) {
        this.dateBornField = dateBorn;
    }

    private String dateDiedField;

    /**
     * @return the DateDied
     */
    public String getDateDied() {
        return dateDiedField;
    }

    /**
     * @param dateDied the DateDied to set
     */
    public void setDateDied(String dateDied) {
        this.dateDiedField = dateDied;
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

    private String orderByField;

    /**
     * @return the OrderBy
     */
    public String getOrderBy() {
        return orderByField;
    }

    /**
     * @param orderBy the OrderBy to set
     */
    public void setOrderBy(String orderBy) {
        this.orderByField = orderBy;
    }

    private ArtistRetrievalDepth[] depthField;

    /**
     * @return the Depth
     */
    public ArtistRetrievalDepth[] getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(ArtistRetrievalDepth[] depth) {
        this.depthField = depth;
    }

    private Integer pageNumberField;

    /**
     * @return the PageNumber
     */
    public Integer getPageNumber() {
        return pageNumberField;
    }

    /**
     * @param pageNumber the PageNumber to set
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumberField = pageNumber;
    }

    private Integer pageSizeField;

    /**
     * @return the PageSize
     */
    public Integer getPageSize() {
        return pageSizeField;
    }

    /**
     * @param pageSize the PageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSizeField = pageSize;
    }

}
