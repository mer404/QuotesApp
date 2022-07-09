package com.example.myquotes;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.MyViewHolder> {
    ArrayList<ModelClassQuotes> myQuotes;

    public QuotesAdapter(ArrayList<ModelClassQuotes> myQuotes) {
        this.myQuotes = myQuotes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_activity, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.quotestxt.setText(myQuotes.get(position).getQuotes());
    }

    @Override
    public int getItemCount() {
        return myQuotes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView quotestxt;
        ImageView copybtn,sharebtn,savebtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            quotestxt = itemView.findViewById(R.id.quotestxt);
        }
    }
}
