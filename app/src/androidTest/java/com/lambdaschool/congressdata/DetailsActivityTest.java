package com.lambdaschool.congressdata;

import android.content.Intent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.openLinkWithText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class DetailsActivityTest {


    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule
            = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() throws Exception {
        Intent intent = new Intent();
        intent.putExtra("id", "A000372");
        activityTestRule.launchActivity(intent);
    }

    @Test
    public void shouldDisplayFullName(){
        onView(withId(R.id.profile_name)).check(matches(withText("Rick Allen")));
    }


    @Test
    public void shouldDisplayCorrectParty(){
        onView(withId(R.id.profile_party)).check(matches(withText("Republican")));
    }

    @Test
    public void shouldDisplayCorrectStateAndDistrict(){
        onView(withId(R.id.profile_district)).check(matches(withText("GA - District 12")));
    }

    @Test
    public void shouldDisplayCorrectTwitter(){
        onView(withId(R.id.profile_twitter)).perform(openLinkWithText("Twitter"));
    }

    @Test
    public void shouldDisplayCorrectFacebook(){
        onView(withId(R.id.profile_facebook)).perform(openLinkWithText("Facebook"));
    }

    @Test
    public void shouldDisplayOffice(){
        onView(withId(R.id.profile_map)).perform(openLinkWithText("Office"));
    }
}