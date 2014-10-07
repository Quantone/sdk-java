package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlbumsByIdQueryObject extends QueryObject { 
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

    private AlbumRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public AlbumRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(AlbumRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

}
