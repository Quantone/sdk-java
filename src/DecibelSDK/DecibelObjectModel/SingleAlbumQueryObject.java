package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleAlbumQueryObject extends QueryObject { 
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

    private AlbumSearchType idTypeField;

    /**
     * @return the IdType
     */
    public AlbumSearchType getIdType() {
        return idTypeField;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(AlbumSearchType idType) {
        this.idTypeField = idType;
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
