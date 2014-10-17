package com.decibel.decibelsdk.QueryBuilderTests;

import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.DecibelQuery.*;
import DecibelSDK.InternalUtilities;
import java.util.Arrays;
import java.util.Collection;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BuildArtistsByIdQuery {
    private ArtistsByIdQuery qo;
    private String expectedQueryString;
    
    @Before
    public void inititalize(){
        
    }
    
    public BuildArtistsByIdQuery(ArtistsByIdQuery qo, String expectedQueryString){
        this.qo = qo;
        this.expectedQueryString = expectedQueryString;
    }
    
    @Parameterized.Parameters
    public static Collection ArtistsByIdQueries(){
        // Id
        ArtistsByIdQuery id = new ArtistsByIdQuery();
        id.setId("12345");
        
        // Depth
        ArtistsByIdQuery depthIdentifiers = new ArtistsByIdQuery();
        depthIdentifiers.setId("12345");
        depthIdentifiers.setDepth(Arrays.asList(ArtistRetrievalDepth.IDENTIFIERS));
        ArtistsByIdQuery depthIdentifiersGenres = new ArtistsByIdQuery();
        depthIdentifiersGenres.setId("12345");
        depthIdentifiersGenres.setDepth(Arrays.asList(
                ArtistRetrievalDepth.IDENTIFIERS, 
                ArtistRetrievalDepth.GENRES));
        
        return Arrays.asList(new Object[][]{
            {id, "Artists/12345"},
            {depthIdentifiers, "Artists/12345?depth=IDENTIFIERS"},
            {depthIdentifiersGenres, "Artists/12345?depth=IDENTIFIERS,GENRES"},
        });
    }
    
    @Test
    public void testBuildArtistsByIdQuery(){
        Assert.assertEquals(InternalUtilities.BASEURL + expectedQueryString, qo.buildQueryString());
    }
}
