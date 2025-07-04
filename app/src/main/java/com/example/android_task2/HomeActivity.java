package com.example.android_task2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    Button buttonAndroid, buttonIos, buttonFullstack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonAndroid = findViewById(R.id.android_course_button);
        buttonIos = findViewById(R.id.ios_course_button);
        buttonFullstack = findViewById(R.id.fullstack_course_button);
        buttonAndroid.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, AndroidScreen.class);
            startActivity(intent);
        });

        buttonIos.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, Ios_screen.class);
            startActivity(intent);
        });

        buttonFullstack.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, FullstackScreen.class);
            startActivity(intent);
        });
    }
}