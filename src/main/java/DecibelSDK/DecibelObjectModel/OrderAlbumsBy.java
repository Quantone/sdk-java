package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum OrderAlbumsBy { 
    NONE,
    DECIBELEMINENCE,
    DECIBELEMINENCEDESC,
    RELEASEDATE,
    RELEASEDATEDESC,
}