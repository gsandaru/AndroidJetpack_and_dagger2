package gihansandaru.dev.testdaggersample;

import java.util.List;

import dagger.Provides;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("todos/1")
    Call<Todo> todoList();
}
