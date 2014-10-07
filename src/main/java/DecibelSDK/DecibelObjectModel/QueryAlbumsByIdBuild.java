package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryAlbumsByIdBuild { 
    private List<AlbumRetrievalDepth> depthField;

    /**
     * @return the Depth
     */
    public List<AlbumRetrievalDepth> getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(List<AlbumRetrievalDepth> depth) {
        this.depthField = depth;
    }

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

    public URI buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Albums?");

        queryStr.append(valueOrDefault("depth", depthField, null));
        queryStr.append(valueOrDefault("id", idField, null));
        queryStr.append(valueOrDefault("language", languageField, null));

        try {
            return new URI(InternalUtilities.trimEnd(queryStr.toString(), '&'));
        } catch (URISyntaxException ex) {
            Logger.getLogger(QueryAlbumsByIdBuild.class.getName()).log(Level.SEVERE, null, ex);
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
