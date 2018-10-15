package com.ws.dmp.doordashlite.viewmodeltest;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.utils.Constants;
import com.ws.dmp.doordashlite.viewmodel.MainActivityViewModel;

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
public class MainActivityViewModelTest {

    @Mock
    Repository repository;
    MainActivityViewModel mainActivityViewModel;

    @Before
    public void setUp() throws Exception {
        mainActivityViewModel = new MainActivityViewModel(repository);
    }

    @Test
    public void getAllRestaurants_Test() {
        mainActivityViewModel.getAllRestaurants();
        verify(repository, times(1)).getAllRestaurants(Constants.LATITUDE, Constants.LONGITUDE);
    }
}
