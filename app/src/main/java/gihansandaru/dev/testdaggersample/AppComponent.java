package gihansandaru.dev.testdaggersample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RefrigeratorModule.class)
public interface AppComponant {
    void inject(MainActivity mainActivity);
    void inject(HomeFragment homeFragment);
}


