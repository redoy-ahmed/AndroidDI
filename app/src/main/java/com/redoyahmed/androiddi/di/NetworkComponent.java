package com.redoyahmed.androiddi.di;

import com.redoyahmed.androiddi.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworksModule.class})
public interface NetworkComponent {
    void inject(MainActivity activity);
}
