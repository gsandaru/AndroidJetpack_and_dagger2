package gihansandaru.dev.testdaggersample;

import android.app.Application;

public class EggApplication extends Application {

    private AppComponant appComponant;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponant = DaggerAppComponant.builder()
                .refrigeratorModule(new RefrigeratorModule())
                .build();

    }

    public AppComponant getAppComponant() {
        return appComponant;
    }
}
