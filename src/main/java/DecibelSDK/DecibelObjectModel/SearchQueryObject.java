package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SearchQueryObject extends QueryObject { 
    private Integer pageNumberField;

    /**
     * @return the PageNumber
     */
    public Integer getPageNumber() {
        return pageNumberField;
    }

    /**
     * @param pageNumber the PageNumber to set
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumberField = pageNumber;
    }

    private Integer pageSizeField;

    /**
     * @return the PageSize
     */
    public Integer getPageSize() {
        return pageSizeField;
    }

    /**
     * @param pageSize the PageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSizeField = pageSize;
    }

    private long updatedSinceField;

    /**
     * @return the UpdatedSince
     */
    public long getUpdatedSince() {
        return updatedSinceField;
    }

    /**
     * @param updatedSince the UpdatedSince to set
     */
    public void setUpdatedSince(long updatedSince) {
        this.updatedSinceField = updatedSince;
    }

}
