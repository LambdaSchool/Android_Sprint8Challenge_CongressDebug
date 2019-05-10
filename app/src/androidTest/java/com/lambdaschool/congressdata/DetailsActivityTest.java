package com.lambdaschool.congressdata;

import android.content.Intent;
import android.text.Html;

import androidx.test.rule.ActivityTestRule;

import com.lambdaschool.congressdataapiaccess.CongressDao;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailsActivityTest {

    private CongresspersonProfile profile;
    private static final String TEST_ID = "A000370";

    @Rule
    public ActivityTestRule<DetailsActivity> detailsActivityActivityTestRule = new
            ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() {
        profile = new CongresspersonProfile(CongressDao.getMemberDetails(TEST_ID));
        Intent intent = new Intent();
        intent.putExtra("id", profile.getId());
        detailsActivityActivityTestRule.launchActivity(intent);
    }

    @Test
    public void detailsActivityTest_shouldDisplayName() {
        onView(withId(R.id.profile_name)).check(matches(withText(profile.getDisplayName())));
    }

    @Test
    public void detailsActivityTest_shouldDisplayProfileParty() {
        onView(withId(R.id.profile_party)).check(matches(withText(profile.getParty())));
    }

    @Test
    public void detailsActivityTest_shouldDisplayProfileLocation() {
        onView(withId(R.id.profile_district)).check(matches(withText(profile.getLocation())));
    }

    @Test
    public void detailsActivityTest_shouldDisplayPhoneNumber() {
        onView(withId(R.id.profile_phone)).check(matches(withText(profile.getPhone())));
    }

    @Test
    public void detailsActivityTest_shouldDisplayTwitterLink() {
        String twitter = Html.fromHtml("<a href=\"https://twitter.com/"
                + profile.getTwitterAccount() + "\">Twitter</a>").toString();
        onView(withId(R.id.profile_twitter)).check(matches(withText(twitter)));
    }

    @Test
    public void detailsActivityTest_shouldDisplayFacebookLink() {
        String facebook = Html.fromHtml("<a href=\"https://www.facebook.com/"
                + profile.getFacebookAccount() + "/\">Facebook</a>").toString();
        onView(withId(R.id.profile_facebook)).check(matches(withText(facebook)));
    }

    @Test
    public void detailsActivityTest_shouldDisplayOfficeLocationLink() {
        String office = Html.fromHtml("<a href=\"https://www.google.com/maps/search/"
                + profile.getOffice().replace(" ", "-") + "\">Office</a>").toString();
        onView(withId(R.id.profile_map)).check(matches(withText(office)));
    }

    @Test
    public void detailsActivityTest_shouldDisplayPrimaryProgress() {
        onView(withId(R.id.profile_voting_bar)).check(matches(isDisplayed()));
    }
}


// Html.fromHtml("<a href=\"https://www.google.com/maps/search/" + profile.getOffice().replace(" ", "-") + "\">Office</a>")
// Html.fromHtml("<a href=\"https://www.facebook.com/" + profile.getFacebookAccount() + "/\">Facebook</a>")
// Html.fromHtml("<a href=\"https://twitter.com/" + profile.getTwitterAccount() + "\">Twitter</a>")