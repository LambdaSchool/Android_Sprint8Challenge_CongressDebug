package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    OfficialOverview officialOverview;

    @Before
    public void setUp() throws Exception {
        officialOverview = new OfficialOverview("Robert", "B.", "Aderholt", "R", "AL", "A000055");
    }


    @Test
    public void shouldGetDisplayNameWithProperCapitalizationAndSpace() {
        //Setup
        String expected = "Robert B. Aderholt";

        //Actual
        String actual = officialOverview.getDisplayName();

        //Check
        assertEquals(expected, actual);
    }



    @Test
    public void shouldGetTheApiID(){
        //Setup
        String expected = "A000055";

        //Actual
        String actual = officialOverview.getId();

        //Check
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTheParty(){
        //Setup
        String expected = "R";

        //Actual
        String actual = officialOverview.getParty();

        //Check
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTheStateRepresenting(){
        //Setup
        String expected = "AL";

        //Actual
        String actual = officialOverview.getState();

        //Check
        assertEquals(expected, actual);
    }






}