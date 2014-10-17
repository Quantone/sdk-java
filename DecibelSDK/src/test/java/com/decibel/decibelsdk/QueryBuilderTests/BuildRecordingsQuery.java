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
public class BuildRecordingsQuery {
    private RecordingsQuery qo;
    private String expectedQueryString;
    
    @Before
    public void inititalize(){
        
    }
    
    public BuildRecordingsQuery(RecordingsQuery qo, String expectedQueryString){
        this.qo = qo;
        this.expectedQueryString = expectedQueryString;
    }
    
    @Parameterized.Parameters
    public static Collection RecordingsQueries(){
        // Artists
        RecordingsQuery artists = new RecordingsQuery();
        artists.setArtists(Arrays.asList("Jimi Hendrix", "Chas Chandler"));
        
        // Title
        RecordingsQuery title = new RecordingsQuery();
        title.setTitle("GRRR!");
        
        // Composer
        RecordingsQuery composers = new RecordingsQuery();
        composers.setComposers(Arrays.asList("Jimi Hendrix", "Chas Chandler"));
        
        // Participants
        RecordingsQuery participants = new RecordingsQuery();
        participants.setParticipants(Arrays.asList("Jimi Hendrix", "Chas Chandler"));
        
        // MinSeconds
        RecordingsQuery minSeconds = new RecordingsQuery();
        minSeconds.setMinSeconds(111.0);
        
        // MaxSeconds
        RecordingsQuery maxSeconds = new RecordingsQuery();
        maxSeconds.setMaxSeconds(616.0);
        
        // IsLive
        RecordingsQuery isLive = new RecordingsQuery();
        isLive.setIsLive(Boolean.TRUE);
        
        // TitleSearchType
        RecordingsQuery titleSearchTypeFullName = new RecordingsQuery();
        titleSearchTypeFullName.setTitleSearchType(RecordingSearchType.FULLNAME);
        RecordingsQuery titleSearchTypePartialName = new RecordingsQuery();
        titleSearchTypePartialName.setTitleSearchType(RecordingSearchType.PARTIALNAME);
        
        // Gender
        RecordingsQuery dateReleased = new RecordingsQuery();
        dateReleased.setDateMade("01/08/2014");
        
        // Depth
        RecordingsQuery depthIdentifiers = new RecordingsQuery();
        depthIdentifiers.setDepth(Arrays.asList(RecordingRetrievalDepth.IDENTIFIERS));
        RecordingsQuery depthIdentifiersGenres = new RecordingsQuery();
        depthIdentifiersGenres.setDepth(Arrays.asList(
                RecordingRetrievalDepth.IDENTIFIERS, 
                RecordingRetrievalDepth.GENRES));
        
        // Page Number
        RecordingsQuery pageNumber = new RecordingsQuery();
        pageNumber.setPageNumber(111);
        
        // Page Size
        RecordingsQuery pageSize = new RecordingsQuery();
        pageSize.setPageSize(616);
        
        return Arrays.asList(new Object[][]{
            {artists, "Recordings?artists=Jimi Hendrix,Chas Chandler"},
            {title, "Recordings?title=GRRR!"},
            {composers, "Recordings?composers=Jimi Hendrix,Chas Chandler"},
            {participants, "Recordings?participants=Jimi Hendrix,Chas Chandler"},
            {minSeconds, "Recordings?minseconds=111.0"},
            {maxSeconds, "Recordings?maxseconds=616.0"},
            {isLive, "Recordings?islive=true"},
            {titleSearchTypeFullName, "Recordings"},
            {titleSearchTypePartialName, "Recordings?titlesearchtype=PARTIALNAME"},
            {dateReleased, "Recordings?datemade=01/08/2014"},
            {depthIdentifiers, "Recordings?depth=IDENTIFIERS"},
            {depthIdentifiersGenres, "Recordings?depth=IDENTIFIERS,GENRES"},
            {pageNumber, "Recordings?pagenumber=111"},
            {pageSize, "Recordings?pagesize=616"}
        });
    }
    
    @Test
    public void testBuildRecordingsQuery(){
        Assert.assertEquals(InternalUtilities.BASEURL + expectedQueryString, qo.buildQueryString());
    }
}
