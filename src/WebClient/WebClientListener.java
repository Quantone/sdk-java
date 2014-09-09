package WebClient;

import java.util.EventListener;

/**
 * The listener interface for receiving WebClient events.
 */
public interface WebClientListener extends EventListener {

    /**
     * Occurs when an asynchronous resource-download operation is completed.
     * 
     * @param evt Event arguments.
     */
    public void downloadStringCompleted(DownloadStringCompletedEvent evt);
}