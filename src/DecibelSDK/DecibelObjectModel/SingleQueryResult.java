package DecibelSDK.DecibelObjectModel;

import java.util.List;

public abstract class SingleQueryResult<TQuery, TDataObject> { 
    private TQuery searchField;

    /**
     * @return the Search
     */
    public TQuery getSearch() {
        return searchField;
    }

    /**
     * @param search the Search to set
     */
    public void setSearch(TQuery search) {
        this.searchField = search;
    }

    private TDataObject resultField;

    /**
     * @return the Result
     */
    public TDataObject getResult() {
        return resultField;
    }

    /**
     * @param result the Result to set
     */
    public void setResult(TDataObject result) {
        this.resultField = result;
    }

}
