package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleRecordingQueryObject extends QueryObject { 
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

    private RecordingSearchType idTypeField;

    /**
     * @return the IdType
     */
    public RecordingSearchType getIdType() {
        return idTypeField;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(RecordingSearchType idType) {
        this.idTypeField = idType;
    }

    private RecordingRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public RecordingRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(RecordingRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

}
