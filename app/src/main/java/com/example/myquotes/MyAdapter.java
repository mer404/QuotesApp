package com.example.myquotes;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<ModelClass> CategoriesImage;
    MyClickInterface myClickInterface;

    public MyAdapter(ArrayList<ModelClass> CategoriesImage, MyClickInterface myClickInterface) {
        this.CategoriesImage = CategoriesImage;
        this.myClickInterface=myClickInterface;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_main_item, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.CategoriesImage.setImageResource(CategoriesImage.get(position).getCategoriesImage());
        holder.txtCategoriesName.setText(CategoriesImage.get(position).getCategoriesName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClickInterface.onClick(CategoriesImage.get(position).getCategoriesImage(),CategoriesImage.get(position).getCategoriesName());
            }
        });
    }

    @Override
    public int getItemCount() {
        return CategoriesImage.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView CategoriesImage;
        TextView txtCategoriesName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            CategoriesImage = itemView.findViewById(R.id.image);
            txtCategoriesName = itemView.findViewById(R.id.quote_catetxt);
        }
    }
}
