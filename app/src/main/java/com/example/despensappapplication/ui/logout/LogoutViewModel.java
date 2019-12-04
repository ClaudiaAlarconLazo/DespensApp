package com.example.despensappapplication.ui.logout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LogoutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LogoutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragmento: Salir de la Aplicación");
    }

    public LiveData<String> getText(){
        return mText;
    }

}
