package com.lambdaschool.congressdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {


    private OfficialOverview officialOverviewTest = new OfficialOverview("Charles", "Dale", "Godoy", "D", "NJ", "08902");


    @Test
    public void doesDisplayNameWork() {
        // setup
        String fullName = "Charles Dale Godoy";

        // execution


        // check
        assertEquals(fullName, officialOverviewTest.getDisplayName());

    }


    @Test
    public void doesDisplayPartyWork() {
        // setup
        String party = "D";

        // execution


        // check
        assertEquals(party, officialOverviewTest.getParty());

    }


    @Test
    public void doesDisplayStateWork() {
        // setup
        String state = "NJ";

        // execution


        // check
        assertEquals(state, officialOverviewTest.getState());

    }


    @Test
    public void doesDisplayIdWork() {
        // setup
        String id = "08902";

        // execution


        // check
        assertEquals(id, officialOverviewTest.getId());

    }


    @Test
    public void doesBuildDisplayNameWork() {
        // setup
        String buildName = "Charles Dale Godoy";

        // execution


        // check
        assertEquals(buildName, officialOverviewTest.buildDisplayName());

    }

}