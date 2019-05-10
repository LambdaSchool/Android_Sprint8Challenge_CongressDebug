package com.lambdaschool.congressdata;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Activity;
import android.content.Intent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.*;


public class DetailsActivityTest {

    private OfficialOverview officialOverview;

    @Rule
    public ActivityTestRule<DetailsActivity> detailsActivityTestRule = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() {

        officialOverview = new OfficialOverview("Jaime", "Herrera", "Beutler", "Republican", "WA - District 3", "H001056");

        Intent intent = new Intent();
        intent.putExtra("id", officialOverview.getId());

        detailsActivityTestRule.launchActivity(intent);
    }

    @Test
    public void detailsActivity_DisplayName_ReturnsTrue() {
        onView(withId(R.id.profile_name)).check(matches(withText(officialOverview.getDisplayName())));
    }

    @Test
    public void detailsActivity_DisplayParty_ReturnsTrue() {
        onView(withId(R.id.profile_party)).check(matches(withText(officialOverview.getParty())));
    }

    @Test
    public void detailsActivity_DisplayState_ReturnsTrue() {
        onView(withId(R.id.profile_district)).check(matches(withText(officialOverview.getState())));
    }

    @Test
    public void detailsActivity_DisplaPhone_ReturnsTrue() {
        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-3536")));
    }
}
