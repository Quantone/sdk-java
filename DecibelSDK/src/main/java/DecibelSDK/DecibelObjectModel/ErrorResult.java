package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ErrorResult{
    private Error error;

    /**
     * @return the Error
     */
    public Error getError() {
        return error;
    }

    /**
     * @param error the Error to set
     */
    public void setError(Error error) {
        this.error = error;
    }

}
