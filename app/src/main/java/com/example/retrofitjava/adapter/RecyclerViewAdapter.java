package com.example.retrofitjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitjava.databinding.RowLayoutBinding;
import com.example.retrofitjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private ArrayList<CryptoModel> cryptoList;

    private String[] colors = {"#2874A6","#5B2C6F","#B03A2E","#935116"," #2E4053","#3498DB"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowLayoutBinding rowLayoutBinding = RowLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new RowHolder(rowLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {

        RowLayoutBinding rowLayoutBinding;

        public RowHolder(@NonNull RowLayoutBinding rowLayoutBinding) {
            super(rowLayoutBinding.getRoot());
            this.rowLayoutBinding = rowLayoutBinding;
        }

        public void bind(CryptoModel cryptoModel,String[] colors,Integer position){

            itemView.setBackgroundColor(Color.parseColor(colors[position % 4]));
            rowLayoutBinding.textName.setText(cryptoModel.getCurrency());
            rowLayoutBinding.textPrice.setText(cryptoModel.getPrice());
        }
    }
}
