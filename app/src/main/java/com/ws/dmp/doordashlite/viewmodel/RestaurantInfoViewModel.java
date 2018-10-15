package com.ws.dmp.doordashlite.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.VisibleForTesting;

import com.github.leonardoxh.livedatacalladapter.Resource;
import com.ws.dmp.doordashlite.di.DoorDashApp;
import com.ws.dmp.doordashlite.model.Restaurant;
import com.ws.dmp.doordashlite.remote.Repository;

import javax.inject.Inject;

public class RestaurantInfoViewModel extends ViewModel {

    @Inject
    Repository repository;

    public RestaurantInfoViewModel() {
        DoorDashApp.getInstance()
                .getApplicationComponent()
                .inject(this);
    }

    @VisibleForTesting()
    public RestaurantInfoViewModel(Repository repository) {
        this.repository = repository;
    }

    public LiveData<Resource<Restaurant>> getRestaurantInfo(int id) {
        return repository.getRestaurantInfo(id);
    }
}
