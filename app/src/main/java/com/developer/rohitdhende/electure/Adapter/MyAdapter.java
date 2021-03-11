package com.developer.rohitdhende.electure.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.rohitdhende.electure.MyHolder;
import com.developer.rohitdhende.electure.R;
import com.developer.rohitdhende.electure.model.Model;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private static final String TAG = "MyActivity";

    private ArrayList<Model> models;
    private OnClickListener callbackListener;



    public interface OnClickListener {
        void onClick(Model clickedModel);
    }



    public MyAdapter(ArrayList<Model> models, OnClickListener listener) {
        this.models = (models != null) ? models: new ArrayList<Model>();
        this.callbackListener = listener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subject_row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {
        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mDes.setText(models.get(i).getDescription());
        myHolder.mImageView.setImageResource(models.get(i).getImg());

        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callbackListener.onClick(models.get(myHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
