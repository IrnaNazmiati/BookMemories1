package com.example.irna.bookmemories;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {
    private ApiInterface apiInterface;
    private Member member;
    private Kenangan kenangan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new AmbilData().execute();
    }

    private class AmbilData extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
            Call<Kenangan> call = apiInterface.getKenangan();
            call.enqueue(new Callback<Kenangan>() {
                @Override
                public void onResponse(Call<Kenangan> call, Response<Kenangan> response) {
                    kenangan = response.body();
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    intent.putExtra("datanya", (Serializable) kenangan);
                    startActivity(intent);
                    finish();
                }

                @Override
                public void onFailure(Call<Kenangan> call, Throwable t) {

                }

            });
            return null;
        }
    }
}