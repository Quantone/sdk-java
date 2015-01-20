package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class ArtistsQuery implements Query<ArtistsQueryResult>{
    public String getQueryString() {
        return buildQueryString();
    }
    private List<OrderArtistsBy> orderBy;

    /**
     * @return the orderBy
     */
    public List<OrderArtistsBy> getOrderBy() {
        return orderBy;
    }

    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(List<OrderArtistsBy> orderBy) {
        this.orderBy = orderBy;
    }

    private List<ArtistRetrievalDepth> depth;

    /**
     * @return the depth
     */
    public List<ArtistRetrievalDepth> getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(List<ArtistRetrievalDepth> depth) {
        this.depth = depth;
    }

    private ArtistSearchType nameSearchType;

    /**
     * @return the nameSearchType
     */
    public ArtistSearchType getNameSearchType() {
        return nameSearchType;
    }

    /**
     * @param nameSearchType the nameSearchType to set
     */
    public void setNameSearchType(ArtistSearchType nameSearchType) {
        this.nameSearchType = nameSearchType;
    }

    private ArtistIdType idType;

    /**
     * @return the idType
     */
    public ArtistIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(ArtistIdType idType) {
        this.idType = idType;
    }

    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    private String id;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private Language language;

    /**
     * @return the language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    private String dateBorn;

    /**
     * @return the dateBorn
     */
    public String getDateBorn() {
        return dateBorn;
    }

    /**
     * @param dateBorn the dateBorn to set
     */
    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    private String dateDied;

    /**
     * @return the dateDied
     */
    public String getDateDied() {
        return dateDied;
    }

    /**
     * @param dateDied the dateDied to set
     */
    public void setDateDied(String dateDied) {
        this.dateDied = dateDied;
    }

    private Gender gender;

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Integer pageNumber;

    /**
     * @return the pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    private Integer pageSize;

    /**
     * @return the pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private Integer updatedSince;

    /**
     * @return the updatedSince
     */
    public Integer getUpdatedSince() {
        return updatedSince;
    }

    /**
     * @param updatedSince the updatedSince to set
     */
    public void setUpdatedSince(Integer updatedSince) {
        this.updatedSince = updatedSince;
    }

    public String buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Artists?");

        queryStr.append(valueOrDefault("orderby", orderBy, null));
        queryStr.append(valueOrDefault("depth", depth, null));
        queryStr.append(valueOrDefault("namesearchtype", nameSearchType, ArtistSearchType.FULLNAME));
        queryStr.append(valueOrDefault("idtype", idType, ArtistIdType.DECIBEL));
        queryStr.append(valueOrDefault("name", name, null));
        queryStr.append(valueOrDefault("id", id, null));
        queryStr.append(valueOrDefault("language", language, null));
        queryStr.append(valueOrDefault("dateborn", dateBorn, null));
        queryStr.append(valueOrDefault("datedied", dateDied, null));
        queryStr.append(valueOrDefault("gender", gender, null));
        queryStr.append(valueOrDefault("pagenumber", pageNumber, 1));
        queryStr.append(valueOrDefault("pagesize", pageSize, null));
        queryStr.append(valueOrDefault("updatedsince", updatedSince, null));

        return queryStr.toString().replaceAll("[&,?]+$", "");
    }

    private static String valueOrDefault(String paramName, Object value, Object defaultValue){
        if(value == null || value.equals(defaultValue)) return "";
        if(!value.getClass().toString().toLowerCase().contains("array"))
            return value == defaultValue ? "" : paramName + "=" + value.toString().replace("[", "").replace("]", "") + "&";

        StringBuilder queryStr = new StringBuilder();
        queryStr.append(paramName).append("=");
        for(Object item : (List<Object>)value)
            queryStr.append(item).append(",");

        return InternalUtilities.trimEnd(queryStr.toString(), ',') + "&";
    }
}
