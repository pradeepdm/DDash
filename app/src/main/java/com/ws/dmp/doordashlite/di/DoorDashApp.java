package com.ws.dmp.doordashlite.di;

import android.app.Application;

import com.ws.dmp.doordashlite.di.component.ApplicationComponent;
import com.ws.dmp.doordashlite.di.component.DaggerApplicationComponent;
import com.ws.dmp.doordashlite.di.module.ApplicationModule;

/**
 * Created by prade on 10/13/2018.
 */
public class DoorDashApp extends Application {

    private static DoorDashApp app;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();
    }

    public static DoorDashApp getInstance() {
        return app;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}