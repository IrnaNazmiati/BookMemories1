package com.example.irna.bookmemories;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL="https://script.google.com/macros/s/AKfycbyTvUiU57D8D-vujL6K3Qsc0bT3x9--u8Pq1vx-oPet2FrsGck/";
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
