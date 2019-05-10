package com.lambdaschool.congressdata;

import android.app.Activity;
import android.content.Intent;

import androidx.test.espresso.action.ViewActions;
import androidx.test.rule.ActivityTestRule;

import com.lambdaschool.congressdataapiaccess.CongressDao;
import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class DetailsActivityTest {

    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp(){
        Intent intent = new Intent();
        intent.putExtra("id", "A000374");
        activityTestRule.launchActivity(intent);
    }

    @Test
    public void detailsActivity_CheckName_ReturnsName(){
        onView(withId(R.id.profile_name)).check(matches(withText("Ralph Abraham")));
    }

    @Test
    public void detailsActivity_CheckClickableTwitter_ReturnsTrue(){
        onView(withId(R.id.profile_twitter)).check(matches(isClickable()));
    }

    @Test
    public void detailsActivity_CheckClickableFacebook_ReturnsTrue(){
        onView(withId(R.id.profile_facebook)).check(matches(isClickable()));
    }

    @Test
    public void detailsACtivity_CheckClickableOffice_ReturnsTrue(){
        onView(withId(R.id.profile_map)).check(matches(isClickable()));
    }

    @Test
    public void detailsActivity_CheckImageDisplayed_ReturnsTrue(){
        onView(withId(R.id.profile_image)).check(matches(isDisplayed()));
    }

}