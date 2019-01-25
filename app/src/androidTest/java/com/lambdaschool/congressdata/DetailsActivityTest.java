package com.lambdaschool.congressdata;

import android.content.Intent;

import org.junit.Before;
import org.junit.Rule;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class DetailsActivityTest {


    @Rule
    public ActivityTestRule<DetailsActivity> activityTestRule
            = new ActivityTestRule<>(DetailsActivity.class, false, false);

    @Before
    public void setUp() throws Exception {
        Intent intent = new Intent();
        intent.putExtra("id", "A000372");
        activityTestRule.launchActivity(intent);
    }
}