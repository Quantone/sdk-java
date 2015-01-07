package com.decibel.decibelsdk;

import DecibelSDK.DecibelObjectModel.*;

public class TestDataEntities {
    public static Artist FleetwoodMac(){
        Artist fleetwoodMac = new Artist();
        fleetwoodMac.setNameLiteral("Fleetwood Mac");
        fleetwoodMac.setId("4aea91de-318f-e311-be87-ac220b82800d");
        fleetwoodMac.setMembers(new Artist[]{
            MickFleetwood(), JohnMcVie(), BobWelch()});
        fleetwoodMac.setWebAddresses(new WebAddress[]{FleetwoodmacDotCom()});
        fleetwoodMac.setBiographies(new Annotation[]{EnglishAnnotation(), GermanAnnotation()});
        fleetwoodMac.setIdentifiers(new ArtistIdentifier[]{FleetwoodMacDiscogsId()});
        
        return fleetwoodMac;
    };
    
    public static ArtistIdentifier FleetwoodMacDiscogsId(){
        ArtistIdentifier discogsId = new ArtistIdentifier();
        discogsId.setIdentifierType(ArtistIdType.DISCOGSARTIST);
        discogsId.setValue("a1");
        
        return discogsId;
    }
    
    public static AlbumIdentifier RumoursDiscogsId(){
        AlbumIdentifier discogsId = new AlbumIdentifier();
        discogsId.setIdentifierType(AlbumIdType.DISCOGSMASTER);
        discogsId.setValue("m2");
        
        return discogsId;
    }
    
    public static Annotation EnglishAnnotation(){
        Annotation english = new Annotation();
        english.setText("English annotation");
        
        return english;
    }
    
    public static Annotation GermanAnnotation(){
        Annotation german = new Annotation();
        german.setText("Ich bin ein Berliner.");
        
        return german;
    }
    
    public static WebAddress FleetwoodmacDotCom(){
        WebAddress address = new WebAddress();
        address.setAddress("http://www.fleetwoodmac.com/");
        
        return address;
    }
    
    public static Album Rumours(){
        Album rumours = new Album();
        rumours.setId("156dda6c-358f-e311-be87-ac220b82800d");
        rumours.setTitle("Rumours");
        rumours.setFormat(ContentFormat.SAMPLER);
        rumours.setIsLive(true);
        rumours.setIsUnofficial(Boolean.FALSE);
        rumours.setArtistsLiteral(FleetwoodMac().getNameLiteral());
        rumours.setOriginalReleaseDate("1977");
        rumours.setIdentifiers(new AlbumIdentifier[]{RumoursDiscogsId()});
        
        return rumours;
    }
    
    public static Artist MickFleetwood(){
        Artist mickFleetwood = new Artist();
        mickFleetwood.setGender(Gender.MALE);
        mickFleetwood.setIsFictional(Boolean.FALSE);
        mickFleetwood.setNameLiteral("Mick Fleetwood");
        mickFleetwood.setId("f01e23df-318f-e311-be87-ac220b82800d");
        
        return mickFleetwood;
    }
    
    public static Artist JohnMcVie(){
        Artist johnMcVie = new Artist();
        johnMcVie.setGender(Gender.MALE);
        johnMcVie.setNameLiteral("John McVie");
        johnMcVie.setId("ef1e23df-318f-e311-be87-ac220b82800d");
        
        return johnMcVie;
    }
    
    public static Artist BobWelch(){
        Artist bobWelch = new Artist();
        bobWelch.setGender(Gender.MALE);
        bobWelch.setIsFictional(Boolean.FALSE);
        bobWelch.setNameLiteral("Bob Welch");
        bobWelch.setId("0ABC2121-29EC-48E4-B018-ABCA5B4C8040");
        bobWelch.setBirthDate("1945-08-31");
        bobWelch.setBirthPlace("Los Angeles, California");
        bobWelch.setDeathDate("2012-06-07");
        bobWelch.setDeathPlace("Nashville");
        
        return bobWelch;
    }
    
