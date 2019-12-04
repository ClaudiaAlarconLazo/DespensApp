package com.example.despensappapplication.ui.start;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StartViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> text;


    public StartViewModel() {
        mText = new MutableLiveData<>();
        text = new MutableLiveData<>();
        mText.setValue("Fragmento: Inicio");
        text.setValue("Inicio2");
    }

    public LiveData<String> getText(){
        return mText;
    }
    public LiveData<String> getText2(){ return text; }



}
