package DecibelSDK.DecibelObjectModel;

import java.util.List;

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

}
