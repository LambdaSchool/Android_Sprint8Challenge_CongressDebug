package com.lambdaschool.congressdata


import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters


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
 * phone: 202-225-4306
 * state: LA
 * twitterAccount: RepAbraham
 * votesWithPartyPct: 97.56
 * subcommittees: 8
 * Conservation and Forestry
 * General Farm Commodities and Risk Management
 * Military Personnel
 * Intelligence and Emerging Threats and Capabilities
 * Seapower and Projection Forces
 * Research and Technology
 * Space and Aeronautics
 * Investigations and Oversight
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class DetailsActivityTest {

    @Rule
    @JvmField
    var detailsActivityTestRule: ActivityTestRule<DetailsActivity> = object : ActivityTestRule<DetailsActivity>(DetailsActivity::class.java) {
        override fun getActivityIntent(): Intent {
            val intent = Intent()
            intent.putExtra("id", "A000374")
            return intent
        }

    }


//  @Test
//  fun profileNameTextView_ProfileNameIsDisplayName() {

//      onView(withId(R.id.profile_name)).check(matches(withText("Ralph Abraham")))

//  }


    @Test
    fun profilePartyTextView_CorrectParty() {

        onView(withId(R.id.profile_party)).check(matches(withText("Republican")))

    }
    @Test
    fun profilePhoneTextView_CorrectParty() {

        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-4306")))

    }


 // @Test
 // fun profileDistrictTextView_DistrictIsStateAndDistrict() {

 //     onView(withId(R.id.profile_district)).check(matches(withText("LA - District 5")))

 // }


//    @Test
//    fun profilePhoneTextView_Success() {
//
//        onView(withId(R.id.profile_phone)).check(matches(withText("202-225-8490")))
//
//    }

}