package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    public static final String FIRST_NAME = "firstName";
    public static final String MIDDLE_NAME = "middleName";
    public static final String LAST_NAME = "lastName";
    public static final String PARTY = "party";
    public static final String STATE = "state";
    public static final String ID = "id";
    OfficialOverview officialOverview;

    @Before
    public void setUp() throws Exception {
        officialOverview = new OfficialOverview(FIRST_NAME, MIDDLE_NAME, LAST_NAME, PARTY, STATE, ID);

    }

    @Test
    public void shouldGetDisplayName(){
        String name = "firstName";

        assertEquals(FIRST_NAME, name);
    }

    @Test
    public void shouldBuildDisplayName(){
        String fName = "firstName";
        String mName = "middleName";
        String lName = "lastName";
        String fullName = officialOverview.buildDisplayName();

        assertEquals("firstname middlename lastname", fullName);
    }


}