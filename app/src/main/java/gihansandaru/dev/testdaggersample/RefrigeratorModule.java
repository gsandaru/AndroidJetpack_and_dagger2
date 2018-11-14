package gihansandaru.dev.testdaggersample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RefrigeratorModule {

    String BASE_URL = "https://jsonplaceholder.typicode.com/";

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

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

    @Provides
    APIService providesAPIService(Retrofit retrofit){
        return retrofit.create(APIService.class);
    }


}


