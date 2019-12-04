package com.example.despensappapplication.ui.start;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.despensappapplication.R;

public class StartFragment extends Fragment {

    private StartViewModel startViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        startViewModel = ViewModelProviders.of(this).get(StartViewModel.class);
        View root = inflater.inflate(R.layout.start_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_setting);

        startViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);

            }
        });
        return root;
    }

}
