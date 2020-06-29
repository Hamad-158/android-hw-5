package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView num = findViewById(R.id.num);
        TextView email = findViewById(R.id.email);
        TextView job = findViewById(R.id.job);
        TextView Age = findViewById(R.id.age);
        TextView Name = findViewById(R.id.Name1);
        Bundle c = getIntent().getExtras();
        Name.setText(c.getString("Name"));
        Age.setText(c.getString("Age"));
        job.setText(c.getString("Job"));
        email.setText(c.getString("email"));
        num.setText(c.getString("num"));


        ImageButton button = findViewById(R.id.imageButton3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(i);

            }
        });
    }
}