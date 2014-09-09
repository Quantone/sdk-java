package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.ErrorHandler;
import DecibelSDK.QueryBuilder;
import java.net.URI;
import java.util.List;

public class SingleAlbumQuery extends SingleAlbumByIdQueryBuild{
    private Album result;

    /**
     * The result of the query
     */
    public Album getResult() {
        return result;
    }

    private SingleAlbumQueryObject search;

    /**
     * The search performed by the query, as seen by the server. Includes paging information
     */
    public SingleAlbumQueryObject getSearch() {
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
            URI queryStr = QueryBuilder.<SingleAlbumQuery>buildQuery(this);
            Object resObj = QueryBuilder.<SingleAlbumQueryResult>runQuery(queryStr, xml);

            if(resObj instanceof ErrorHandler) {
                error = (ErrorHandler) resObj;
            } else {
                SingleAlbumQueryResult fullResult = (SingleAlbumQueryResult) resObj;
                result = fullResult.getResult();
                search = fullResult.getSearch();
                error = new ErrorHandler();
            }

        } catch (Exception ex) {
            error = new ErrorHandler(ex.getMessage());
        }
    }
}

