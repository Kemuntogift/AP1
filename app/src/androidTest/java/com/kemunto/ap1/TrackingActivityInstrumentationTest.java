package com.kemunto.ap1;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TrackingActivityInstrumentationTest {
    @Rule
    public ActivityScenarioRule<TrackingActivity> activityRule =
            new ActivityScenarioRule<>(TrackingActivity.class);

    @Test
    public void validateNameEditText() {
        onView(withId(R.id.personNameEditText)).perform(typeText("Gift"))
                .check(matches(withText("Gift")));
    }
    @Test
    public void validateLocationEditText() {
        onView(withId(R.id.yourLocationEditText)).perform(typeText("Donholm"))
                .check(matches(withText("Donholm")));
    }
    @Test
    public void validateSizeEditText() {
        onView(withId(R.id.itemSizeEditText)).perform(typeText("Medium"))
                .check(matches(withText("Medium")));
    }
    @Test
    public void validateDestinationEditText() {
        onView(withId(R.id.whereToEditText)).perform(typeText("Kilimani"))
                .check(matches(withText("Kilimani")));
    }
}
