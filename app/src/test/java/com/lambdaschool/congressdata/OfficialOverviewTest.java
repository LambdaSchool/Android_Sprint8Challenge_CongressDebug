package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    OfficialOverview officialOverview;

    @Before public void setUp(){
        officialOverview = new OfficialOverview("Luke", "P.", "Skywalker", "Party", "State", "Id");
    }

    @Test public void shouldDisplayNameWithProperCapitalization(){
        String expectedValue = "Luke P. Skywalker";

        assertEquals(expectedValue, officialOverview.getDisplayName());
    }
 @Test public void shouldDisplayParty(){
        String expectedValue = "Party";

        assertEquals(expectedValue, officialOverview.getParty());
    }
 @Test public void shouldDisplayState(){
        String expectedValue = "State";

        assertEquals(expectedValue, officialOverview.getState());
    }
 @Test public void shouldDisplayId(){
        String expectedValue = "Id";

        assertEquals(expectedValue, officialOverview.getId());
    }

}