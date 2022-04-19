package in.premad.mvvmjava.Services;


import in.premad.mvvmjava.Response.GetPlansResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {

    @GET("getPlans")
    Call<GetPlansResponse> getPlans();



}