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
    public void albumsQuery() {
        // Arrange
        AlbumsQuery qo = new AlbumsQuery();
        qo.setTitle("Rumours");
        qo.setDateReleased("1977");
        qo.setDepth(Arrays.asList(AlbumRetrievalDepth.RECORDINGS,AlbumRetrievalDepth.IDENTIFIERS,AlbumRetrievalDepth.PARTICIPATIONS,AlbumRetrievalDepth.GENRES,AlbumRetrievalDepth.ARTISTDETAILS,AlbumRetrievalDepth.RELEASES));
        qo.setTitleSearchType(AlbumSearchType.FULLNAME);
        qo.setArtists(Arrays.asList("Fleetwood Mac"));
        qo.setParticipants(Arrays.asList("Herbert Worthington"));
        qo.setRecordings(Arrays.asList("Go Your Own Way"));

        // Act
        try {
            AlbumsQueryResult qr = myDecibel.Execute(qo);
            Album result = qr.getResults().get(0);

            // Assert
            Assert.assertEquals("Fleetwood Mac", result.getArtistsLiteral());
            Assert.assertEquals("Rumours", result.getTitle());
            Assert.assertEquals("1977", result.getOriginalReleaseDate());

            Recording recordings = result.getRecordings()[0];
            Assert.assertEquals("f0be5d06-bf74-11e3-be9b-ac220b82800d", recordings.getId());
            Assert.assertEquals("Go Your Own Way", recordings.getTitle());
            Assert.assertEquals("Wolfram Huschke", recordings.getOriginalAlbumTitle());

            AlbumIdentifier identifiers = result.getIdentifiers()[0];
            Assert.assertEquals(AlbumIdType.DISCOGSMASTER, identifiers.getIdentifierType());
            Assert.assertEquals("m2", identifiers.getValue());

            Participation participations = result.getParticipations()[0];
            Assert.assertEquals("Photography By", participations.getActivityLiteral());
            Assert.assertEquals("Herbert Worthington", participations.getArtistsLiteral());

            Genre genres = result.getGenres()[0];
            Assert.assertEquals("blues rock", genres.getName());

            Artist artists = result.getArtists()[0];
            Assert.assertEquals("4aea91de-318f-e311-be87-ac220b82800d", artists.getId());
            Assert.assertEquals("Fleetwood Mac", artists.getNameLiteral());

            Release releases = result.getReleases()[0];
            Assert.assertEquals("baee8712-368f-e311-be87-ac220b82800d", releases.getId());
            Assert.assertEquals("1975", releases.getReleaseDate());
            Assert.assertEquals("Reprise Records", releases.getLabelLiteral());
            Assert.assertEquals("US", releases.getReleaseRegionLiteral());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void albumsByIdQuery() {
        // Arrange
        AlbumsByIdQuery qo = new AlbumsByIdQuery();
        qo.setId("156dda6c-358f-e311-be87-ac220b82800d");
        qo.setDepth(Arrays.asList(AlbumRetrievalDepth.ARTISTDETAILS));

        // Act
        try {
            AlbumsByIdQueryResult qr = myDecibel.Execute(qo);
            Album result = qr.getResult();

            // Assert
            Assert.assertEquals("156dda6c-358f-e311-be87-ac220b82800d", result.getId());
            Assert.assertEquals("Fleetwood Mac", result.getArtistsLiteral());
            Assert.assertEquals("Rumours", result.getTitle());
            Assert.assertEquals("1977", result.getOriginalReleaseDate());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void labelsByIdQuery() {
        // Arrange
        LabelsByIdQuery qo = new LabelsByIdQuery();
        qo.setId("9a0d3e1e-b75e-11e4-bec6-3085a9494443");

        // Act
        try {
            LabelsByIdQueryResult qr = myDecibel.Execute(qo);
            Label result = qr.getResult();

            // Assert
            Assert.assertEquals("9a0d3e1e-b75e-11e4-bec6-3085a9494443", result.getId());
            Assert.assertEquals("TestRecordLabel", result.getName());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void labelsQuery() {
        // Arrange
        LabelsQuery qo = new LabelsQuery();
        qo.setId("9a0d3e1e-b75e-11e4-bec6-3085a9494443");

        // Act
        try {
            LabelsQueryResult qr = myDecibel.Execute(qo);
            Label result = qr.getResults().get(0);

            // Assert
            Assert.assertEquals("9a0d3e1e-b75e-11e4-bec6-3085a9494443", result.getId());
            Assert.assertEquals("TestRecordLabel", result.getName());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void locationsByIdQuery() {
        // Arrange
        LocationsByIdQuery qo = new LocationsByIdQuery();
        qo.setId("ac05eb0b-0bef-426e-9d9c-8e8562ba57bc");
        qo.setDepth(Arrays.asList(LocationRetrievalDepth.IDENTIFIERS,LocationRetrievalDepth.PARENTLOCATIONS));

        // Act
        try {
            LocationsByIdQueryResult qr = myDecibel.Execute(qo);
            Location result = qr.getResult();

            // Assert
            Assert.assertEquals("ac05eb0b-0bef-426e-9d9c-8e8562ba57bc", result.getId());
            Assert.assertEquals("Bottom Location", result.getName());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void locationsQuery() {
        // Arrange
        LocationsQuery qo = new LocationsQuery();
        qo.setId("ac05eb0b-0bef-426e-9d9c-8e8562ba57bc");
        qo.setDepth(Arrays.asList(LocationRetrievalDepth.IDENTIFIERS,LocationRetrievalDepth.PARENTLOCATIONS));

        // Act
        try {
            LocationsQueryResult qr = myDecibel.Execute(qo);
            Location result = qr.getResults().get(0);

            // Assert
            Assert.assertEquals("ac05eb0b-0bef-426e-9d9c-8e8562ba57bc", result.getId());

            LocationIdentifier identifiers = result.getIdentifiers()[0];
            Assert.assertEquals(LocationIdType.GEONAMES, identifiers.getIdentifierType());
            Assert.assertEquals("102", identifiers.getValue());

            Location parentLocations = result.getParentLocations()[0];
            Assert.assertEquals("c6f42e79-32f5-4b70-85b6-54c9eae655ad", parentLocations.getId());
            Assert.assertEquals("Middle Location", parentLocations.getName());
            Assert.assertEquals("4ed08017-989c-406d-a865-7c65789c8f25", parentLocations.getParentLocations()[0].getId());
            Assert.assertEquals("Top Location", parentLocations.getParentLocations()[0].getName());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void recordingsQuery() {
        // Arrange
        RecordingsQuery qo = new RecordingsQuery();
        qo.setTitle("Go Your Own Way");
        qo.setDepth(Arrays.asList(RecordingRetrievalDepth.PARTICIPATIONS,RecordingRetrievalDepth.ARTISTDETAILS,RecordingRetrievalDepth.WORKS,RecordingRetrievalDepth.GENRES,RecordingRetrievalDepth.IDENTIFIERS,RecordingRetrievalDepth.SESSIONINFO));
        qo.setTitleSearchType(RecordingSearchType.FULLNAME);
        qo.setArtists(Arrays.asList("Fleetwood Mac"));
        qo.setComposers(Arrays.asList("WilsonPhillips"));
        qo.setIsLive(true);
        qo.setParticipants(Arrays.asList("Lindsey Buckingham"));

        // Act
        try {
            RecordingsQueryResult qr = myDecibel.Execute(qo);
            Recording result = qr.getResults().get(0);

            // Assert
            Assert.assertEquals("f0be5d06-bf74-11e3-be9b-ac220b82800d", result.getId());
            Assert.assertEquals("Wolfram Huschke", result.getOriginalAlbumTitle());

            Participation participations = result.getParticipations()[0];
            Assert.assertEquals("Guitar [Guitars]", participations.getActivityLiteral());
            Assert.assertEquals("Lindsey Buckingham", participations.getArtistsLiteral());

            Artist artists = result.getArtists()[0];
            Assert.assertEquals("4aea91de-318f-e311-be87-ac220b82800d", artists.getId());
            Assert.assertEquals("Fleetwood Mac", artists.getNameLiteral());

            Work works = result.getWorks()[0];
            Assert.assertEquals("3f9f1c81-b6ef-11e3-be98-ac220b82800d", works.getId());
            Assert.assertEquals("Go Your Own Way", works.getName());

            Genre genres = result.getGenres()[0];
            Assert.assertEquals("blues rock", genres.getName());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void recordingsByIdQuery() {
        // Arrange
        RecordingsByIdQuery qo = new RecordingsByIdQuery();
        qo.setId("f0be5d06-bf74-11e3-be9b-ac220b82800d");
        qo.setDepth(Arrays.asList(RecordingRetrievalDepth.IDENTIFIERS));

        // Act
        try {
            RecordingsByIdQueryResult qr = myDecibel.Execute(qo);
            Recording result = qr.getResult();

            // Assert
            Assert.assertEquals("f0be5d06-bf74-11e3-be9b-ac220b82800d", result.getId());
            Assert.assertEquals("Wolfram Huschke", result.getOriginalAlbumTitle());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void discTagsQuery() {
        // Arrange
        DiscTagsQuery qo = new DiscTagsQuery();
        qo.setTaggedItemId("156dda6c-358f-e311-be87-ac220b82800d");
        qo.setIdType(DiscTagIdType.DECIBELALBUM);

        // Act
        try {
            DiscTagsQueryResult qr = myDecibel.Execute(qo);
            DiscTag result = qr.getResults().get(0);

            // Assert

            FileTag fileTags = result.getFileTags()[0];
            Assert.assertEquals("4011222327628", fileTags.getAlbumEAN());
            Assert.assertEquals("156dda6c-358f-e311-be87-ac220b82800d", fileTags.getAlbumId());
            Assert.assertEquals("baee8712-368f-e311-be87-ac220b82800d", fileTags.getAlbumMediumId());
            Assert.assertEquals("Rumours", fileTags.getAlbumTitle());
            Assert.assertEquals("TestCatNum", fileTags.getCatalogNum());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void artistsQuery() {
        // Arrange
        ArtistsQuery qo = new ArtistsQuery();
        qo.setName("Bob Welch");
        qo.setDepth(Arrays.asList(ArtistRetrievalDepth.IDENTIFIERS,ArtistRetrievalDepth.BIOGRAPHY,ArtistRetrievalDepth.MEMBERS,ArtistRetrievalDepth.DATES,ArtistRetrievalDepth.GENRES,ArtistRetrievalDepth.URLS));
        qo.setNameSearchType(ArtistSearchType.FULLNAME);
        qo.setDateBorn("1945-08-31");
        qo.setDateDied("2012-06-07");
        qo.setGender(Gender.MALE);

        // Act
        try {
            ArtistsQueryResult qr = myDecibel.Execute(qo);
            Artist result = qr.getResults().get(0);

            // Assert
            Assert.assertEquals("0abc2121-29ec-48e4-b018-abca5b4c8040", result.getId());
            Assert.assertEquals("Bob Welch", result.getStageName());
            Assert.assertEquals("1945-08-31", result.getBirthDate());
            Assert.assertEquals("Los Angeles, California", result.getBirthPlace());
            Assert.assertEquals("2012-06-07", result.getDeathDate());
            Assert.assertEquals("Nashville", result.getDeathPlace());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void artistsByIdQuery() {
        // Arrange
        ArtistsByIdQuery qo = new ArtistsByIdQuery();
        qo.setId("f01e23df-318f-e311-be87-ac220b82800d");
        qo.setDepth(Arrays.asList(ArtistRetrievalDepth.GROUPS,ArtistRetrievalDepth.DATES));

        // Act
        try {
            ArtistsByIdQueryResult qr = myDecibel.Execute(qo);
            Artist result = qr.getResult();

            // Assert
            Assert.assertEquals("f01e23df-318f-e311-be87-ac220b82800d", result.getId());
            Assert.assertEquals("Mick Fleetwood", result.getStageName());

            Artist groups = result.getGroups()[0];
            Assert.assertEquals("Fleetwood Mac", groups.getStageName());
        } catch (DecibelException ex) {
            Logger.getLogger(QueryTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test(expected=DecibelException.class)
    public void queryWithError() throws DecibelException{
        // Arrange
        Decibel badDecibel = new Decibel("", "");
        AlbumsQuery qo = new AlbumsQuery();
        qo.setTitle("Rumours");
        // Act/Assert
        AlbumsQueryResult result = badDecibel.Execute(qo);
    }
    @Test
    public void rateLimitTest(){

    }
}
