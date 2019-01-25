package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    private OfficialOverview officialOverview;

    public static final String FIRST_NAME  = "firstName";
    public static final String LAST_NAME   = "lastName";
    public static final String MIDDLE_NAME = "middleName";
    public static final String PARTY       = "party";
    public static final String STATE       = "state";
    public static final String ID          = "id";

    @Before
    public void setUp() throws Exception {
        officialOverview = new OfficialOverview(FIRST_NAME, MIDDLE_NAME, LAST_NAME, PARTY, STATE, ID);
    }

    @Test
    public void shouldGetDisplayName() {

    }

    @Test
    public void shouldGetId() {
    }

    @Test
    public void shouldGetParty() {
    }

    @Test
    public void shouldGetState() {
    }
}