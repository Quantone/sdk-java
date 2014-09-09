package DecibelSDK.DecibelObjectModel;

import java.util.List;

public abstract class QueryResult<TQuery, TDataObject> { 
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

    private List<TDataObject> resultSetField;

    /**
     * @return the ResultSet
     */
    public List<TDataObject> getResultSet() {
        return resultSetField;
    }

    /**
     * @param resultSet the ResultSet to set
     */
    public void setResultSet(List<TDataObject> resultSet) {
        this.resultSetField = resultSet;
    }

    private Integer resultCountField;

    /**
     * @return the ResultCount
     */
    public Integer getResultCount() {
        return resultCountField;
    }

    /**
     * @param resultCount the ResultCount to set
     */
    public void setResultCount(Integer resultCount) {
        this.resultCountField = resultCount;
    }

}
