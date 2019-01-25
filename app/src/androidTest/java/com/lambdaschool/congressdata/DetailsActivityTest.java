package com.lambdaschool.congressdata;

import android.content.Intent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.openLinkWithText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


public class DetailsActivityTest {

    private static final String STATIC_ID = "A000055";
    private OfficialOverview officialOverview;

    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule
            = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() throws Exception {
        Intent intent = new Intent();
        intent.putExtra("id", STATIC_ID);
        activityTestRule.launchActivity(intent);
        officialOverview = new OfficialOverview("Robert", "B.", "Aderholt", "R", "AL", "A000055");
    }

    @Test
    public void shouldDisplayFullyFormatedNameInProfileNameTextView(){
        //Setup
        String formatedName = officialOverview.getDisplayName();

        //Check
        onView(withId(R.id.profile_name)).check(matches(withText(formatedName)));
    }

    @Test
    public void shouldDisplayCorrectPartyRepresenting () {
        //Setup
        String party = "Republican";

        //Check
        onView(withId(R.id.profile_party)).check(matches(withText(party)));
    }

    @Test
    public void shouldDisplayMatchingStateAndDistrictNumber() {
        //Setup
        String stateDistrict = officialOverview.getState() + " - District 4";

        //Check
        onView(withId(R.id.profile_district)).check(matches(withText("AL - District 4")));
    }

    @Test
    public void shouldDisplayClickOnTwitterLinkAndOpen(){
        onView(withId(R.id.profile_twitter)).perform(openLinkWithText("Twitter"));
    }

    @Test
    public void shouldDisplayClickOnFacebookLinkAndOpen(){
        onView(withId(R.id.profile_facebook)).perform(openLinkWithText("Facebook"));
    }

    @Test
    public void shouldDisplayClickOnOfficeLocationLinkAndOpen(){
        onView(withId(R.id.profile_map)).perform(openLinkWithText("Office"));
    }

    @Test
    public void shouldDisplayCorrectPhoneNumber(){
        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-4876")));
    }



}