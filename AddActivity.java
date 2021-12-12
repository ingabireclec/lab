package com.example.lab1ofmobiledevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.Map;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Intent intent = getIntent();

        Province province =(Province) intent.getSerializableExtra("selectedProvince");

        DatabaseHandler dbHandler = new DatabaseHandler(this);
        Button send = findViewById(R.id.saveB);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInputEditText memoryF = findViewById(R.id.memoryField);

                Memory memory = new Memory(memoryF.getText().toString(), province.getName());
               dbHandler.addMemory(memory);

               Intent intent1 = new Intent(AddActivity.this, MemoriesActivity.class);
               startActivity(intent1);
            }
        });
    }



}