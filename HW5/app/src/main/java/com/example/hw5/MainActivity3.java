package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Bundle c = getIntent().getExtras();
        final TextView num = findViewById(R.id.num);
        num.setText(c.getString("num"));
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+c.getString("num")));
                startActivity(intent);
            }
        });
        TextView email = findViewById(R.id.textView1);
        email.setText(c.getString("email"));
        (findViewById(R.id.textView1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.Gmail.com/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        TextView job = findViewById(R.id.job);
        job.setText(c.getString("Job"));
        TextView Age = findViewById(R.id.age);
        Age.setText(c.getString("Age"));
        TextView Name = findViewById(R.id.Name1);
        Name.setText(c.getString("Name"));


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