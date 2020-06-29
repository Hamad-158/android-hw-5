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
                 Intent w = new Intent(Intent.ACTION_VIEW);
                w.setData(Uri.parse(""));
                Intent n = new Intent(Intent.ACTION_DIAL);
                n.setData(Uri.parse(""));
                    i.putExtra("Name",edt.getText().toString());
                    startActivity(i);
                     i.putExtra("Age",edt1.getText().toString());
                    startActivity(i);
                     i.putExtra("Job",edt2.getText().toString());
                    startActivity(i);
                     w.putExtra("email",edt3.getText().toString());
                    startActivity(w);
                     n.putExtra("num",edt4.getText().toString());
                    startActivity(n);
            }
        });
    }
}