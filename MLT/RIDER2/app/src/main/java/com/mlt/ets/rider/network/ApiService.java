package com.mlt.ets.rider.network;


import com.mlt.ets.rider.models.Booking;

import org.json.JSONObject;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    // POST request for user sign-up
    @POST("api/user-registration")
    Call<ResponseBody> signUpUser(@Body RequestBody requestBody);

    @POST("/api/user-login")
    Call<ResponseBody> loginUser(@Body RequestBody requestBody);

    @POST("api/book-now")
    Call<ResponseBody> bookNow(@Body RequestBody requestBody);

    @GET("path/to/your/booking/history") // Replace with your actual endpoint
    Call<List<Booking>> getBookingHistory();
}

