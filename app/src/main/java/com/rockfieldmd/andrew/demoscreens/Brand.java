package com.rockfieldmd.andrew.demoscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Brand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        Button btn9=(Button)findViewById(R.id.abbott);
        Button btn10=(Button)findViewById(R.id.fk);
        Button btn11=(Button)findViewById(R.id.nutricia);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brand.this, Abbott.class));
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brand.this, FreseniusKabi.class));
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Brand.this, Nutricia.class));
            }
        });


    }
}
