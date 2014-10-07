package DecibelSDK.DecibelQuery;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.ErrorHandler;
import DecibelSDK.QueryBuilder;
import java.net.URI;
import java.util.List;

public class QueryAlbumsById extends QueryAlbumsByIdBuild{
    private Album result;

    /**
     * The result of the query
     */
    public Album getResult() {
        return result;
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
    public void run() {
        try {
            URI queryStr = buildQueryString();
            Object resObj = QueryBuilder.<AlbumsByIdQueryResult>runQuery(queryStr, xml);

            if(resObj instanceof ErrorHandler) {
                error = (ErrorHandler) resObj;
            } else {
                AlbumsByIdQueryResult fullResult = (AlbumsByIdQueryResult) resObj;
                result = fullResult.getResult();
                error = new ErrorHandler();
            }

        } catch (Exception ex) {
            error = new ErrorHandler(ex.getMessage());
        }
    }
}

