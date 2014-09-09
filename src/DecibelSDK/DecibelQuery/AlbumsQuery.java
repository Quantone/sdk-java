package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.ErrorHandler;
import DecibelSDK.QueryBuilder;
import java.net.URI;
import java.util.List;

public class AlbumsQuery extends AlbumsQueryBuild{
    private List<Album> result;

    /**
     * The result of the query
     */
    public List<Album> getResult() {
        return result;
    }

    private AlbumQueryObject search;

    /**
     * The search performed by the query, as seen by the server. Includes paging information
     */
    public AlbumQueryObject getSearch() {
        return search;
    }

    private ErrorHandler error;

    /**
     * Any errors that occurred
     */
    public ErrorHandler getError() {
        return error;
    }

    private boolean xml;

    /**
     * Whether to return xml. False by default
     */
    public boolean isXml() {
        return xml;
    }

    public void setXml(boolean xml) {
        this.xml = xml;
    }

    /**
     * Run the query
     */
    public void Run() {
        try {
            URI queryStr = QueryBuilder.<AlbumsQuery>buildQuery(this);
            Object resObj = QueryBuilder.<AlbumQueryResult>runQuery(queryStr, xml);

            if(resObj instanceof ErrorHandler) {
                error = (ErrorHandler) resObj;
            } else {
                AlbumQueryResult fullResult = (AlbumQueryResult) resObj;
                result = fullResult.getResultSet();
                search = fullResult.getSearch();
                error = new ErrorHandler();
            }

        } catch (Exception ex) {
            error = new ErrorHandler(ex.getMessage());
        }
    }
}

