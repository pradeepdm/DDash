package com.ws.dmp.doordashlite;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.ui.activities.MainActivity;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by prade on 10/14/2018.
 */

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private MockWebServer server;
    private static final String FILENAME = "restaurants_5.json";

    @Rule
    public IntentsTestRule<MainActivity> mIntentsRule =
            new IntentsTestRule<MainActivity>(MainActivity.class) {

                @Override
                protected void beforeActivityLaunched() {
                    super.beforeActivityLaunched();
                    server = new MockWebServer();
                    String json = null;
                    try {
                        json = HelperClass.getStringFromAssets(
                                InstrumentationRegistry.getTargetContext(),
                                FILENAME);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    server.enqueue(new MockResponse().setBody(json));
                    Repository.getInstance(HelperClass.getMockRetrofitInstance(server));
                }
            };

    @After
    public void tearDown()
            throws IOException {
        server.shutdown();
    }

    @Test
    public void restaurantsList_scroll() {
        onView(withId(R.id.restaurantList)).perform(RecyclerViewActions.scrollToPosition(3));
        onView(withId(R.id.restaurantList)).perform(RecyclerViewActions.scrollToPosition(0));
    }

    @Test
    public void restaurant_click() {
        onView(withId(R.id.restaurantList))
                .perform(RecyclerViewActions.actionOnItemAtPosition(3, ViewActions.click()));
    }

}
