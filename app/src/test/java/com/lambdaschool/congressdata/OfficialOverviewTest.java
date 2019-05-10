package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OfficialOverviewTest {

    OfficialOverview officialWithMiddle;
    OfficialOverview officialWithoutMiddle;
    @Before
    public void setUp() {
        officialWithMiddle = new OfficialOverview("Vivek","Iyer"
                , "Vishwanath", "D", "IL", "1");
        officialWithoutMiddle = new OfficialOverview("Vivek","null"
                , "Vishwanath", "D", "IL", "1");
    }

    @Test
    public void officialOverviewTest_shouldGetDisplayNameWithMiddleName() {
        String displayName = "Vivek Iyer Vishwanath";
        assertEquals(displayName, officialWithMiddle.getDisplayName());
    }

    @Test
    public void officialOverviewTest_shouldGetDisplayNameWithoutMiddleName() {
        String displayName = "Vivek Vishwanath";
        assertEquals(displayName, officialWithoutMiddle.getDisplayName());
    }

    @Test
    public void officialOverviewTest_shouldGetId() {
        String id = "1";
        assertEquals(id, officialWithoutMiddle.getId());
    }

    @Test
    public void officialOverviewTest_shouldGetPartyName() {
        String party = "D";
        assertEquals(party, officialWithoutMiddle.getParty());
    }

    @Test
    public void officialOverviewTest_shouldGetState() {
        String state = "IL";
        assertEquals(state, officialWithoutMiddle.getState());
    }
}