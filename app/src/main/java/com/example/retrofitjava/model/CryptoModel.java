package com.example.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    private String currency;

    @SerializedName("price")
    private String price;

    public CryptoModel(String currency, String price) {
        this.currency = currency;
        this.price = price;
    }

    public CryptoModel() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
