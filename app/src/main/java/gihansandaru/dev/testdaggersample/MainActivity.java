package gihansandaru.dev.testdaggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.Console;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    String eggs;

    @Inject
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((EggApplication) getApplication()).getAppComponant().inject(this);
        Log.d(TAG, "onCreate: "+ eggs);

        Log.d(TAG, "onCreate: " + userViewModel.getUserData());
    }
}
