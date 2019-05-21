package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {


    @Before
    public void initialize(){

    }

    @Test
    public void testgetDisplayName() {
        OfficialOverview officialOverview= new OfficialOverview("FirstName", "MiddleName", "LastName", "Party", "State", "id");
        assertEquals( "FirstName MiddleName LastName",officialOverview.getDisplayName());
    }


}