package com.example.lab1ofmobiledevelopment;

        import android.view.View;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class ProvinceHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView provinceName;
    public ProvinceHolder(View view) {
        super(view);
        provinceName=(TextView)view.findViewById(R.id.provinceName);

    }

}
