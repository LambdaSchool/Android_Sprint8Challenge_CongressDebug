package com.lambdaschool.congressdata;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    @Test
    public void getDisplayName_True() {
        String firstName = "John";
        String middleName = "A";
        String lastName = "Doe";

        OfficialOverview officialOverview = new OfficialOverview(firstName, middleName, lastName, "", "", "");

        assertEquals(firstName + " " + middleName + " " + lastName, officialOverview.getDisplayName());
    }

    @Test
    public void getters_True() {
        String party = "R";
        String state = "IL";
        String id = "id";

        OfficialOverview officialOverview = new OfficialOverview("", "", "", party, state, id);

        assertEquals(party, officialOverview.getParty());
        assertEquals(state, officialOverview.getState());
        assertEquals(id, officialOverview.getId());
    }

}