package com.lambdaschool.congressdata;

import android.content.Intent;

import com.lambdaschool.congressdataapiaccess.CongressDao;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.openLinkWithText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

public class DetailsActivityTest {

    Intent intent;
    CongresspersonProfile profile;

    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule = new ActivityTestRule<>(DetailsActivity.class,
            false,
            false);

    @Before
    public void setUp() throws Exception {
        profile = new CongresspersonProfile(CongressDao.getMemberDetails("A000374"));
        profile.setImage(CongressDao.getImage(profile.getId()));

        intent = new Intent();
        intent.putExtra("id", profile.getId());

        activityTestRule.launchActivity(intent);

    }

    @Test
    public void shouldShowDisplayName(){

        ViewInteraction outPut = onView(withId(R.id.profile_name));
        outPut.check(matches(ViewMatchers.withText(profile.getDisplayName())));

       // onView(withId(R.id.profile_name)).check(matches(withText(profile.getDisplayName())));

    }

    @Test
    public void shouldShowPart(){
        ViewInteraction outPut = onView(withId(R.id.profile_party));
        outPut.check(matches(ViewMatchers.withText(profile.getParty())));

        // onView(withId(R.id.profile_party)).check(matches(withText(profile.getParty())));
    }

    @Test
    public void shouldShowDistrict(){
        ViewInteraction outPut = onView(withId(R.id.profile_district));
        outPut.check(matches(ViewMatchers.withText(profile.getLocation())));

         //onView(withId(R.id.profile_district)).check(matches(withText(profile.getLocation())));
    }

    @Test
    public void shouldOpenTwitter(){
        onView(withId(R.id.profile_twitter)).perform(openLinkWithText("Twitter"));
    }

    @Test
    public void shouldOpenFacebook(){
        onView(withId(R.id.profile_facebook)).perform(openLinkWithText("Facebook"));
    }

    @Test
    public void shouldOpenMap(){
        onView(withId(R.id.profile_map)).perform(openLinkWithText("Office"));
    }

}