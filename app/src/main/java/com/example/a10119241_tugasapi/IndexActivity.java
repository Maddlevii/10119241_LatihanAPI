package com.example.a10119241_tugasapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        button= findViewById(R.id.btn_mulai);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(IndexActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}