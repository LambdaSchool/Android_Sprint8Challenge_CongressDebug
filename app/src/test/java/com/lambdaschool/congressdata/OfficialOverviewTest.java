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

}