package com.example.slide_animation_between_activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View v)
    {
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
      //  overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}
