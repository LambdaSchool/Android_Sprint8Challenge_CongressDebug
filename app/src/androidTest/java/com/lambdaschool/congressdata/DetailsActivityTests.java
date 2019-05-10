package com.lambdaschool.congressdata;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailsActivityTests {
	
	
	@Rule
	public ActivityTestRule<DetailsActivity> detailsActivityActivityTestRule = new ActivityTestRule<>
			(DetailsActivity.class, false, false);
	
	@Before
	public void SetUp() {
		CongresspersonProfile profile = new CongresspersonProfile( "Peter",  "P.",  "Parker",  "D",
				 "NY",  "A0000055",  "PeterParker",
				 "PeterParker",  "23",  "555-555-5555",
				 "0",  "Peter Parker",  "80");
		Intent intent = new Intent();
		intent.putExtra("object", profile);
		
		detailsActivityActivityTestRule.launchActivity(intent);
	}
	
	@Test
	public void detailsActivity_DisplayUserName_ReturnsTrue(){
		onView(withId(R.id.profile_name)).check(matches(withText("Peter P. Parker")));
	}
	
	@Test
	public void detailsActivity_Party_ReturnsTrue(){
		onView(withId(R.id.profile_party)).check(matches(withText("Democrat")));
	}
	
	
	@Test
	public void detailsActivity_PhoneNumber_ReturnsTrue(){
		onView(withId(R.id.profile_phone)).check(matches(withText("555-555-5555")));
	}
	
	@Test
	public void detailsActivity_District_ReturnsTrue(){
		onView(withId(R.id.profile_district)).check(matches(withText("NY - District 23")));
	}
	
}
