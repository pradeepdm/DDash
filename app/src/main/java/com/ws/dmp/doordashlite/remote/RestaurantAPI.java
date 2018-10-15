package com.ws.dmp.doordashlite.remote;

import android.arch.lifecycle.LiveData;

import com.github.leonardoxh.livedatacalladapter.Resource;
import com.ws.dmp.doordashlite.model.Restaurant;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by prade on 10/12/2018.
 */

public interface RestaurantAPI {

    String ENDPOINT_INFO = "v2/restaurant/";

    @GET(ENDPOINT_INFO)
    LiveData<Resource<List<Restaurant>>> getAllRestaurants(@Query("lat") double latitude,
                                                           @Query("lng") double longitude);

    @GET(ENDPOINT_INFO)
    LiveData<Resource<List<Restaurant>>> getAllRestaurants(@Query("lat") double latitude,
                                                           @Query("lng") double longitude,
                                                           @Query("offset") int offset,
                                                           @Query("limit") int limit);

    @GET(ENDPOINT_INFO + "{id}/")
    LiveData<Resource<Restaurant>> getRestaurantInfo(@Path("id") int id);
}
