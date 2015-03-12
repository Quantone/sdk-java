package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LabelsQueryObject extends SearchQueryObject{
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

    private LabelIdType idType;

    /**
     * @return the IdType
     */
    public LabelIdType getIdType() {
        return idType;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(LabelIdType idType) {
        this.idType = idType;
    }

    private List<OrderLabelsBy> orderingProperties;

    /**
     * @return the OrderingProperties
     */
    public List<OrderLabelsBy> getOrderingProperties() {
        return orderingProperties;
    }

    /**
     * @param orderingProperties the OrderingProperties to set
     */
    public void setOrderingProperties(List<OrderLabelsBy> orderingProperties) {
        this.orderingProperties = orderingProperties;
    }

    private LabelRetrievalDepth retrievalDepth;

    /**
     * @return the RetrievalDepth
     */
    public LabelRetrievalDepth getRetrievalDepth() {
        return retrievalDepth;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(LabelRetrievalDepth retrievalDepth) {
        this.retrievalDepth = retrievalDepth;
    }

}
