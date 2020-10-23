package com.example.map.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Thiagarajar college of engineering-where qualtiy and ethics matter");
    }

    public LiveData<String> getText() {
        return mText;
    }
}