package com.example.paint;

import static android.graphics.Color.parseColor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ColorInsertActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.paint.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_insert);
    }

    @SuppressLint("ResourceAsColor")
    public void setMainBackgroundColor(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonColor);
        int message = parseColor(editText.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}