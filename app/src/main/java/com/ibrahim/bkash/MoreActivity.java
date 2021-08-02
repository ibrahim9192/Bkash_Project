package com.ibrahim.bkash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MoreActivity extends AppCompatActivity {
    ImageView Back_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        Back_Button = findViewById(R.id.back_button);

        Back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(MoreActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}