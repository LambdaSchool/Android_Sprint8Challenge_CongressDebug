package com.lambdaschool.congressdata


import org.junit.Assert.assertEquals
import org.junit.Test


class OfficialOverviewTest {


    @Test
    fun getDisplayName_True() {

        val firstName = "john"
        val middleName = "a"
        val lastName = "doe"


        val officialOverview = OfficialOverview(firstName, lastName, middleName, "", "", "")

        assertEquals("$firstName $middleName $lastName", officialOverview.displayName)

    }


    @Test
    fun getters_True() {

        val party = "R"
        val state = "IL"
        val id = "id"

        val officialOverview = OfficialOverview("", "", "", party, state, id)

        assertEquals(party, officialOverview.party)
        assertEquals(state, officialOverview.state)
        assertEquals(id, officialOverview.id)
    }
}