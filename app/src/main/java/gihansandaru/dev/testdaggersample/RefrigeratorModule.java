package gihansandaru.dev.testdaggersample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RefrigeratorModule {

    public RefrigeratorModule() {
    }

    @Provides
    String provideEggs(){
        return "Two Eggs";
    }

    @Singleton
    @Provides
    UserViewModel providesUserViewModel(){
        return new UserViewModel();
    }


}


