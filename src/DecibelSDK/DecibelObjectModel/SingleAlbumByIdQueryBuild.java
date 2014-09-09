package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleAlbumByIdQueryBuild { 
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

    private AlbumSearchIdType idTypeField;

    /**
     * @return the IdType
     */
    public AlbumSearchIdType getIdType() {
        return idTypeField;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(AlbumSearchIdType idType) {
        this.idTypeField = idType;
    }

    private AlbumRetrievalDepth[] depthField;

    /**
     * @return the Depth
     */
    public AlbumRetrievalDepth[] getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(AlbumRetrievalDepth[] depth) {
        this.depthField = depth;
    }

}
