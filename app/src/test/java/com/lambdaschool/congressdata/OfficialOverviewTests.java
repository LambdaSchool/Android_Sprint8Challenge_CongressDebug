package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class OfficialOverviewTests {
	
	private DetailsActivity detailsActivity = null;
	
	@Before
	public void setup(){
		detailsActivity = Robolectric.setupActivity(DetailsActivity.class);
	}
	
	@Test
	public void detailsActivity_CorrectCongressPerson_ResultTrue(){
	
	}
}
