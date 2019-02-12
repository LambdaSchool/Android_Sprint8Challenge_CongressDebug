package com.lambdaschool.congressdata;

import android.content.Context;
import android.content.Intent;

import com.lambdaschool.congressdataapiaccess.CongressDao;
import com.lambdaschool.congressdataapiaccess.CongresspersonDetails;
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
    CongresspersonProfile congresspersonProfile;

    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule =
            new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() throws Exception{
        Intent intent = new Intent();
        congresspersonProfile = new CongresspersonProfile(CongressDao.getMemberDetails("A000374"));
        intent.putExtra(DetailsActivity.DETAILS_TEST_TAG, congresspersonProfile.getId());
        activityTestRule.launchActivity(intent);
        context = activityTestRule.getActivity();
    }

    @Test
    public void shouldDisplayName(){
        onView(withId(R.id.profile_name)).check(matches(withText(congresspersonProfile.getDisplayName())));
    }

    @Test
    public void shouldDisplayParty(){
        onView(withId(R.id.profile_party)).check(matches(withText(congresspersonProfile.getParty())));
    }

    @Test
    public void shouldDisplayDistrict(){
        onView(withId(R.id.profile_district)).check(matches(withText(congresspersonProfile.getDistrict())));
    }

}