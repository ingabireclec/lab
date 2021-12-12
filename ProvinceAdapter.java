package com.example.lab1ofmobiledevelopment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProvinceAdapter extends RecyclerView.Adapter<ProvinceHolder> {
    private List<Province> contactList;
    View view;

    View.OnClickListener listener;

    public ProvinceAdapter(List<Province> contactList){
        this.contactList=contactList;
    }
    public ProvinceAdapter(List<Province> contactList,View.OnClickListener listener){
        this.contactList=contactList;
        this.listener = listener;
    }

    @Override
    public ProvinceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.province_row ,parent,false);
        view.setOnClickListener(listener);
        return new ProvinceHolder(view);
    }

    @Override
    public void onBindViewHolder(ProvinceHolder holder, int position) {
        Province province=contactList.get(position);
        holder.provinceName.setText(province.getName());
        view.setTag(province);

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
