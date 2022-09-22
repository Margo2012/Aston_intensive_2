package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void startHelloToast(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startTextScrolling(View view) {
        Intent intent = new Intent(this, TextScrollingActivity.class);
        startActivity(intent);
    }

    public void startImplicitIntents(View view) {
        Intent intent = new Intent(this, ImplicitIntentsActivity.class);
        startActivity(intent);
    }
}