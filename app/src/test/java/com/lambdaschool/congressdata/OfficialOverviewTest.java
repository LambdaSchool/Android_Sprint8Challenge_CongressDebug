package com.lambdaschool.congressdata;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

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

    @Test
    public void shouldGetId(){
        String id = "id";

        assertEquals(ID, id);
    }


    @Test
    public void shouldGetParty(){
        String party = "party";

        assertEquals(PARTY, party);
    }

    @Test
    public void shouldGetState(){
        String state = "state";

        assertEquals(STATE, state);
    }

    @Test
    public void shouldConstructOfficialOverviewFromCongresspersonOverview(){
        CongresspersonOverview congresspersonOverview = new CongresspersonOverview(
                FIRST_NAME, MIDDLE_NAME, LAST_NAME, PARTY, STATE, ID);

        OfficialOverview officialOverview = new OfficialOverview(congresspersonOverview);
        String displayName = officialOverview.getDisplayName();
        String id = officialOverview.getId();
        String party = officialOverview.getParty();
        String state = officialOverview.getState();

        assertEquals("firstname middlename lastname", displayName);
        assertEquals(ID, id);
        assertEquals(PARTY, party);
        assertEquals(STATE, state);
        
    }

}