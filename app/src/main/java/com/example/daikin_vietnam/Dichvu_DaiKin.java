package com.example.daikin_vietnam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dichvu_DaiKin extends AppCompatActivity {

    Button yeucau_151, huy_151;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dichvu_daikin);
        yeucau_151 = findViewById(R.id.yeucau_151);
        yeucau_151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dichvu_DaiKin.this, MainActivity.class);
                startActivity(intent);
            }
        });
        huy_151 = findViewById(R.id.huy_151);
        huy_151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dichvu_DaiKin.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

