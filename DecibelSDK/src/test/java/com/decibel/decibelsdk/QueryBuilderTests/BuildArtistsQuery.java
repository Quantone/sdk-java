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
public class BuildArtistsQuery {
    private ArtistsQuery qo;
    private String expectedQueryString;
    
    @Before
    public void inititalize(){
        
    }
    
    public BuildArtistsQuery(ArtistsQuery qo, String expectedQueryString){
        this.qo = qo;
        this.expectedQueryString = expectedQueryString;
    }
    
    @Parameterized.Parameters
    public static Collection ArtistsQueries(){
        // Name
        ArtistsQuery name = new ArtistsQuery();
        name.setName("Jimi Hendrix");
        
        // NameSearchType
        ArtistsQuery nameSearchTypeFullName = new ArtistsQuery();
        nameSearchTypeFullName.setNameSearchType(ArtistSearchType.FULLNAME);
        ArtistsQuery nameSearchTypePartialName = new ArtistsQuery();
        nameSearchTypePartialName.setNameSearchType(ArtistSearchType.PARTIALNAME);
        
        // DateBorn
        ArtistsQuery dateBorn = new ArtistsQuery();
        dateBorn.setDateBorn("01/08/2014");
        
        // DateDied
        ArtistsQuery dateDied = new ArtistsQuery();
        dateDied.setDateDied("01/08/2014");
        
        // Gender
        ArtistsQuery gender = new ArtistsQuery();
        gender.setGender(Gender.FEMALE);
        
        // Depth
        ArtistsQuery depthIdentifiers = new ArtistsQuery();
        depthIdentifiers.setDepth(Arrays.asList(ArtistRetrievalDepth.IDENTIFIERS));
        ArtistsQuery depthIdentifiersGenres = new ArtistsQuery();
        depthIdentifiersGenres.setDepth(Arrays.asList(
                ArtistRetrievalDepth.IDENTIFIERS, 
                ArtistRetrievalDepth.GENRES));
        
        // Page Number
        ArtistsQuery pageNumber = new ArtistsQuery();
        pageNumber.setPageNumber(111);
        
        // Page Size
        ArtistsQuery pageSize = new ArtistsQuery();
        pageSize.setPageSize(616);
        
        return Arrays.asList(new Object[][]{
            {name, "Artists?name=Jimi Hendrix"},
            {nameSearchTypeFullName, "Artists"},
            {nameSearchTypePartialName, "Artists?namesearchtype=PARTIALNAME"},
            {dateBorn, "Artists?dateborn=01/08/2014"},
            {dateDied, "Artists?datedied=01/08/2014"},
            {gender, "Artists?gender=FEMALE"},
            {depthIdentifiers, "Artists?depth=IDENTIFIERS"},
            {depthIdentifiersGenres, "Artists?depth=IDENTIFIERS,GENRES"},
            {pageNumber, "Artists?pagenumber=111"},
            {pageSize, "Artists?pagesize=616"}
        });
    }
    
    @Test
    public void testBuildArtistsQuery(){
        Assert.assertEquals(InternalUtilities.BASEURL + expectedQueryString, qo.buildQueryString());
    }
}
