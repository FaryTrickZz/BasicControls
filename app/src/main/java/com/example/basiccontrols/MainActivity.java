package com.example.basiccontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Load animation + settings
        Animation myAnimation = AnimationUtils.loadAnimation(this, R.anim.translada_cambiocolor);
        myAnimation.setRepeatCount(Animation.RESTART);
    }


}
