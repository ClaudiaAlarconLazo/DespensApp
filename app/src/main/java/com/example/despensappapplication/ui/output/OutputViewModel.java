package com.example.despensappapplication.ui.output;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OutputViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OutputViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragmento: Egreso de productos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}