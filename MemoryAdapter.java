package com.example.lab1ofmobiledevelopment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MemoryAdapter extends RecyclerView.Adapter<MemoryHolder> {
    private List<Food> foodList;
    View view;

    View.OnClickListener listener;

    public MemoryAdapter(List<Food> foodList){
        this.foodList=foodList;
    }
    public MemoryAdapter(List<Food> foodList,View.OnClickListener listener){
        this.foodList=foodList;
        this.listener = listener;
    }

    @Override
    public MemoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.memory_row ,parent,false);
        view.setOnClickListener(listener);
        return new MemoryHolder(view);
    }

    @Override
    public void onBindViewHolder(MemoryHolder holder, int position) {
        Food food=foodList.get(position);
        holder.provinceName.setText(food.getProvince().getName());
        holder.memory.setText(food.getMemory());
        view.setTag(food);

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
