package com.lambdaschool.congressdata;

import org.junit.Test;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


public class DetailsActivityTest {

    private CongresspersonProfile congresspersonProfile;

    @Rule
    public ActivityTestRule<DetailsActivity> detailsActivityTestRule = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() {

        congresspersonProfile = new CongresspersonProfile("Collin", "C.", "Peterson", "D",
                "MN", "P000258", "CCP",
                "1123456", "7", "202-225-3361",
                "50", "654", "75");

        Intent intent = new Intent();
        intent.putExtra("id", congresspersonProfile.getId());

        detailsActivityTestRule.launchActivity(intent);
    }

    @Test
    public void detailsActivity_DisplayName_ReturnsTrue() {
        onView(withId(R.id.profile_name)).check(matches(withText(congresspersonProfile.getDisplayName())));
    }

    @Test
    public void detailsActivity_DisplayParty_ReturnsTrue() {
        onView(withId(R.id.profile_party)).check(matches(withText(congresspersonProfile.getParty())));
    }

    @Test
    public void detailsActivity_DisplayState_ReturnsTrue() {
        onView(withId(R.id.profile_district)).check(matches(withText(congresspersonProfile.getLocation())));
    }

    @Test
    public void detailsActivity_DisplayPhone_ReturnsTrue() {
        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-2165")));
    }
}
