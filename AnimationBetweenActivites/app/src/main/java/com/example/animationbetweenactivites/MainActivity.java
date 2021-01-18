package com.example.animationbetweenactivites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {



    FrameLayout frameLayout;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        cardView = (CardView)findViewById(R.id.profile_cv) ;


        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View,String>(cardView,"profileTransition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);

                startActivity(i,options.toBundle());
            }
        });
    }
}
