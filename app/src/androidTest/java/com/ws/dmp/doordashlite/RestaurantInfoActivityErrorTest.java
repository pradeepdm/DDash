package com.ws.dmp.doordashlite;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.MediumTest;
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
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by prade on 10/14/2018.
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class RestaurantInfoActivityErrorTest {
    private MockWebServer server;

    @Rule
    public IntentsTestRule<RestaurantInfoActivity> mIntentsRule =
            new IntentsTestRule<RestaurantInfoActivity>(RestaurantInfoActivity.class) {

                @Override
                protected void beforeActivityLaunched() {
                    super.beforeActivityLaunched();
                    server = new MockWebServer();
                    server.enqueue(new MockResponse().setHttp2ErrorCode(404));
                    Repository.getInstance(HelperClass.getMockRetrofitInstance(server));
                }
            };

    @After
    public void tearDown()
            throws IOException {
        server.shutdown();
    }

    @Test
    public void restaurantInfo_showError() {
        onView(withText("Error fetching restaurant information"))
                .check(matches(withEffectiveVisibility(
                        ViewMatchers.Visibility.VISIBLE
                )));
    }

}
