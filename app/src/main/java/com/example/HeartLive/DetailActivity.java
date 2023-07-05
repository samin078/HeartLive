package com.example.HeartLive;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView detaildia,detailsys,detailhrt,detailtm,detaildt,detailcm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detaildia=findViewById(R.id.dias);
        detailsys=findViewById(R.id.sys);
        detailhrt=findViewById(R.id.heart);
        detailtm=findViewById(R.id.time);
        detaildt=findViewById(R.id.date);
        detailcm=findViewById(R.id.comment);


        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            detaildia.setText("Diastolic: " + bundle.getString("Diastolic"));
            detailsys.setText("Systolic: " + bundle.getString("Systolic"));
            detailhrt.setText("Heart Rate: " + bundle.getString("HeartRate"));
            detailtm.setText("Time: " + bundle.getString("Time"));
            detaildt.setText("Date: " + bundle.getString("Date"));
            detailcm.setText("Comment: " + bundle.getString("Comment"));


        }
    }
}