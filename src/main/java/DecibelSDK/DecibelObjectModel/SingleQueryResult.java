package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
