package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class OfficialOverviewTest {

    public static final String FIRST_NAME = "Jake";
    public static final String MIDDLE_NAME = "Berend";
    public static final String LAST_NAME = "Esveld";
    public static final String PARTY = "Independent";
    public static final String STATE = "Arizona";
    public static final String ID = "id1";
    OfficialOverview overview;

    @Before
    public void setUp(){
        overview = new OfficialOverview(FIRST_NAME, MIDDLE_NAME, LAST_NAME, PARTY, STATE, ID);
    }

    @Test
    public void officialOverview_GetDisplayName_ReturnsResult(){
        String displayName = overview.getDisplayName();
        StringBuilder builder = new StringBuilder();
        builder.append(FIRST_NAME).append(" ").append(MIDDLE_NAME).append(" ").append(LAST_NAME);
        assertThat(displayName, equalTo(builder.toString()));
    }

    @Test
    public void officialOverview_GetId_ReturnsID(){
        assertThat(overview.getId(), equalTo(ID));
    }

    @Test
    public void officialOverview_GetParty_ReturnsParty(){
        assertThat(overview.getParty(), equalTo(PARTY));
    }

    @Test
    public void officialOverview_GetState_ReturnsState(){
        assertThat(overview.getState(), equalTo(STATE));
    }

}