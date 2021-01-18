package com.example.animatedvector;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView checking;
    FrameLayout background;

    AnimatedVectorDrawable avd;
    AnimatedVectorDrawableCompat avd_compat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (FrameLayout) findViewById(R.id.background);

        checking = (ImageView)findViewById(R.id.checking);


        background.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Drawable drawable = checking.getDrawable();
                if(drawable instanceof  AnimatedVectorDrawableCompat)
                {
                    Toast.makeText(MainActivity.this,"1", Toast.LENGTH_SHORT).show();
                    avd_compat = (AnimatedVectorDrawableCompat)drawable;
                    avd_compat.start();
                }
                else if (drawable instanceof  AnimatedVectorDrawable)
                {

                    avd = (AnimatedVectorDrawable)drawable;
                    avd.start();
                }

            }
        });

    }
}
