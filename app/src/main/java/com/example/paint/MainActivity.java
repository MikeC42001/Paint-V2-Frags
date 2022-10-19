package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.paint.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView, BlankFragment.class, null)
                    .commit();
        }
        setContentView(R.layout.activity_paint_main);
        setBackGroundColor(this.getCurrentFocus());

    }

    /** Called when the user taps the Send button */
    public void sendToAbout(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void sendToSettings(View view) {
        Intent intent = new Intent(this, ColorInsertActivity.class);
        startActivity(intent);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }

    @SuppressLint("ResourceAsColor")
    public void setBackGroundColor(View view) {

        int message = -1;

        // Get the Intent that started this activity and extract the string
        try {
            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_MESSAGE)) {
                message = intent.getIntExtra(EXTRA_MESSAGE, -1);
                Log.d(TAG, "setBackGroundColor: " + message);
                view = this.getWindow().getDecorView();
                view.setBackgroundColor(message);
            }
        } catch (Exception e) {
            System.out.println(message);
            view = this.getWindow().getDecorView();
            view.setBackgroundColor(R.color.black); //Integer.parseInt(message)
        }
/*        if (message != -1) {
            view = this.getWindow().getDecorView();
            view.setBackgroundColor(R.color.black); //Integer.parseInt(message)
        }*/
    }
}