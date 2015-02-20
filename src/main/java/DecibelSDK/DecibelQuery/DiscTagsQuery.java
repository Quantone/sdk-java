package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class DiscTagsQuery implements Query<DiscTagsQueryResult>{
    public String getQueryString() {
        return buildQueryString();
    }
    private String taggedItemId;

    /**
     * @return the taggedItemId
     */
    public String getTaggedItemId() {
        return taggedItemId;
    }

    /**
     * @param taggedItemId the taggedItemId to set
     */
    public void setTaggedItemId(String taggedItemId) {
        this.taggedItemId = taggedItemId;
    }

    private DiscTagIdType idType;

    /**
     * @return the idType
     */
    public DiscTagIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(DiscTagIdType idType) {
        this.idType = idType;
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

    public String buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("DiscTags?");

        queryStr.append(valueOrDefault("taggeditemid", taggedItemId, null));
        queryStr.append(valueOrDefault("idtype", idType, DiscTagIdType.DECIBELALBUM));
        queryStr.append(valueOrDefault("language", language, null));

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
