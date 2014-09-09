package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleRecordingByIdQueryBuild { 
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

    private RecordingSearchIdType idTypeField;

    /**
     * @return the IdType
     */
    public RecordingSearchIdType getIdType() {
        return idTypeField;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(RecordingSearchIdType idType) {
        this.idTypeField = idType;
    }

    private RecordingRetrievalDepth[] depthField;

    /**
     * @return the Depth
     */
    public RecordingRetrievalDepth[] getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(RecordingRetrievalDepth[] depth) {
        this.depthField = depth;
    }

}
