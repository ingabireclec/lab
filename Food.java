package com.example.lab1ofmobiledevelopment;

import android.util.Log;

public class Food {
    String foodId;
    String label;
    String category;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void print(){
        Log.d("Tag",getCategory() +" "+ getFoodId()+" "+getFoodId());
    }
}
