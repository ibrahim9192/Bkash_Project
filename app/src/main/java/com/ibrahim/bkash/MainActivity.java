package com.ibrahim.bkash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout Taka_Box;
    LinearLayout Taka_Box_Gone, More_Id;
    TextView Text_View;
    ImageView Scaner_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Taka_Box = findViewById(R.id.taka_box);
        Taka_Box_Gone = findViewById(R.id.taka_box_gone);
        Text_View = findViewById(R.id.tex_view);
        More_Id = findViewById(R.id.more_id);
        Scaner_Id = findViewById(R.id.scanner_id);

        Taka_Box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Taka_Box_Gone.setVisibility(View.GONE);
            Text_View.setText("0.00");

            }

        });

        More_Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moreIntent = new Intent(MainActivity.this, MoreActivity.class);
                startActivity(moreIntent);
            }
        });

        Scaner_Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Comming Soon", Toast.LENGTH_LONG).show();
            }
        });







    }
}