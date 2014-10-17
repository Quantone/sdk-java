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
public class BuildRecordingsByIdQuery {
    private RecordingsByIdQuery qo;
    private String expectedQueryString;
    
    @Before
    public void inititalize(){
        
    }
    
    public BuildRecordingsByIdQuery(RecordingsByIdQuery qo, String expectedQueryString){
        this.qo = qo;
        this.expectedQueryString = expectedQueryString;
    }
    
    @Parameterized.Parameters
    public static Collection RecordingsByIdQueries(){
        // Id
        RecordingsByIdQuery id = new RecordingsByIdQuery();
        id.setId("12345");
        
        // Depth
        RecordingsByIdQuery depthIdentifiers = new RecordingsByIdQuery();
        depthIdentifiers.setId("12345");
        depthIdentifiers.setDepth(Arrays.asList(RecordingRetrievalDepth.IDENTIFIERS));
        RecordingsByIdQuery depthIdentifiersGenres = new RecordingsByIdQuery();
        depthIdentifiersGenres.setId("12345");
        depthIdentifiersGenres.setDepth(Arrays.asList(
                RecordingRetrievalDepth.IDENTIFIERS, 
                RecordingRetrievalDepth.GENRES));
        
        return Arrays.asList(new Object[][]{
            {id, "Recordings/12345"},
            {depthIdentifiers, "Recordings/12345?depth=IDENTIFIERS"},
            {depthIdentifiersGenres, "Recordings/12345?depth=IDENTIFIERS,GENRES"}
        });
    }
    
    @Test
    public void testBuildRecordingsByIdQuery(){
        Assert.assertEquals(InternalUtilities.BASEURL + expectedQueryString, qo.buildQueryString());
    }
}
