package com.lambdaschool.congressdata;

import android.content.Intent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;


import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * id: A000374
 * firstName: Ralph
 * middleName: null
 * lastName: Abraham
 * district: 5
 * facebookAccount: CongressmanRalphAbraham
 * location: LA - District 5
 * missedVotesPct: 36.73
 * office: 417 Cannon House Office Building
 * party: Republican
 * phone: 202-225-8490
 * state: LA
 * twitterAccount: RepAbraham
 * votesWithPartyPct: 97.56
 *
 * subcommittees: 8
 * 	Conservation and Forestry
 * 	General Farm Commodities and Risk Management
 * 	Military Personnel
 * 	Intelligence and Emerging Threats and Capabilities
 * 	Seapower and Projection Forces
 * 	Research and Technology
 * 	Space and Aeronautics
 * 	Investigations and Oversight
 * */
public class DetailsActivityTest {

    @Rule
    public ActivityTestRule<DetailsActivity> detailsActivityTestRule = new ActivityTestRule<DetailsActivity>(DetailsActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Intent intent = new Intent();
            intent.putExtra("id", "A000374");
            return intent;
        }
    };

    @Test
    public void profileNameTextView_Success() {
        onView(withId(R.id.profile_name)).check(matches(withText("Ralph Abraham")));

    }


}