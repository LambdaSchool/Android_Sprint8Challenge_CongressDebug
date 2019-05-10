package com.lambdaschool.congressdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class OfficialOverviewTest {

    private OfficialOverview goodTestValuesOverview;
    private OfficialOverview testValuesNoMiddleNameOverview;
    String firstN, middleN, lastN, party, state, id;
    String badFirstN, badMiddleN, badLastN, badParty, badState, badId;

    @Before
    public void setUp() throws Exception {

        //good test values
        firstN = "Susan";
        middleN = "Beesly";
        lastN = "Rice";
        party = "D";
        state = "Wa";
        id = "testId";

        goodTestValuesOverview = new OfficialOverview(firstN, middleN, lastN, party, state, id);
        testValuesNoMiddleNameOverview = new OfficialOverview(firstN, "null", lastN, party, state, id);



        //bad test values (Has no effect, since the class accepts any string)
        badFirstN = "!*(#@";
        badMiddleN = "!!!";
        badLastN = "!@#*(";
        badParty = "$*(#@(";
        badState = "!*@(#";
        badId = "*(!$!";
    }



    @Test
    public void ConstructGoodValues_ReturnsTrue() {
        assertEquals(party, goodTestValuesOverview.getParty());
        assertEquals(state, goodTestValuesOverview.getState());
        assertEquals(id, goodTestValuesOverview.getId());
        assertEquals(firstN + " " + middleN + " " + lastN, goodTestValuesOverview.getDisplayName());
    }

    @Test
    public void ConstructValuesNoMiddleName_ReturnsTrue() {
        assertEquals(firstN + " "  + lastN, testValuesNoMiddleNameOverview.getDisplayName());
    }


}