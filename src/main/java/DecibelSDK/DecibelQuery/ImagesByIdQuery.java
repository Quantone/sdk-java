package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.InternalUtilities;
import DecibelSDK.Query;
import java.util.List;

public class ImagesByIdQuery implements Query<ImagesByIdQueryResult>{
    public String getQueryString() {
        return buildQueryString();
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

    private ImageSize imageSize;

    /**
     * @return the imageSize
     */
    public ImageSize getImageSize() {
        return imageSize;
    }

    /**
     * @param imageSize the imageSize to set
     */
    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }

    public String buildQueryString(){
        StringBuilder queryStr = new StringBuilder(InternalUtilities.BASEURL);
        queryStr.append("Images/").append(id).append("?");

        queryStr.append(valueOrDefault("imagesize", imageSize, ImageSize.STANDARD));

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
