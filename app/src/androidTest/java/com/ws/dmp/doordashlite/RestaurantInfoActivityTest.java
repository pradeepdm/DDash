package com.ws.dmp.doordashlite;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.ui.activities.RestaurantInfoActivity;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by prade on 10/14/2018.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class RestaurantInfoActivityTest {

    private MockWebServer server;
    private static final String FILENAME = "restaurant30.txt";

    @Rule
    public IntentsTestRule<RestaurantInfoActivity> mIntentsRule =
            new IntentsTestRule<RestaurantInfoActivity>(RestaurantInfoActivity.class) {

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
    public void restaurantInfo_Confirm_RestaurantDetails() {
        onView(withId(R.id.restaurantName))
                .check(matches(withText("Amarin Thai Cuisine (Mountain View)")));
        onView(withId(R.id.description))
                .check(matches(withText("Thai Cuisine")));
        onView(withId(R.id.deliveryFee))
                .check(matches(withText("Free delivery!")));
        onView(withId(R.id.restaurantStatus))
                .check(matches(withText("Pre-order for 12:45PM")));
        onView(withId(R.id.restaurantRating))
                .check(matches(withText("Rating: 4.6 / 5.0")));

    }
}
