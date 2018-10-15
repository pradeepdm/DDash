package com.ws.dmp.doordashlite.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.VisibleForTesting;

import com.github.leonardoxh.livedatacalladapter.Resource;
import com.ws.dmp.doordashlite.di.DoorDashApp;
import com.ws.dmp.doordashlite.model.Restaurant;
import com.ws.dmp.doordashlite.remote.Repository;

import java.util.List;

import javax.inject.Inject;

import static com.ws.dmp.doordashlite.utils.Constants.LATITUDE;
import static com.ws.dmp.doordashlite.utils.Constants.LONGITUDE;

public class MainActivityViewModel extends ViewModel {

    @Inject
    Repository repository;

    public MainActivityViewModel() {
        DoorDashApp.getInstance()
                .getApplicationComponent()
                .inject(this);
    }

    @VisibleForTesting()
    public MainActivityViewModel(Repository repository) {
        this.repository = repository;
    }

    public LiveData<Resource<List<Restaurant>>> getAllRestaurants() {
        return repository.getAllRestaurants(LATITUDE, LONGITUDE);
    }
}
