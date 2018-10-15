package com.ws.dmp.doordashlite.di.component;

import com.ws.dmp.doordashlite.di.module.ApplicationModule;
import com.ws.dmp.doordashlite.viewmodel.MainActivityViewModel;
import com.ws.dmp.doordashlite.viewmodel.RestaurantInfoViewModel;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by prade on 10/13/2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivityViewModel mainActivityViewModel);

    void inject(RestaurantInfoViewModel restaurantInfoViewModel);
}