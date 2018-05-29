package com.rockfieldmd.andrew.demoscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Nutricia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricia);

        Button btn18=(Button)findViewById(R.id.button18);
        Button btn19=(Button)findViewById(R.id.button19);
        Button btn20=(Button)findViewById(R.id.button20);
        Button btn21=(Button)findViewById(R.id.button21);

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Nutricia.this, Finish.class));
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Nutricia.this, Finish.class));
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Nutricia.this, Finish.class));
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Nutricia.this, Finish.class));
            }
        });
    }
}
