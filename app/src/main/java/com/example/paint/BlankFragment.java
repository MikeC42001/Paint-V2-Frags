package com.example.paint;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

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

        return inflater.inflate(R.layout.fragment_blank, container, false);
    }


}