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
public class BuildAlbumsQuery {
    private AlbumsQuery qo;
    private String expectedQueryString;
    
    @Before
    public void inititalize(){
        
    }
    
    public BuildAlbumsQuery(AlbumsQuery qo, String expectedQueryString){
        this.qo = qo;
        this.expectedQueryString = expectedQueryString;
    }
    
    @Parameterized.Parameters
    public static Collection AlbumsQueries(){
        // Title
        AlbumsQuery title = new AlbumsQuery();
        title.setTitle("GRRR!");
        
        // TitleSearchType
        AlbumsQuery titleSearchTypeFullName = new AlbumsQuery();
        titleSearchTypeFullName.setTitleSearchType(AlbumSearchType.FULLNAME);
        AlbumsQuery titleSearchTypePartialName = new AlbumsQuery();
        titleSearchTypePartialName.setTitleSearchType(AlbumSearchType.PARTIALNAME);
        
        // Artists
        AlbumsQuery artists = new AlbumsQuery();
        artists.setArtists(Arrays.asList("Jimi Hendrix", "Chas Chandler"));
        
        // Participants
        AlbumsQuery participants = new AlbumsQuery();
        participants.setParticipants(Arrays.asList("Jimi Hendrix", "Chas Chandler" ));
        
        // Recordings
        AlbumsQuery recordings = new AlbumsQuery();
        recordings.setRecordings(Arrays.asList("GRRR!", "Sgt. Pepper's Lonely Hearts Club Band"));
        
        // DateReleased
        AlbumsQuery dateReleased = new AlbumsQuery();
        dateReleased.setDateReleased("01/08/2014");
        
        // Depth
        AlbumsQuery depthIdentifiers = new AlbumsQuery();
        depthIdentifiers.setDepth(Arrays.asList(AlbumRetrievalDepth.IDENTIFIERS));
        AlbumsQuery depthIdentifiersGenres = new AlbumsQuery();
        depthIdentifiersGenres.setDepth(Arrays.asList(
                AlbumRetrievalDepth.IDENTIFIERS, 
                AlbumRetrievalDepth.GENRES));
        AlbumsQuery depthIdentifiersGenresParticipationsRecordings = new AlbumsQuery();
        depthIdentifiersGenresParticipationsRecordings.setDepth(Arrays.asList(
                AlbumRetrievalDepth.IDENTIFIERS, 
                AlbumRetrievalDepth.GENRES,
                AlbumRetrievalDepth.PARTICIPATIONS,
                AlbumRetrievalDepth.RECORDINGS));
        
        // Page Number
        AlbumsQuery pageNumber = new AlbumsQuery();
        pageNumber.setPageNumber(111);
        
        // Page Size
        AlbumsQuery pageSize = new AlbumsQuery();
        pageSize.setPageSize(616);
        
        return Arrays.asList(new Object[][]{
            {title, "Albums?title=GRRR!"},
            {titleSearchTypeFullName, "Albums"},
            {titleSearchTypePartialName, "Albums?titlesearchtype=PARTIALNAME"},
            {artists, "Albums?artists=Jimi Hendrix,Chas Chandler"},
            {participants, "Albums?participants=Jimi Hendrix,Chas Chandler"},
            {recordings, "Albums?recordings=GRRR!,Sgt. Pepper's Lonely Hearts Club Band"},
            {dateReleased, "Albums?datereleased=01/08/2014"},
            {depthIdentifiers, "Albums?depth=IDENTIFIERS"},
            {depthIdentifiersGenres, "Albums?depth=IDENTIFIERS,GENRES"},
            {depthIdentifiersGenresParticipationsRecordings, 
                "Albums?depth=IDENTIFIERS,GENRES,PARTICIPATIONS,RECORDINGS"},
            {pageNumber, "Albums?pagenumber=111"},
            {pageSize, "Albums?pagesize=616"}
        });
    }
    
    @Test
    public void testBuildAlbumsQuery(){
        Assert.assertEquals(InternalUtilities.BASEURL + expectedQueryString, qo.buildQueryString());
    }
}
