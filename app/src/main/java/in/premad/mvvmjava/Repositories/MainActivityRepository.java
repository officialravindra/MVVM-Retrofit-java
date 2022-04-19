package in.premad.mvvmjava.Repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import in.premad.mvvmjava.Response.GetPlansResponse;
import in.premad.mvvmjava.Services.ApiRequest;
import in.premad.mvvmjava.Services.RetrofitRequest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



import android.util.Log;


public class MainActivityRepository {
    private static final String TAG = MainActivityRepository.class.getSimpleName();
    private ApiRequest apiRequest;

    public MainActivityRepository() {
        apiRequest = RetrofitRequest.getRetrofitInstance().create(ApiRequest.class);
    }

    public LiveData<GetPlansResponse> getPlans() {
        final MutableLiveData<GetPlansResponse> data = new MutableLiveData<>();
        apiRequest.getPlans()
                .enqueue(new Callback<GetPlansResponse>() {
                    @Override
                    public void onResponse(Call<GetPlansResponse> call, Response<GetPlansResponse> response) {
                        if(response.body()!=null)
                        {
                            data.postValue(response.body());

                            Log.d(TAG, "result message :: " + response.body().getMessage());


                        }
                    }

                    @Override
                    public void onFailure(Call<GetPlansResponse> call, Throwable t) {
                        data.setValue(null);
                    }
                });


        return data;
    }
}
