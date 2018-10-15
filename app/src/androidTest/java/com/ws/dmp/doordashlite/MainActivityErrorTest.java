package com.ws.dmp.doordashlite;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.ViewMatchers;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.ui.activities.MainActivity;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;

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

public class MainActivityErrorTest {

    private MockWebServer server;

    @Rule
    public IntentsTestRule<MainActivity> mIntentsRule =
            new IntentsTestRule<MainActivity>(MainActivity.class) {

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
    public void mainActivity_showError() {
        onView(withText("Error fetching restaurants"))
                .check(matches(withEffectiveVisibility(
                        ViewMatchers.Visibility.VISIBLE
                )));
    }
}
