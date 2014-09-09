package DecibelSDK.DecibelObjectModel;

import java.util.List;

public abstract class SearchQueryResult<TQuery, TDataObject> extends QueryResult<TQuery, TDataObject> { 
    private long totalResultCountField;

    /**
     * @return the TotalResultCount
     */
    public long getTotalResultCount() {
        return totalResultCountField;
    }

    /**
     * @param totalResultCount the TotalResultCount to set
     */
    public void setTotalResultCount(long totalResultCount) {
        this.totalResultCountField = totalResultCount;
    }

    private Integer pageCountField;

    /**
     * @return the PageCount
     */
    public Integer getPageCount() {
        return pageCountField;
    }

    /**
     * @param pageCount the PageCount to set
     */
    public void setPageCount(Integer pageCount) {
        this.pageCountField = pageCount;
    }

}
