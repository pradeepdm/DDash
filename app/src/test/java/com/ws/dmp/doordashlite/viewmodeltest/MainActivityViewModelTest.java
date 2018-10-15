package com.ws.dmp.doordashlite.viewmodeltest;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.viewmodel.MainActivityViewModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
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
    @InjectMocks
    MainActivityViewModel mainActivityViewModel;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllRestaurants_Test() {
        verify(mainActivityViewModel, times(1)).getAllRestaurants();
    }
}
