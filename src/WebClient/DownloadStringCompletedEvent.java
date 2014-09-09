package WebClient;

import java.util.EventObject;

/**
 * Occurs when an asynchronous resource-download operation completes.
 */
public class DownloadStringCompletedEvent extends EventObject {

    /**
     * A String that contains the downloaded data.
     */
    public String Result;
    /**
     * A value indicating which error occurred during an asynchronous operation.
     */
    public Exception Error;

    /**
     * Creates new DownloadStringCompletedEvent.
     * @param source The object on which the Event initially occurred.
     */
    public DownloadStringCompletedEvent(Object source) {
        super(source);
    }
}