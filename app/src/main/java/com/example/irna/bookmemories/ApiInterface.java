package com.example.irna.bookmemories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("exec")
    Call<Kenangan> getKenangan();
}
