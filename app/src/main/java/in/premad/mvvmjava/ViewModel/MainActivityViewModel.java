package in.premad.mvvmjava.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import in.premad.mvvmjava.Repositories.MainActivityRepository;
import in.premad.mvvmjava.Response.GetPlansResponse;


public class MainActivityViewModel extends AndroidViewModel {

    private MainActivityRepository mainActivityRepository;
    private LiveData<GetPlansResponse> getPlansResponseLiveData;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        mainActivityRepository = new MainActivityRepository();
        this.getPlansResponseLiveData = mainActivityRepository.getPlans();
    }

    public LiveData<GetPlansResponse> getPlansResponseLiveData() {
        return getPlansResponseLiveData;
    }
}