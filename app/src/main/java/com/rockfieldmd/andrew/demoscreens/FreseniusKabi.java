package com.rockfieldmd.andrew.demoscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FreseniusKabi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresenius_kabi);

        Button btn15=(Button)findViewById(R.id.button15);
        Button btn16=(Button)findViewById(R.id.button16);
        Button btn17=(Button)findViewById(R.id.button17);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FreseniusKabi.this, Finish.class));
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FreseniusKabi.this, Finish.class));
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FreseniusKabi.this, Finish.class));
            }
        });
    }
}
