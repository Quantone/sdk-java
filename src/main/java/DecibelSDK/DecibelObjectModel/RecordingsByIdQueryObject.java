package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordingsByIdQueryObject extends QueryObject { 
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
