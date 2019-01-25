package com.lambdaschool.congressdata;

import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;

import com.lambdaschool.congressdataapiaccess.CongressDao;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailsActivityTest {

    public static final String STATIC_TEST_ID = "A000374";
    Intent intent;
    CongresspersonProfile profile;
    Context context;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);
    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() {
        profile = new CongresspersonProfile(CongressDao.getMemberDetails(STATIC_TEST_ID));
        profile.setImage(CongressDao.getImage(profile.getId()));

        intent = new Intent();
        intent.putExtra(DetailsActivity.DETAILS_INTENT_TAG, profile.getId());

        activityTestRule.launchActivity(intent);

        context = activityTestRule.getActivity();

    }

    @Test
    public void shouldShowDisplayName() {
        //setup

        //execute

        //check
        onView(withId(R.id.profile_name)).check(matches(withText(profile.getDisplayName())));
    }

    @Test
    public void shouldShowDisplayParty() {
        //setup

        //execute

        //check
        onView(withId(R.id.profile_party)).check(matches(withText(profile.getParty())));
    }

    @Test
    public void shouldDisplayDistrict() {
        //setup

        //execute

        //check
        onView(withId(R.id.profile_district)).check(matches(withText(profile.getDistrict())));
    }

    @Test
    public void shouldShowDisplayTwitter() {
        //setup

        //execute

        //check
        onView(withId(R.id.profile_party)).check(matches(withText(profile.getTwitterAccount())));
    }

    @Test
    public void shouldShowDisplayFacebook() {
        //setup

        //execute

        //check
        onView(withId(R.id.profile_party)).check(matches(withText(profile.getFacebookAccount())));
    }

}