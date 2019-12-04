package com.example.despensappapplication.ui.inventory;

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

public class InventoryFragment extends Fragment {

    private InventoryViewModel inventoryViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        inventoryViewModel = ViewModelProviders.of(this).get(InventoryViewModel.class);
        View root = inflater.inflate(R.layout.inventory_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_inventory);
        inventoryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
