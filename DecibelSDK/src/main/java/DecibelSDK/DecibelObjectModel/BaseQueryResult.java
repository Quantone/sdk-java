package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class BaseQueryResult<TDataObject>{
    private List<TDataObject> results;

    /**
     * @return the Results
     */
    public List<TDataObject> getResults() {
        return results;
    }

    /**
     * @param results the Results to set
     */
    public void setResults(List<TDataObject> results) {
        this.results = results;
    }

    private Integer count;

    /**
     * @return the Count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the Count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

}
