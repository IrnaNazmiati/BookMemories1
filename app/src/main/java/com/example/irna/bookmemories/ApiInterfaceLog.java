package com.example.irna.bookmemories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterfaceLog {
    @GET("exec")
    Call<List<Login>> getLogin (@Query("username") String username);

}
