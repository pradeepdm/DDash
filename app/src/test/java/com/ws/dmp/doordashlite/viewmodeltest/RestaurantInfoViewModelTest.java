package com.ws.dmp.doordashlite.viewmodeltest;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.viewmodel.RestaurantInfoViewModel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


/**
 * Created by prade on 10/13/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class RestaurantInfoViewModelTest {

    @Mock
    Repository repository;
    RestaurantInfoViewModel restaurantInfoViewModel;

    @Before
    public void setUp() throws Exception {
        restaurantInfoViewModel = new RestaurantInfoViewModel(repository);
    }

    @Test
    public void getRestaurantInfo_Test() {
        restaurantInfoViewModel.getRestaurantInfo(10);
        verify(repository, times(1)).getRestaurantInfo(10);
    }

}
