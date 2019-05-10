package com.lambdaschool.congressdata;

import android.content.Intent;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasLinks;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailsActivityTest {


    @Rule
    public ActivityTestRule<DetailsActivity> detailsActivityTestRule = new ActivityTestRule<>(
            DetailsActivity.class, false, false);

    @Before
    public void setUp() throws Exception {

        Intent intent = new Intent();
        intent.putExtra("id", "A000371");
        detailsActivityTestRule.launchActivity(intent);

    }

    @Test
    public void CheckName_ReturnsTrue (){
        onView(withId(R.id.profile_name)).check(matches(withText("Pete Aguilar")));
    }

    @Test
    public void CheckParty_ReturnsTrue (){
        onView(withId(R.id.profile_party)).check(matches(isCompletelyDisplayed()));
        onView(withId(R.id.profile_party)).check(matches(withText("Democrat")));
    }

    @Test
    public void CheckDistrict_ReturnsTrue (){
        onView(withId(R.id.profile_district)).check(matches(isCompletelyDisplayed()));
        onView(withId(R.id.profile_district)).check(matches(withText("CA - District 31")));
    }

    @Test
    public void CheckPhoneNumber_ReturnsTrue (){
        onView(withId(R.id.profile_phone)).check(matches(isCompletelyDisplayed()));
        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-3201")));
    }

    @Test
    public void CheckTwitter_ReturnsTrue (){
        onView(withId(R.id.profile_twitter)).check(matches(isCompletelyDisplayed()));
        onView(withId(R.id.profile_twitter)).check(matches(isClickable()));
        onView(withId(R.id.profile_twitter)).check(matches(hasLinks()));
        onView(withId(R.id.profile_twitter)).check(matches(withText("Twitter")));
    }

    @Test
    public void CheckFacebook_ReturnsTrue (){
        onView(withId(R.id.profile_facebook)).check(matches(isCompletelyDisplayed()));
        onView(withId(R.id.profile_facebook)).check(matches(isClickable()));
        onView(withId(R.id.profile_facebook)).check(matches(hasLinks()));
        onView(withId(R.id.profile_facebook)).check(matches(withText("Facebook")));
    }


    @Test
    public void CheckOffice_ReturnsTrue (){
        onView(withId(R.id.profile_map)).check(matches(isCompletelyDisplayed()));
        onView(withId(R.id.profile_map)).check(matches(isClickable()));
        onView(withId(R.id.profile_map)).check(matches(hasLinks()));
        onView(withId(R.id.profile_map)).check(matches(withText("Office")));
    }



    @Test
    public void CheckImage_ReturnsTrue (){
        onView(withId(R.id.profile_image)).check(matches(isCompletelyDisplayed()));
    }
}