package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class LabelsQuery implements Query<LabelsQueryResult>{
    public String getQueryString() {
        return buildQueryString();
    }
    private List<String> locationIds;

    /**
     * @return the locationIds
     */
    public List<String> getLocationIds() {
        return locationIds;
    }

    /**
     * @param locationIds the locationIds to set
     */
    public void setLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
    }

    private List<OrderLabelsBy> orderBy;

    /**
     * @return the orderBy
     */
    public List<OrderLabelsBy> getOrderBy() {
        return orderBy;
    }

    /**
     * @param orderBy the orderBy to set
     */
    public void setOrderBy(List<OrderLabelsBy> orderBy) {
        this.orderBy = orderBy;
    }

    private List<LabelRetrievalDepth> depth;

    /**
     * @return the depth
     */
    public List<LabelRetrievalDepth> getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(List<LabelRetrievalDepth> depth) {
        this.depth = depth;
    }

    private LabelIdType idType;

    /**
     * @return the idType
     */
    public LabelIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(LabelIdType idType) {
        this.idType = idType;
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
        queryStr.append("Labels?");

        queryStr.append(valueOrDefault("locationids", locationIds, null));
        queryStr.append(valueOrDefault("orderby", orderBy, null));
        queryStr.append(valueOrDefault("depth", depth, null));
        queryStr.append(valueOrDefault("idtype", idType, LabelIdType.DECIBEL));
        queryStr.append(valueOrDefault("id", id, null));
        queryStr.append(valueOrDefault("language", language, null));
        queryStr.append(valueOrDefault("pagenumber", pageNumber, null));
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
