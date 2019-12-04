package com.example.despensappapplication.ui.inventory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InventoryViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Fragmento: Inventario de productos");
    }

    public LiveData<String> getText(){
        return mText;
    }
}
