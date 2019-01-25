package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    OfficialOverview official;

    @Before
    public void setUp() {
        official = new OfficialOverview("Firstname", "Middlename", "Lastname", "party", "state", "id");
    }

    @Test
    public void getDisplayName() {
        //setup
        String expectedValue = "Firstname Middlename Lastname";
        //execute

        //check
        assertEquals(expectedValue, official.getDisplayName());
    }

    @Test
    public void getId() {
        //execute
        String expectedValue = "id";

        //check
        assertEquals(expectedValue, official.getId());

    }

    @Test
    public void getParty() {
        //setup
        String expectedValue = "party";
        //execute

        //check
        assertEquals(expectedValue, official.getParty());
    }

    @Test
    public void getState() {
        //setup
        String expectedValue = "state";

        //execute

        //check
        assertEquals(expectedValue, official.getState());
    }
}