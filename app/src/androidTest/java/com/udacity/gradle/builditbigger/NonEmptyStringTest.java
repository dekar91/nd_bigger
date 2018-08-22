package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import junit.extensions.ActiveTestSuite;


//@RunWith(AndroidJUnit4.class);
public class NonEmptyStringTest {

    private static final String LOG_TAG = "NonEmptyStringTest";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);



    @SuppressWarnings("unchecked")
    @Test
    public void test() {


        // Testing that Async task successfully retrieves a non-empty string
        // You can test this from androidTest -> Run 'All Tests'
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mActivityRule.getActivity(), null);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
