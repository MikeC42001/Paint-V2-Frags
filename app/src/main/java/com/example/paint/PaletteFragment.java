package com.example.paint;

import static android.graphics.Color.parseColor;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class PaletteFragment extends Fragment {

    public static final String EXTRA_MESSAGE = "com.example.paint.MESSAGE";

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        /*GestureListener mGestureListener = new GestureListener();
        GestureDetector mGestureDetector = new GestureDetector(getApplicationContext(), mGestureListener);
        mGestureDetector.setIsLongpressEnabled(true);
        mGestureDetector.setOnDoubleTapListener(mGestureListener);

        PaintCanvas paintCanvas = new PaintCanvas(getApplicationContext(), null, mGestureDetector);
        mGestureListener.setCanvas(paintCanvas);

        setContentView(paintCanvas);*/

        return inflater.inflate(R.layout.fragment_palette, container, false);
    }

    @SuppressLint("ResourceAsColor")
    public void setMainColor(View view) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        EditText editText = (EditText) view.findViewById(R.id.password);
        int message = parseColor(editText.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}