package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityGestureEvent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText edt = findViewById(R.id.edt);
        final EditText edt1 = findViewById(R.id.edt1);
        final EditText edt2 = findViewById(R.id.edt2);
        final EditText edt3 = findViewById(R.id.edt3);
        final EditText edt4 = findViewById(R.id.edt4);

        ImageButton p = findViewById(R.id.imageButton);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                String edtt = edt.getText().toString();
                String edtt1 = edt1.getText().toString();
                String edtt2 = edt2.getText().toString();
                String edtt3 = edt3.getText().toString();
                String edtt4 = edt4.getText().toString();

                if (edtt.equals("")||edtt1.equals("")||edtt2.equals("")||edtt3.equals("")||edtt4.equals("")){
       Toast.makeText(MainActivity2.this , "Error (140) Complete the CV" , Toast.LENGTH_LONG).show();
                }else {
                     i.putExtra("Name",edtt);
                     i.putExtra("Age",edtt1);
                     i.putExtra("Job",edtt2);
                     i.putExtra("email",edtt3);
                     i.putExtra("num",edtt4);
                    startActivity(i);
                }
            }
        });
    }
}