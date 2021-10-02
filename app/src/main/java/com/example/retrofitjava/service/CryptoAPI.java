package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=8876db239510783bba108c885fd24ca9ebf7364f")
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();
}
