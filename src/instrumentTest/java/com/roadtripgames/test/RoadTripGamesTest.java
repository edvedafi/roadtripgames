package com.roadtripgames.test;

import android.test.ActivityInstrumentationTestCase2;
import com.roadtripgames.RoadTripGames;

public class RoadTripGamesTest extends ActivityInstrumentationTestCase2<RoadTripGames> {

    public RoadTripGamesTest() {
        super("com.roadtripgames", RoadTripGames.class);
    }

   public void testMainApp() {
       System.out.println("here!");
       assertTrue( true );
   }
}
