package com.example.slide_animation_between_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    public void finish()
    {
        super.finish();
       // overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

    }
}