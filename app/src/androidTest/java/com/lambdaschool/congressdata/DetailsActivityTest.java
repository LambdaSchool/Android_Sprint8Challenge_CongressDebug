package com.lambdaschool.congressdata;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;

public class DetailsActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setUp() throws Exception {

        Intents.init();
    //    onView( allOf( withId( R.id.text_list_name ), withText( "Ralph Abraham" ) ) ).perform( click() );//this one works
   //     onView(withId( R.id.layout_list )  ).perform( RecyclerViewActions.scrollTo(hasDescendant (withText( "James Baird" )) ) );
     //   onView(withId( R.id.layout_list )  ).perform( RecyclerViewActions.actionOnItemAtPosition( 0,click() ) );
        onView(withId(R.id.card_view)).check(matches(hasDescendant(withText("James Baird"))));
    }

    @Test
    public void testFacebook() {
        onView(withId( R.id.profile_facebook )).perform( click() );

    }

    @Test
    public void testTwitter() {
        onView(withId( R.id.profile_twitter )).perform( click() );

    }


    @Test
    public void testOffice() {
        onView(withId( R.id.profile_map )).perform( click() );

    }


    @Test
    public void testName() {
        onView(withId( R.id.profile_name )).perform( click() );

    }


    @After
    public void onClose() {

        Intents.release();
    }
}