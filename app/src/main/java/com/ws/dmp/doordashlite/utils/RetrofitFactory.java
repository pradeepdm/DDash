package com.ws.dmp.doordashlite.utils;

import com.github.leonardoxh.livedatacalladapter.LiveDataCallAdapterFactory;
import com.github.leonardoxh.livedatacalladapter.LiveDataResponseBodyConverterFactory;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {

    private static Retrofit instance = null;

    public static Retrofit getInstance() {
        if (instance == null) {
            synchronized (RetrofitFactory.class) {
                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                        .create();

                String BASE_URL = "https://api.doordash.com/";
                instance = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addCallAdapterFactory(LiveDataCallAdapterFactory.create())
                        .addConverterFactory(LiveDataResponseBodyConverterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build();
            }
        }
        return instance;
    }
}
