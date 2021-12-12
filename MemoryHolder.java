package com.example.lab1ofmobiledevelopment;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class MemoryHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView provinceName;
    public TextView memory;
    public MemoryHolder(View view) {
        super(view);
        provinceName=(TextView)view.findViewById(R.id.provinceN);
        memory = (TextView) view.findViewById(R.id.memoryF);

    }

}
