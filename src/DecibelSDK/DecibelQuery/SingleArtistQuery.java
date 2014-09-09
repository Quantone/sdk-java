package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.ErrorHandler;
import DecibelSDK.QueryBuilder;
import java.net.URI;
import java.util.List;

public class SingleArtistQuery extends SingleArtistByIdQueryBuild{
    private Artist result;

    /**
     * The result of the query
     */
    public Artist getResult() {
        return result;
    }

    private SingleArtistQueryObject search;

    /**
     * The search performed by the query, as seen by the server. Includes paging information
     */
    public SingleArtistQueryObject getSearch() {
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
            URI queryStr = QueryBuilder.<SingleArtistQuery>buildQuery(this);
            Object resObj = QueryBuilder.<SingleArtistQueryResult>runQuery(queryStr, xml);

            if(resObj instanceof ErrorHandler) {
                error = (ErrorHandler) resObj;
            } else {
                SingleArtistQueryResult fullResult = (SingleArtistQueryResult) resObj;
                result = fullResult.getResult();
                search = fullResult.getSearch();
                error = new ErrorHandler();
            }

        } catch (Exception ex) {
            error = new ErrorHandler(ex.getMessage());
        }
    }
}

