package com.lambdaschool.congressdata;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import com.lambdaschool.congressdataapiaccess.CongressDao;
import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.Serializable;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.openLinkWithText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailsActivityTest {

    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule
            = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() throws Exception {
        Intent intent = new Intent();
        CongresspersonOverview congresspersonOverview = new CongresspersonOverview(
                "Rick",  null,  "Allen",  "R",  "Georgia",  "A000372");
        intent.putExtra("overview", congresspersonOverview);
        activityTestRule.launchActivity(intent);
    }

    @Test
    public void shouldDisplayFullName(){
        onView(withId(R.id.profile_name)).check(matches(withText("Rick Allen")));
    }


    @Test
    public void shouldDisplayCorrectParty(){
        onView(withId(R.id.profile_party)).check(matches(withText("Republican")));
    }

    @Test
    public void shouldDisplayCorrectStateAndDistrict(){
        onView(withId(R.id.profile_district)).check(matches(withText("GA - District 12")));
    }

    @Test
    public void shouldClickOnTwitterLinkAndOpen(){
        onView(withId(R.id.profile_twitter)).perform(openLinkWithText("Twitter"));
    }

    @Test
    public void shouldClickOnFacebookLinkAndOpen(){
        onView(withId(R.id.profile_facebook)).perform(openLinkWithText("Facebook"));
    }

    @Test
    public void shouldClickOnOfficeLinkAndOpen(){
        onView(withId(R.id.profile_map)).perform(openLinkWithText("Office"));
    }

    @Test
    public void shouldDisplayCorrectPhoneNumber(){
        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-2823")));
    }

}