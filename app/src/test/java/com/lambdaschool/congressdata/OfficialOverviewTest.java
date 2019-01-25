package com.lambdaschool.congressdata;

import org.junit.Before;

import static org.junit.Assert.*;

public class OfficialOverviewTest {

    OfficialOverview officialOverview;

    @Before
    public void setUp() throws Exception {
        officialOverview = new OfficialOverview(
                        "firstName", "middleName",
                "lastName", "party", "state", "id");

    }

    


}