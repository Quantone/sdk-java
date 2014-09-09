package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class WorkQueryObject extends SearchQueryObject { 
    private String nameField;

    /**
     * @return the Name
     */
    public String getName() {
        return nameField;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) {
        this.nameField = name;
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

    private List<String> composersField;

    /**
     * @return the Composers
     */
    public List<String> getComposers() {
        return composersField;
    }

    /**
     * @param composers the Composers to set
     */
    public void setComposers(List<String> composers) {
        this.composersField = composers;
    }

}
