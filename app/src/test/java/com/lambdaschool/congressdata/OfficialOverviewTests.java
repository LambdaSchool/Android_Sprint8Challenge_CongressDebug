package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class OfficialOverviewTests {
	OfficialOverview officialOverview;
	@Before
	public void setup(){
		 officialOverview= new OfficialOverview( "Peter",  "P.",  "Parker",  "D",  "NewYork",  "A0000055");
	}
	
	@Test
	public void OfficialOverview_BuildName_ResultTrue(){
		assertThat(officialOverview.getDisplayName(),equalTo("Peter P. Parker"));
	}
}
