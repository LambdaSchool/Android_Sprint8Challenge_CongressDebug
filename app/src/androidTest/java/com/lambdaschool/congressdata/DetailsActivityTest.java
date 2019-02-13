package com.lambdaschool.congressdata;

import android.content.Context;
import android.content.Intent;
import android.text.Html;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class DetailsActivityTest {
    Context context;
    CongresspersonProfile profile;
    Intent intent;



    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule = new ActivityTestRule<>(DetailsActivity.class, false, false);


    @Before
    public void setUp() throws Exception {
        Intent intent = new Intent();
        intent.putExtra(DetailsActivity.DETAILS_INTENT_TAG, profile.getId());
        activityTestRule.launchActivity(intent);
        context = activityTestRule.getActivity();


    }

    @Test
    public void DisplayFullName() {
        onView(withId(R.id.profile_name)).check(matches(withText(profile.getDisplayName())));


    }
    @Test
    public void ShowDisplayParty() {

        onView(withId(R.id.profile_party)).check(matches(withText(profile.getParty())));
    }
    @Test
    public void DisplayDistrict() {

        onView(withId(R.id.profile_district)).check(matches(withText(profile.getLocation())));
    }



}