package com.ws.dmp.doordashlite;

import com.google.gson.Gson;
import com.ws.dmp.doordashlite.model.Restaurant;
import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.utils.Constants;
import com.ws.dmp.doordashlite.utils.RetrofitFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by prade on 10/13/2018.
 */
public class RepositoryTest {

    private MockWebServer server;
    private Repository repository;
    private final String FILENAME_5 = "restaurants_5.json";
    private final String FILENAME_30 = "restaurant_30.json";

    private static final String END_POINT = "/v2/restaurant/";

    @Before
    public void setUp() throws Exception {
        server = new MockWebServer();
        repository = new Repository(RetrofitFactory.getInstance());
    }

    @After
    public void tearDown() throws Exception {
        server.shutdown();
    }

    @Test
    public void getAllRestaurants_Test() throws IOException, InterruptedException {
        MockResponse mockedResponse = new MockResponse();
        mockedResponse.setBody(getStringFromResources(FILENAME_5));
        server.enqueue(mockedResponse);
        repository.getAllRestaurants(
                Constants.LATITUDE,
                Constants.LONGITUDE,
                0,
                5).observeForever(listResource -> {
            List<Restaurant> restaurants = listResource.getResource();
            assertNotNull(restaurants);
            assertEquals(5, restaurants.size());
        });
    }


    @Test
    public void getAllRestaurants_Test_Path() throws IOException, InterruptedException {
        MockResponse mockedResponse = new MockResponse();
        mockedResponse.setBody(getStringFromResources(FILENAME_5));
        server.enqueue(mockedResponse);

        RecordedRequest request = server.takeRequest();
        assertEquals(String.format("%s?lat=%s&lng=%s&offset=0&limit=5",
                END_POINT,
                Constants.LATITUDE,
                Constants.LONGITUDE),
                request.getPath());
    }

    @Test
    public void getRestaurantInfo_Test() throws IOException, InterruptedException {
        MockResponse mockedResponse = new MockResponse();
        String json = getStringFromResources(FILENAME_30);
        mockedResponse.setBody(json);
        server.enqueue(mockedResponse);

        Restaurant restaurantActual = repository.getRestaurantInfo(30).getValue().getResource();
        assertNotNull(restaurantActual);
        Gson gson = new Gson();

        Restaurant restaurantExpected = gson.fromJson(json, Restaurant.class);
        assertEquals(restaurantExpected.getId(), restaurantActual.getId());
    }

    @Test
    public void getRestaurantInfo_Test_Path() throws IOException, InterruptedException {
        MockResponse mockedResponse = new MockResponse();
        String json = getStringFromResources(FILENAME_30);
        mockedResponse.setBody(json);
        server.enqueue(mockedResponse);

        RecordedRequest request = server.takeRequest();
        assertEquals(String.format("%s30/", END_POINT), request.getPath());
    }

    private String getStringFromResources(String fileName) throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        StringBuilder buffer = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            while ((line = br.readLine()) != null) {
                buffer.append(line).append("\n");
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        return buffer.toString();
    }


}
