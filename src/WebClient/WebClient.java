package WebClient;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Creates an asynchronous web request with event registration and notification.
 */
public class WebClient implements Runnable {

    /**
     * The web request URL.
     */
    private String mURL;
    /**
     * The web request header authentication.
     */
    public Map<String, String> Headers;
    /**
     * The asynchronous request thread.
     */
    private Thread mThread;

    /**
     * Creates new WebClient.
     *
     * @param url The request URL.
     */
    public WebClient() {
        this.mThread = new Thread();
        Headers = new HashMap<>();
    }

    /*
     * Downloads a String from a resource, without blocking the calling thread.
     */
    public void downloadStringAsync(String url) {
        this.mURL = url;
        this.mThread = new Thread(this);
        this.mThread.start();
    }

    /*
     * Cancels a pending asynchronous operation.
     */
    public void stop() {
        try {
            this.mThread.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Run the thread. Calls here will not block the other threads.
     */
    @Override
    public void run() {
        downloadString(this.mURL);
    }

    /**
     * Creates a connection to the URL, sends request headers and raises the
     * WebClientEvent containing the response.
     */
    public void downloadString(String url) {
        DownloadStringCompletedEvent event = new DownloadStringCompletedEvent(this);
        try {
            URLConnection urlConnection = new URL(url).openConnection();
            // Set request headers from map of key, value pairs
            Set s = Headers.entrySet();
            Iterator it = s.iterator();
            while (it.hasNext()) {
                Map.Entry m = (Map.Entry) it.next();
                String key = (String) m.getKey();
                String value = (String) m.getValue();
                urlConnection.setRequestProperty(key, value);
            }
            event.Result = (inputStreamToString(urlConnection.getInputStream()));
        } catch (Exception e) {
            event.Error = e;
        }
        fireDownloadStringCompletedEvent(event);
    }

    /**
     * Converts an input stream to a string.
     *
     * @param is The input stream.
     * @return The input stream converted to a string.
     * @throws IOException
     */
    public static String inputStreamToString(InputStream is)
            throws IOException {
        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = bis.read();
        while (result != -1) {
            byte b = (byte) result;
            buf.write(b);
            result = bis.read();
        }
        return buf.toString();
    }
    /**
     * Create the listener list.
     */
    protected javax.swing.event.EventListenerList listenerList =
            new javax.swing.event.EventListenerList();

    /**
     * This methods allows classes to register for WebClient events.
     *
     * @param listener The event listener.
     */
    public void addWebClientEventListener(WebClientListener listener) {
        listenerList.add(WebClientListener.class, listener);
    }

    /**
     * This methods allows classes to unregister for WebClient events.
     *
     * @param listener The event listener.
     */
    public void removeWebClientListener(WebClientListener listener) {
        listenerList.remove(WebClientListener.class, listener);
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type.
     *
     * @param evt Event arguments.
     */
    private void fireDownloadStringCompletedEvent(DownloadStringCompletedEvent evt) {
        Object[] listeners = listenerList.getListenerList();
        // Each listener occupies two elements - the first is the listener class
        // and the second is the listener instance
        for (int i = 0; i < listeners.length; i += 2) {
            if (listeners[i] == WebClientListener.class) {
                ((WebClientListener) listeners[i + 1]).downloadStringCompleted(evt);
            }
        }
    }
}