    public static Artist WilsonPhillips(){
        Artist wilsonPhillips = new Artist();
        wilsonPhillips.setId("971309df-318f-e311-be87-ac220b82800d");
        wilsonPhillips.setGender(Gender.MALE);
        wilsonPhillips.setNameLiteral("Wilson Phillips");
        
        return wilsonPhillips;
    }
    
    public static Artist LindseyBuckingham(){
        Artist lindsey = new Artist();
        lindsey.setNameLiteral("Lindsey Buckingham");
        lindsey.setGender(Gender.FEMALE);
        
        return lindsey;
    }
    
    public static Participation LindseyBuckinghamParticipation(){
        Participation lindsey = new Participation();
        lindsey.setActivityLiteral("Guitar [Guitars]");
        lindsey.setArtistsLiteral("Lindsey Buckingham");
        lindsey.setActivities(new Activity[]{Guitar()});
        
        return lindsey;
    }
    
    public static Participation HerbertWorthington(){
        Participation herbert = new Participation();
        herbert.setArtistsLiteral("Herbert Worthington");
        herbert.setActivityLiteral("Photography By");
        
        return herbert;
    }
    
    public static Participation WorkComposerParticipation(){
        Participation composer = new Participation();
        composer.setActivityLiteral("Literal Composer Activity");
        composer.setArtistsLiteral("Work Composer Literal Name");
        composer.setIsFeatured(Boolean.TRUE);
        
        return composer;
    }
    
    public static Activity Composition(){
        Activity composition = new Activity();
        composition.setName("Composition Activity Name");
        
        return composition;
    }
    
    public static Genre BluesRock(){
        Genre bluesRock = new Genre();
        bluesRock.setName("blues rock");
        
        return bluesRock;
    }
    
    public static Activity Guitar(){
        Activity guitar = new Activity();
        guitar.setName("Guitar");
        
        return guitar;
    }
    
    public static Release RepriseRecords1975(){
        Release reprise = new Release();
        reprise.setId("baee8712-368f-e311-be87-ac220b82800d");
        reprise.setReleaseDate("1975");
        reprise.setReleaseRegionLiteral("US");
        reprise.setLabelLiteral("Reprise Records");
        reprise.setIdentifiers(new ReleaseIdentifier[]{RepriseRecords1975Identifier()});
        
        return reprise;
    }
    
    public static ReleaseIdentifier RepriseRecords1975Identifier(){
        ReleaseIdentifier repriseId = new ReleaseIdentifier();
        repriseId.setIdentifierType(ReleaseIdType.DISCOGSRELEASE);
        repriseId.setValue("a5");
        
        return repriseId;
    }
    
    public static Recording GoYourOwnWay(){
        Recording goYourOwnWay = new Recording();
        goYourOwnWay.setTitle("Go Your Own Way");
        goYourOwnWay.setMainArtistsLiteral("Recording Literal Main Artist");
        goYourOwnWay.setId("f0be5d06-bf74-11e3-be9b-ac220b82800d");
        goYourOwnWay.setOriginalAlbumTitle("Wolfram Huschke");
        goYourOwnWay.setIsLive(Boolean.TRUE);
        goYourOwnWay.setDuration(10.0);
        goYourOwnWay.setBeatsPerMinute(15.0);
        
        return goYourOwnWay;
    }
    
    public static Work GoYourOwnWayWork(){
        Work goYourOwnWay = new Work();
        goYourOwnWay.setId("3f9f1c81-b6ef-11e3-be98-ac220b82800d");
        goYourOwnWay.setName("Go Your Own Way");
        goYourOwnWay.setRecordingSequence(1);
        
        return goYourOwnWay;
    }
    
    public static Location WarnerBrothersStudios(){
        Location wbStudios = new Location();
        wbStudios.setName("Warner Brothers Studios, Burbank, California, US");
        
        return wbStudios;
    }
    
    public static ProductionEvent SessionInfo(){
        ProductionEvent session = new ProductionEvent();
        session.setDate("1997-01-01");
        session.setIsRecording(Boolean.TRUE);
        
        return session;
    }
}
