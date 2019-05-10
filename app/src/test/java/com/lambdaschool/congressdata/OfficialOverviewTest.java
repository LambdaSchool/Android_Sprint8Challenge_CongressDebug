package com.lambdaschool.congressdata;

import com.lambdaschool.congressdataapiaccess.CongressDao;
import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class OfficialOverviewTest {

private OfficialOverview officialOverview;

    @Before
    public void initialize() {

        officialOverview = new OfficialOverview("Jaime", "Herrera", "Beutler", "R", "WA", "H001056");

    }

    @Test
    public void checkDisplayName() {
        assertEquals("Jaime Herrera Beutler",officialOverview.getDisplayName());
    }

    @Test
    public void checkId() {
        assertEquals("H001056",officialOverview.getId());
    }

    @Test
    public void checkParty() {
        assertEquals("R",officialOverview.getParty());
    }

    @Test
    public void checkState() {
        assertEquals("WA",officialOverview.getState());
    }

}