package com.example.meishvili.revaz.myfinalprojectapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import pojos.products.deposits.Deposit;
import retrofit.Api;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpClient.Builder okClient = new OkHttpClient.Builder();

        okClient.addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {

                Request request = chain.request();
                request

                return null;
            }
        })

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.fintech.ge/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okClient)
                .build();

        Api api = retrofit.create(Api.class);

        api.getDeposits("sss").enqueue(new Callback<List<Deposit>>() {
            @Override
            public void onResponse(Call<List<Deposit>> call, Response<List<Deposit>> response) {
                Log.i("Assert",response.body().toString());
            }

            @Override
            public void onFailure(Call<List<Deposit>> call, Throwable t) {

            }
        });

    }
}
