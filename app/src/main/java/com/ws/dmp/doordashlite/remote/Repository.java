package com.ws.dmp.doordashlite.remote;

import android.arch.lifecycle.LiveData;

import com.github.leonardoxh.livedatacalladapter.Resource;
import com.ws.dmp.doordashlite.model.Restaurant;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class Repository implements RestaurantAPI {

    private static Repository instance;
    private RestaurantAPI restaurantAPI;

    @Inject
    public Repository(Retrofit retrofit) {
        restaurantAPI = retrofit.create(RestaurantAPI.class);
    }

    @Override
    public LiveData<Resource<List<Restaurant>>> getAllRestaurants(double latitude, double longitude) {
        return restaurantAPI.getAllRestaurants(latitude, longitude);
    }

    @Override
    public LiveData<Resource<List<Restaurant>>> getAllRestaurants(double latitude, double longitude, int offset, int limit) {
        return restaurantAPI.getAllRestaurants(latitude, longitude, offset, limit);
    }

    @Override
    public LiveData<Resource<Restaurant>> getRestaurantInfo(int id) {
        return restaurantAPI.getRestaurantInfo(id);
    }

    public static Repository getInstance(Retrofit retrofit) {
        if (instance == null) {
            synchronized (Repository.class) {
                instance = new Repository(retrofit);
            }
        }
        return instance;
    }

}
