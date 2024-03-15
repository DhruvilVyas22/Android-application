package com.women_safety;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yellowButton = findViewById(R.id.button2);
        yellowButton.setBackgroundColor(Color.YELLOW);

        Button redButton = findViewById(R.id.button3);
        redButton.setBackgroundColor(Color.RED);
    }

    public void yellowButtonPressed(View view) {
        Intent intent = new Intent(this, Yellow.class);
        startActivity(intent);
    }

    public void redButtonPressed(View view) {
        Intent intent = new Intent(this, Red.class);
        startActivity(intent);
    }
}
