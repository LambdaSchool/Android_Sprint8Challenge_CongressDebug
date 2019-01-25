package com.lambdaschool.congressdata;

import android.content.Intent;

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
}