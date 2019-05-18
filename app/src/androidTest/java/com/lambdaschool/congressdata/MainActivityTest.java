package com.lambdaschool.congressdata;

import android.support.v7.app.AppCompatActivity;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.actionWithAssertions;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;

public class MainActivityTest{
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);


    @Test
    public void onCreate() {


        Intents.init();
        onView(allOf(withId(R.id.text_list_name),withText("Alma Adams"))).perform(click());
               Intents.release();
    }

    @Test
    public void setTheme() {
    }

    @Test
    public void getThemeId() {
    }

    @Test
    public void onStart() {
    }

    @Test
    public void onResume() {
    }
}

