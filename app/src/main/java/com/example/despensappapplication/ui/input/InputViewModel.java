package com.example.despensappapplication.ui.input;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InputViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InputViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragmento: Ingreso de productos");
    }

    public LiveData<String> getText(){
        return mText;
    }
}
