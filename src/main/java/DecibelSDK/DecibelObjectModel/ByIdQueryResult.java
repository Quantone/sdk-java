package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ByIdQueryResult<TDataObject>{
    private TDataObject result;

    /**
     * @return the Result
     */
    public TDataObject getResult() {
        return result;
    }

    /**
     * @param result the Result to set
     */
    public void setResult(TDataObject result) {
        this.result = result;
    }

}
