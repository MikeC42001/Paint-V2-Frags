package com.example.paint.ui.login;

import static android.graphics.Color.parseColor;

import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.paint.BlankFragment;
import com.example.paint.MainActivity;
import com.example.paint.databinding.FragmentPaletteBinding;

import com.example.paint.R;

public class PaletteFragment extends Fragment {

    public static PaletteFragment newInstance() {
        return new PaletteFragment();
    }

    private FragmentPaletteBinding binding;
    public static final String EXTRA_MESSAGE = "com.example.paint.MESSAGE";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentPaletteBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @SuppressLint("ResourceAsColor")
    public void setMainColor(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) view.findViewById(R.id.password);
        int message = parseColor(editText.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}