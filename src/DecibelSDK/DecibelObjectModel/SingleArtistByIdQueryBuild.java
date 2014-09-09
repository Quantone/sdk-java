package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleArtistByIdQueryBuild { 
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

    private ArtistSearchIdType idTypeField;

    /**
     * @return the IdType
     */
    public ArtistSearchIdType getIdType() {
        return idTypeField;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(ArtistSearchIdType idType) {
        this.idTypeField = idType;
    }

    private ArtistRetrievalDepth[] depthField;

    /**
     * @return the Depth
     */
    public ArtistRetrievalDepth[] getDepth() {
        return depthField;
    }

    /**
     * @param depth the Depth to set
     */
    public void setDepth(ArtistRetrievalDepth[] depth) {
        this.depthField = depth;
    }

}
