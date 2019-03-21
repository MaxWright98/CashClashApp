package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAbout(View v) {
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }

    public void openFAQ (View v) {
        startActivity(new Intent(MainActivity.this, ActivityFAQ.class));
    }

    public void openFunction (View v){
        startActivity(new Intent(MainActivity.this, FunctionPageActivity.class));
    }

}
