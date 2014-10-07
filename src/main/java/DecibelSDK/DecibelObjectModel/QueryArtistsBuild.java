package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryArtistsBuild { 
    private List<OrderArtistsBy> orderByField;

    /**
     * @return the OrderBy
     */
    public List<OrderArtistsBy> getOrderBy() {
        return orderByField;
    }

    /**
     * @param orderBy the OrderBy to set
     */
    public void setOrderBy(List<OrderArtistsBy> orderBy) {
        this.orderByField = orderBy;
    }

    private List<ArtistRetrievalDepth> depthField;

    /**
     * @return the Depth
     */
    public List<ArtistRetrievalDepth> getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(List<ArtistRetrievalDepth> depth) {
        this.depthField = depth;
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

    private Language languageField;

    /**
     * @return the Language
     */
    public Language getLanguage() {
        return languageField;
    }

    /**
     * @param language the Language to set
     */
    public void setLanguage(Language language) {
        this.languageField = language;
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

    private long updatedSinceField;

    /**
     * @return the UpdatedSince
     */
    public long getUpdatedSince() {
        return updatedSinceField;
    }

    /**
     * @param updatedSince the UpdatedSince to set
     */
    public void setUpdatedSince(long updatedSince) {
        this.updatedSinceField = updatedSince;
    }

    public URI buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Artists?");

        queryStr.append(valueOrDefault("orderby", orderByField, null));
        queryStr.append(valueOrDefault("depth", depthField, null));
        queryStr.append(valueOrDefault("namesearchtype", nameSearchTypeField, null));
        queryStr.append(valueOrDefault("name", nameField, null));
        queryStr.append(valueOrDefault("language", languageField, null));
        queryStr.append(valueOrDefault("dateborn", dateBornField, null));
        queryStr.append(valueOrDefault("datedied", dateDiedField, null));
        queryStr.append(valueOrDefault("gender", genderField, null));
        queryStr.append(valueOrDefault("pagenumber", pageNumberField, null));
        queryStr.append(valueOrDefault("pagesize", pageSizeField, null));
        queryStr.append(valueOrDefault("updatedsince", updatedSinceField, null));

        try {
            return new URI(InternalUtilities.trimEnd(queryStr.toString(), '&'));
        } catch (URISyntaxException ex) {
            Logger.getLogger(QueryArtistsBuild.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private static String valueOrDefault(String paramName, Object value, Object defaultValue){
        if(value == null) return "";
        if(!value.getClass().toString().toLowerCase().contains("array"))
            return value == defaultValue ? "" : paramName + "=" + value + "&";

        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append(paramName).append("=");
        for(Object item : (List<Object>)value)
            queryStr.append(item).append(";");
        queryStr.append("&");
        return queryStr.toString();
    }
}
