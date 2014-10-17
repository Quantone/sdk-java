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
public class BuildAlbumsByIdQuery {
    private AlbumsByIdQuery qo;
    private String expectedQueryString;
    
    @Before
    public void inititalize(){
        
    }
    
    public BuildAlbumsByIdQuery(AlbumsByIdQuery qo, String expectedQueryString){
        this.qo = qo;
        this.expectedQueryString = expectedQueryString;
    }
    
    @Parameterized.Parameters
    public static Collection AlbumsByIdQueries(){
        // Id
        AlbumsByIdQuery id = new AlbumsByIdQuery();
        id.setId("12345");
        
        // Depth
        AlbumsByIdQuery depthIdentifiers = new AlbumsByIdQuery();
        depthIdentifiers.setId("12345");
        depthIdentifiers.setDepth(Arrays.asList(AlbumRetrievalDepth.IDENTIFIERS));
        AlbumsByIdQuery depthIdentifiersGenres = new AlbumsByIdQuery();
        depthIdentifiersGenres.setId("12345");
        depthIdentifiersGenres.setDepth(Arrays.asList(
                AlbumRetrievalDepth.IDENTIFIERS, 
                AlbumRetrievalDepth.GENRES));
        AlbumsByIdQuery depthIdentifiersGenresParticipationsRecordings = new AlbumsByIdQuery();
        depthIdentifiersGenresParticipationsRecordings.setId("12345");
        depthIdentifiersGenresParticipationsRecordings.setDepth(Arrays.asList(
                AlbumRetrievalDepth.IDENTIFIERS, 
                AlbumRetrievalDepth.GENRES,
                AlbumRetrievalDepth.PARTICIPATIONS,
                AlbumRetrievalDepth.RECORDINGS));
        
        return Arrays.asList(new Object[][]{
            {id, "Albums/12345"},
            {depthIdentifiers, "Albums/12345?depth=IDENTIFIERS"},
            {depthIdentifiersGenres, "Albums/12345?depth=IDENTIFIERS,GENRES"},
            {depthIdentifiersGenresParticipationsRecordings, 
                "Albums/12345?depth=IDENTIFIERS,GENRES,PARTICIPATIONS,RECORDINGS"},
        });
    }
    
    @Test
    public void testBuildAlbumsByIdQuery(){
        Assert.assertEquals(InternalUtilities.BASEURL + expectedQueryString, qo.buildQueryString());
    }
}
