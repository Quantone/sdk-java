package com.decibel.decibelsdk;

import DecibelSDK.*;
import DecibelSDK.DecibelObjectModel.*;
import DecibelSDK.DecibelQuery.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class QueryTests {
    private Decibel myDecibel;
    
    @Before
    public void initialise(){
        myDecibel = new Decibel("{YOUR_APP_ID}", "{YOUR_APP_KEY}");
    }
    
    @Test
    public void albumsQuery(){
        // Arrange
        AlbumsQuery qo = new AlbumsQuery();
        qo.setTitle(TestDataEntities.Rumours().getTitle());
        qo.setDateReleased(TestDataEntities.Rumours().getOriginalReleaseDate());
        qo.setDepth(Arrays.asList(
                AlbumRetrievalDepth.RECORDINGS, 
                AlbumRetrievalDepth.IDENTIFIERS,
                AlbumRetrievalDepth.PARTICIPATIONS,
                AlbumRetrievalDepth.GENRES,
                AlbumRetrievalDepth.ARTISTDETAILS,
                AlbumRetrievalDepth.RELEASES
        ));
        qo.setTitleSearchType(AlbumSearchType.FULLNAME);
        qo.setArtists(Arrays.asList(TestDataEntities.FleetwoodMac().getNameLiteral()));
        qo.setRecordings(Arrays.asList(TestDataEntities.GoYourOwnWay().getTitle()));
        
        try {
            // Act
            AlbumsQueryResult qr = myDecibel.Execute(qo);
            Album result = qr.getResults().get(0);
            
            // Assert
            Assert.assertEquals(TestDataEntities.Rumours().getArtistsLiteral(), result.getArtistsLiteral());
            Assert.assertEquals(TestDataEntities.Rumours().getTitle(), result.getTitle());
            Assert.assertEquals(TestDataEntities.Rumours().getOriginalReleaseDate(), result.getOriginalReleaseDate());
            
            Recording[] recordings = result.getRecordings();
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getId(), recordings[0].getId());
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getTitle(), recordings[0].getTitle());
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getOriginalAlbumTitle(), recordings[0].getOriginalAlbumTitle());
            
            Identifier[] identifiers = result.getIdentifiers();
            Assert.assertEquals(1, identifiers.length);
            Assert.assertEquals(TestDataEntities.RumoursDiscogsId().getValue(), identifiers[0].getValue());
            
            Participation[] participations = result.getParticipations();
            Assert.assertEquals(1, participations.length);
            Assert.assertEquals(TestDataEntities.HerbertWorthington().getActivityLiteral(), participations[0].getActivityLiteral());
            Assert.assertEquals(TestDataEntities.HerbertWorthington().getArtistsLiteral(), participations[0].getArtistsLiteral());
            
            Genre[] genres = result.getGenres();
            Assert.assertEquals(1, genres.length);
            Assert.assertEquals(TestDataEntities.BluesRock().getName(), genres[0].getName());
            
            Artist[] artists = result.getArtists();
            Assert.assertEquals(1, artists.length);
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getId(), artists[0].getId());
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getNameLiteral(), artists[0].getNameLiteral());
            
            Release[] releases = result.getReleases();
            Assert.assertEquals(1, releases.length);
            Assert.assertEquals(TestDataEntities.RepriseRecords1975().getId(), releases[0].getId());
            Assert.assertEquals(TestDataEntities.RepriseRecords1975().getReleaseDate(), releases[0].getReleaseDate());
            Assert.assertEquals(TestDataEntities.RepriseRecords1975().getLabelLiteral(), releases[0].getLabelLiteral());
            Assert.assertEquals(TestDataEntities.RepriseRecords1975().getReleaseRegionLiteral(), releases[0].getReleaseRegionLiteral());
            
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }
    
    @Test
    public void singleAlbumsQuery(){
        // Arrange
        AlbumsByIdQuery qo = new AlbumsByIdQuery();
        qo.setId(TestDataEntities.Rumours().getId());
        qo.setDepth(Arrays.asList(new AlbumRetrievalDepth[]{AlbumRetrievalDepth.ARTISTDETAILS}));
        
        try{
            // Act
            AlbumsByIdQueryResult qr = myDecibel.Execute(qo);
            Album result = qr.getResult();
            
            // Assert
            Assert.assertEquals(TestDataEntities.Rumours().getId(), result.getId());
            Assert.assertEquals(TestDataEntities.Rumours().getArtistsLiteral(), result.getArtistsLiteral());
            Assert.assertEquals(TestDataEntities.Rumours().getTitle(), result.getTitle());
            Assert.assertEquals(TestDataEntities.Rumours().getOriginalReleaseDate(), result.getOriginalReleaseDate());
            
        }catch(DecibelException ex){
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }
    
    @Test
    public void artistsQuery(){
        // Arrange
        ArtistsQuery qo = new ArtistsQuery();
        qo.setName(TestDataEntities.FleetwoodMac().getNameLiteral());
        qo.setDepth(Arrays.asList(
                ArtistRetrievalDepth.IDENTIFIERS,
                ArtistRetrievalDepth.BIOGRAPHY,
                ArtistRetrievalDepth.MEMBERS,
                ArtistRetrievalDepth.DATES,
                ArtistRetrievalDepth.GENRES,
                ArtistRetrievalDepth.URLS
        ));
        qo.setNameSearchType(ArtistSearchType.FULLNAME);
        
        try{
            // Act
            ArtistsQueryResult qr = myDecibel.Execute(qo);
            Artist result = qr.getResults().get(0);
            
            // Assert
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getId(), result.getId());
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getNameLiteral(), result.getStageName());
            
            ArtistIdentifier[] identifiers = result.getIdentifiers();
            Assert.assertEquals(1, identifiers.length);
            Assert.assertEquals(TestDataEntities.FleetwoodMacDiscogsId().getIdentifierType(), 
                    identifiers[0].getIdentifierType());
            Assert.assertEquals(TestDataEntities.FleetwoodMacDiscogsId().getValue(), identifiers[0].getValue());

            Annotation[] biographies = result.getBiographies();
            Assert.assertEquals(1, biographies.length);
            
            Artist[] members = result.getMembers();
            Artist bobWelch = null;
            for(Artist member : members){
                if(member.getStageName().equals(TestDataEntities.BobWelch().getNameLiteral()))
                    bobWelch = member;
            }
            Assert.assertNotNull(bobWelch);
            Assert.assertEquals(TestDataEntities.BobWelch().getBirthDate(), bobWelch.getBirthDate());
            Assert.assertEquals(TestDataEntities.BobWelch().getBirthPlace(), bobWelch.getBirthPlace());
            Assert.assertEquals(TestDataEntities.BobWelch().getDeathDate(), bobWelch.getDeathDate());
            Assert.assertEquals(TestDataEntities.BobWelch().getDeathPlace(), bobWelch.getDeathPlace());
            
            Genre[] genres = result.getGenres();
            Assert.assertEquals(1, genres.length);
            Assert.assertEquals(TestDataEntities.BluesRock().getName(), genres[0].getName());

            WebAddress[] urls = result.getWebAddresses();
            Assert.assertEquals(1, urls.length);
            Assert.assertEquals(TestDataEntities.FleetwoodmacDotCom().getAddress(), urls[0].getAddress());
            
        }catch(DecibelException ex){
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }
    
    @Test
    public void singleArtistQuery(){
        // Arrange
        ArtistsByIdQuery qo = new ArtistsByIdQuery();
        qo.setId(TestDataEntities.MickFleetwood().getId());
        qo.setDepth(Arrays.asList(
                new ArtistRetrievalDepth[]{
                    ArtistRetrievalDepth.GROUPS, 
                    ArtistRetrievalDepth.DATES
                }));
        
        try{
            // Act
            ArtistsByIdQueryResult qr = myDecibel.Execute(qo);
            Artist result = qr.getResult();
            
            // Assert
            Assert.assertEquals(TestDataEntities.MickFleetwood().getId(), result.getId());
            Assert.assertEquals(TestDataEntities.MickFleetwood().getNameLiteral(), result.getStageName());
            
            Artist[] groups = result.getGroups();
            Assert.assertEquals(1, groups.length);
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getNameLiteral(), groups[0].getStageName());
            
        }catch(DecibelException ex){
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }
    
    @Test
    public void recordingQuery(){
        // Arrange
        RecordingsQuery qo = new RecordingsQuery();
        qo.setTitle(TestDataEntities.GoYourOwnWay().getTitle());
        qo.setDepth(Arrays.asList(
                RecordingRetrievalDepth.PARTICIPATIONS,
                RecordingRetrievalDepth.ARTISTDETAILS,
                RecordingRetrievalDepth.WORKS,
                RecordingRetrievalDepth.GENRES,
                RecordingRetrievalDepth.IDENTIFIERS,
                RecordingRetrievalDepth.SESSIONINFO
        ));
        qo.setTitleSearchType(RecordingSearchType.FULLNAME);
        qo.setArtists(Arrays.asList(TestDataEntities.FleetwoodMac().getNameLiteral()));
        qo.setComposers(Arrays.asList(TestDataEntities.WilsonPhillips().getNameLiteral()));
        qo.setDateMade(TestDataEntities.GoYourOwnWay().getOriginalReleaseDate());
        qo.setIsLive(TestDataEntities.GoYourOwnWay().getIsLive());
        qo.setParticipants(Arrays.asList(TestDataEntities.LindseyBuckingham().getNameLiteral()));
        
        try{
            // Act
            RecordingsQueryResult qr = myDecibel.Execute(qo);
            Recording result = qr.getResults().get(0);
            
            // Assert
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getId(), result.getId());
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getTitle(), result.getTitle());
            
            Participation[] participations = result.getParticipations();
            Assert.assertEquals(1, participations.length);
            Assert.assertEquals(TestDataEntities.LindseyBuckinghamParticipation().getActivityLiteral(), participations[0].getActivityLiteral());
            Assert.assertEquals(TestDataEntities.LindseyBuckinghamParticipation().getArtistsLiteral(), participations[0].getArtistsLiteral());

            Artist[] artistDetails = result.getArtists();
            Assert.assertEquals(1, artistDetails.length);
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getId(), artistDetails[0].getId());
            Assert.assertEquals(TestDataEntities.FleetwoodMac().getNameLiteral(), artistDetails[0].getNameLiteral());

            Work[] works = result.getWorks();
            Assert.assertEquals(1, works.length);
            Assert.assertEquals(TestDataEntities.GoYourOwnWayWork().getId(), works[0].getId());
            Assert.assertEquals(TestDataEntities.GoYourOwnWayWork().getName(), works[0].getName());
            Assert.assertEquals(TestDataEntities.GoYourOwnWayWork().getRecordingSequence(), works[0].getRecordingSequence());
            
            Participation[] workParticipations = works[0].getParticipations();
            Assert.assertEquals(1, workParticipations.length);
            Assert.assertEquals(TestDataEntities.WorkComposerParticipation().getActivityLiteral(), workParticipations[0].getActivityLiteral());
            Assert.assertEquals(TestDataEntities.WorkComposerParticipation().getArtistsLiteral(), workParticipations[0].getArtistsLiteral());
            Assert.assertEquals(TestDataEntities.WorkComposerParticipation().getIsFeatured(), workParticipations[0].getIsFeatured());

            Artist[] workParticipationArtists = workParticipations[0].getArtists();
            Assert.assertEquals(1, workParticipationArtists.length);
            Assert.assertEquals(TestDataEntities.WilsonPhillips().getId(), workParticipationArtists[0].getId());
            Assert.assertEquals(TestDataEntities.WilsonPhillips().getNameLiteral(), workParticipationArtists[0].getStageName());
            Assert.assertEquals(TestDataEntities.WilsonPhillips().getGender(), workParticipationArtists[0].getGender());
           
            Activity[] workParticipationActivities = workParticipations[0].getActivities();
            Assert.assertEquals(1, workParticipationActivities.length);
            Assert.assertEquals(TestDataEntities.Composition().getName(), workParticipationActivities[0].getName());
            
            Genre[] genres = result.getGenres();
            Assert.assertEquals(1, genres.length);
            Assert.assertEquals(TestDataEntities.BluesRock().getName(), genres[0].getName());
            
            ProductionEvent[] productionEvents = result.getProductionEvents();
            Assert.assertEquals(1, productionEvents.length);
            Assert.assertEquals(TestDataEntities.SessionInfo().getIsRecording(), productionEvents[0].getIsRecording());
            Assert.assertEquals(TestDataEntities.SessionInfo().getDate(), productionEvents[0].getDate());
            
        }catch(DecibelException ex){
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }
    
    @Test
    public void singleRecordingQuery(){
        // Arrange
        RecordingsByIdQuery qo = new RecordingsByIdQuery();
        qo.setId(TestDataEntities.GoYourOwnWay().getId());
        qo.setDepth(Arrays.asList(
                new RecordingRetrievalDepth[]{
                    RecordingRetrievalDepth.IDENTIFIERS,
                }));
        
        try{
            // Act
            RecordingsByIdQueryResult qr = myDecibel.Execute(qo);
            Recording result = qr.getResult();
            
            // Assert
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getId(), result.getId());
            Assert.assertEquals(TestDataEntities.GoYourOwnWay().getTitle(), result.getTitle());
            
        }catch(DecibelException ex){
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }
    
    @Test(expected=DecibelException.class)
    public void queryWithError() throws DecibelException{
        // Arrange
        Decibel badDecibel = new Decibel("", "");
        ArtistsQuery qo = new ArtistsQuery();
        qo.setName("Foo Fighters");
        
        // Act/Assert
        ArtistsQueryResult result = badDecibel.Execute(qo);
    }
}