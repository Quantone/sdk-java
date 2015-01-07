package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class AlbumsByIdQuery implements Query<AlbumsByIdQueryResult>{
    public String getQueryString() {
        return buildQueryString();
    }
    private List<AlbumRetrievalDepth> depth;

    /**
     * @return the depth
     */
    public List<AlbumRetrievalDepth> getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(List<AlbumRetrievalDepth> depth) {
        this.depth = depth;
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

    public String buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Albums/").append(id).append("?");


        queryStr.append(valueOrDefault("depth", depth, null));
        queryStr.append(valueOrDefault("language", language, null));

        return queryStr.toString().replaceAll("[&,?]+$", "");
    }

    private static String valueOrDefault(String paramName, Object value, Object defaultValue){
        if(value == null || value.equals(defaultValue)) return "";
        if(!value.getClass().toString().toLowerCase().contains("array"))
            return value == defaultValue ? "" : paramName + "=" + value + "&";

        StringBuilder queryStr = new StringBuilder();
        queryStr.append(paramName).append("=");
        for(Object item : (List<Object>)value)
            queryStr.append(item).append(",");

        return InternalUtilities.trimEnd(queryStr.toString(), ',') + "&";
    }
}
