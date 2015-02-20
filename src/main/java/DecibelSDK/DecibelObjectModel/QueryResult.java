package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class QueryResult<TDataObject> extends BaseQueryResult<TDataObject>{
    private Integer totalCount;

    /**
     * @return the TotalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount the TotalCount to set
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    private Integer pageCount;

    /**
     * @return the PageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the PageCount to set
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    private Integer pageSize;

    /**
     * @return the PageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the PageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
