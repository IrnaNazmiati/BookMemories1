package com.example.irna.bookmemories;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientLog {
    public static final String BASE_URL="https://script.google.com/macros/s/AKfycbyNJOxu4HluPtfwKRdVC5c7wGpkjO1z2odYBlnsZQrrk3pcmdk/";
    public static Retrofit retrofit;
    public static Retrofit getApiClient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
