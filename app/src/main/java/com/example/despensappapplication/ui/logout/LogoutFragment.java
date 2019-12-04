package com.example.despensappapplication.ui.logout;

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

public class LogoutFragment extends Fragment {

    private LogoutViewModel logoutViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        logoutViewModel = ViewModelProviders.of(this).get(LogoutViewModel.class);
        View root = inflater.inflate(R.layout.logout_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_logout);
        logoutViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }
    
}
