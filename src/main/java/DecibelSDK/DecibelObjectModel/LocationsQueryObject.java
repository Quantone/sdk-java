package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocationsQueryObject extends SearchQueryObject{
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

    private LocationIdType idType;

    /**
     * @return the IdType
     */
    public LocationIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(LocationIdType idType) {
        this.idType = idType;
    }

    private List<OrderLocationsBy> orderingProperties;

    /**
     * @return the OrderingProperties
     */
    public List<OrderLocationsBy> getOrderingProperties() {
        return orderingProperties;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderLocationsBy> orderingProperties) {
        this.orderingProperties = orderingProperties;
    }

    private LocationRetrievalDepth retrievalDepth;

    /**
     * @return the RetrievalDepth
     */
    public LocationRetrievalDepth getRetrievalDepth() {
        return retrievalDepth;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(LocationRetrievalDepth retrievalDepth) {
        this.retrievalDepth = retrievalDepth;
    }

}
