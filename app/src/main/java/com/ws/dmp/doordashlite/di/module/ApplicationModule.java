package com.ws.dmp.doordashlite.di.module;

import com.ws.dmp.doordashlite.remote.Repository;
import com.ws.dmp.doordashlite.utils.RetrofitFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by prade on 10/13/2018.
 */
@Module
public class ApplicationModule {

    public ApplicationModule() {
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofitInstance() {
        return RetrofitFactory.getInstance();
    }

    @Singleton
    @Provides
    public Repository provideRemoteRepository(Retrofit retrofit) {
        return Repository.getInstance(retrofit);
    }
}
