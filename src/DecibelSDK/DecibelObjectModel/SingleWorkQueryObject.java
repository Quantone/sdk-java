package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleWorkQueryObject extends QueryObject { 
    private String decibelIdField;

    /**
     * @return the DecibelId
     */
    public String getDecibelId() {
        return decibelIdField;
    }

    /**
     * @param decibelId the DecibelId to set
     */
    public void setDecibelId(String decibelId) {
        this.decibelIdField = decibelId;
    }

    private WorkRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public WorkRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(WorkRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

}
