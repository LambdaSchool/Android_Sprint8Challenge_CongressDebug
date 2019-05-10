package com.lambdaschool.congressdata;

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

        assertEquals("John A Doe", officialOverview.getDisplayName());
    }

}