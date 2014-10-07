package com.decibel.decibelsdk;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.DecibelQuery.*;
import DecibelSDK.DecibelUtilities;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;



public class QueryTests {
    @Test
    public void queryAlbums(){
        // TODO: work out how to do make a test setup method in JUnit
        DecibelUtilities.SetKeys("", "");
        
        // Arrange
        QueryAlbums qo = new QueryAlbums();
        qo.setTitle("Rumours");
        qo.setDateReleased("1977");
        qo.setDepth(Arrays.asList(AlbumRetrievalDepth.ARTISTDETAILS, AlbumRetrievalDepth.GENRES));
        qo.setTitleSearchType(AlbumSearchType.FULLNAME);
        qo.setArtist(Arrays.asList("Fleetwood Mac"));
        
        // Act
        qo.run();
        
        // Assert
        
    }
}
