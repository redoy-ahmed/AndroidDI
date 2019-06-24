package com.redoyahmed.androiddi;

import android.app.Application;

import com.redoyahmed.androiddi.di.DaggerNetworkComponent;
import com.redoyahmed.androiddi.di.NetworkComponent;
import com.redoyahmed.androiddi.di.NetworksModule;
import com.redoyahmed.androiddi.utils.Helper;

public class DIApplication extends Application {

    private NetworkComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent = DaggerNetworkComponent.builder()
                .networksModule(new NetworksModule(Helper.URL))
                .build();
    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }
}
