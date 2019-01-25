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
}