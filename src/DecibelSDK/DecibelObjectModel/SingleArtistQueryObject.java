package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class SingleArtistQueryObject extends QueryObject { 
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

    private ArtistSearchType idTypeField;

    /**
     * @return the IdType
     */
    public ArtistSearchType getIdType() {
        return idTypeField;
    }

    /**
     * @param idType the IdType to set
     */
    public void setIdType(ArtistSearchType idType) {
        this.idTypeField = idType;
    }

    private ArtistRetrievalDepth retrievalDepthField;

    /**
     * @return the RetrievalDepth
     */
    public ArtistRetrievalDepth getRetrievalDepth() {
        return retrievalDepthField;
    }

    /**
     * @param retrievalDepth the RetrievalDepth to set
     */
    public void setRetrievalDepth(ArtistRetrievalDepth retrievalDepth) {
        this.retrievalDepthField = retrievalDepth;
    }

}
