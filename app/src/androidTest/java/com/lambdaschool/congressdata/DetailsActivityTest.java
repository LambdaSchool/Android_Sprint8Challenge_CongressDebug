package com.lambdaschool.congressdata;

import android.content.Intent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.openLinkWithText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class DetailsActivityTest {

    private OfficialOverview officialOverviewTest;
    private String firstName = "Frank";
    private String middleName = "A.";
    private String lastName = "LoBiondo";
    private String party = "Republican";
    private String state = "NJ";
    private String district = " - District 2";

    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() {
        // intent to pull data and not start a new activity
        Intent intent = new Intent();
        intent.putExtra("id", "L000554");
        activityTestRule.launchActivity(intent);
        officialOverviewTest = new OfficialOverview(firstName, middleName, lastName, party, state, district);
    }

    @Test
    public void doesDisplayNameWork() {
        // setup
        String displayName = officialOverviewTest.getDisplayName();

        // execution

        // check
        onView(withId(R.id.profile_name)).check(matches(withText(displayName)));

    }

    @Test
    public void doesDisplayPartyWork() {
        // setup
        String displayParty = officialOverviewTest.getParty();

        // execution

        // check
        onView(withId(R.id.profile_party)).check(matches(withText(displayParty)));

    }

    @Test
    public void doesDisplayStateWork() {
        // setup
        String displayState = officialOverviewTest.getState();

        // execution

        // check
        onView(withId(R.id.profile_district)).check(matches(withText(displayState + district)));

    }

    @Test
    public void doesTwitterLinkWork() {
        // setup
        String twitter = "Twitter";

        // execution

        // check
        onView(withId(R.id.profile_twitter)).perform(openLinkWithText(twitter));

    }

    @Test
    public void doesFacebookLinkWork() {
        // setup
        String fb = "Facebook";

        // execution

        // check
        onView(withId(R.id.profile_facebook)).perform(openLinkWithText(fb));

    }

    @Test
    public void doesOfficeLinkWork() {
        // setup
        String office = "Office";

        // execution

        // check
        onView(withId(R.id.profile_map)).perform(openLinkWithText(office));

    }

}