package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=8876db239510783bba108c885fd24ca9ebf7364f")
    Call<List<CryptoModel>> getData();
}
