package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.ErrorHandler;
import DecibelSDK.QueryBuilder;
import java.net.URI;
import java.util.List;

public class SingleRecordingQuery extends SingleRecordingByIdQueryBuild{
    private Recording result;

    /**
     * The result of the query
     */
    public Recording getResult() {
        return result;
    }

    private SingleRecordingQueryObject search;

    /**
     * The search performed by the query, as seen by the server. Includes paging information
     */
    public SingleRecordingQueryObject getSearch() {
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
            URI queryStr = QueryBuilder.<SingleRecordingQuery>buildQuery(this);
            Object resObj = QueryBuilder.<SingleRecordingQueryResult>runQuery(queryStr, xml);

            if(resObj instanceof ErrorHandler) {
                error = (ErrorHandler) resObj;
            } else {
                SingleRecordingQueryResult fullResult = (SingleRecordingQueryResult) resObj;
                result = fullResult.getResult();
                search = fullResult.getSearch();
                error = new ErrorHandler();
            }

        } catch (Exception ex) {
            error = new ErrorHandler(ex.getMessage());
        }
    }
}

