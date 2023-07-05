package com.example.HeartLive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity2 extends AppCompatActivity {
    private CardView shw;
    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        shw=findViewById(R.id.show);
        btn=findViewById(R.id.imageButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        });



        shw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }

    private void show() {
        Intent i = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(i);
        finish();
    }



}