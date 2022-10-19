package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
//import top.defaults.colorpicker.ColorPickerPopup;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //this.getWindow().getDecorView().setBackgroundColor(R.color.teal_200);
        setBackGroundColor(this.getCurrentFocus());


    }

    /** Called when the user taps the Send button */
    public void sendToMain(View view) {
        Intent intent = new Intent(this, PaintMainActivity.class);
        startActivity(intent);
    }

    @SuppressLint("ResourceAsColor")
    public void setBackGroundColor(View view) {

        String message = null;

        // Get the Intent that started this activity and extract the string
        try {
            Intent intent = getIntent();
            message = intent.getStringExtra(ColorInsertActivity.EXTRA_MESSAGE);
            Log.d(TAG, "setBackGroundColor: " + message);
        } catch (Exception e) {
            System.out.println(message);
            view = this.getWindow().getDecorView();
            view.setBackgroundColor(R.color.white); //Integer.parseInt(message)
        }
        if (message != null) {
            view = this.getWindow().getDecorView();
            view.setBackgroundColor(R.color.black); //Integer.parseInt(message)
        }
    }
}