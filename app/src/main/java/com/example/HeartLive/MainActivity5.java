package com.example.HeartLive;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity5 extends AppCompatActivity {
    EditText heart,sys,dias,date,time,comm;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        heart = findViewById(R.id.editTextTextPersonName6);
        sys= findViewById(R.id.editTextTextPersonName5);
        dias= findViewById(R.id.editTextTextPersonName4);
        date= findViewById(R.id.editTextDate);
        time= findViewById(R.id.editTextTime);
        comm=findViewById(R.id.editTextTextPersonName7);

        btn = findViewById(R.id.btn_update);


btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        saveData();
    }
});

    }
    public void saveData() {
        Boolean er=false;
        String diastolicTXT, systolicTXT, heartTXT, timeTXT, dateTXT, comTXT;


        diastolicTXT = dias.getText().toString();
        systolicTXT = sys.getText().toString();
        heartTXT = heart.getText().toString();
        timeTXT = time.getText().toString();
        dateTXT = date.getText().toString();
        comTXT = comm.getText().toString();
        if (heartTXT.isEmpty()) {
            heart.setError("Required");
            er = true;
        } else if (Integer.parseInt(heartTXT) < 30) {
            heart.setError("Minimum Value is 30");
            er = true;
        } else if (Integer.parseInt(heartTXT) > 120) {
            heart.setError("Maximum Value is 120");
            er = true;
        }

        if (systolicTXT.isEmpty()) {
            sys.setError("Required");
            er = true;
        } else if (Integer.parseInt(systolicTXT) < 60) {
            sys.setError("Minimum Value is 60");
            er = true;

        } else if (Integer.parseInt(systolicTXT) > 150) {
            sys.setError("Maximum Value is 150");
            er = true;
        }


        if (dias.getText().toString().isEmpty()) {
            dias.setError("Required");
            er = true;
        } else if (Integer.parseInt(diastolicTXT) < 100) {
            dias.setError("Minimum Value is 100");
            er = true;
        } else if (Integer.parseInt(diastolicTXT) > 200) {
            dias.setError("Maximum Value is 200");
            er = true;
        }


        if (!er) {
            DataClass dataClass = new DataClass(diastolicTXT, systolicTXT, heartTXT, timeTXT, dateTXT, comTXT);

            FirebaseDatabase.getInstance().getReference("Insert").child(diastolicTXT).setValue(dataClass).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(MainActivity5.this, "New measurements are inserted", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity5.this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}