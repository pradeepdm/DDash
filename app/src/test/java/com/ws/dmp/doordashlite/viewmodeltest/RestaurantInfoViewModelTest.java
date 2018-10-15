package com.ws.dmp.doordashlite.viewmodeltest;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.utils.RetrofitFactory;
import com.ws.dmp.doordashlite.viewmodel.RestaurantInfoViewModel;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import okhttp3.mockwebserver.MockWebServer;


/**
 * Created by prade on 10/13/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class RestaurantInfoViewModelTest {

    Repository repository;
    RestaurantInfoViewModel restaurantInfoViewModel;
    MockWebServer server;

    @Before
    public void setUp() throws Exception {
        server = new MockWebServer();
        repository = new Repository(RetrofitFactory.getInstance());
    }

    @After
    public void tearDown() throws Exception {
        server.shutdown();
    }

}
