package com.example.myquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.example.myquotes.MainActivity;
import com.example.myquotes.R;

public class SplashScreenActivity extends AppCompatActivity {
    LottieAnimationView animation_view;
    private static int SPLASH_SCREEN_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        initView();
    }

    private void initView() {
        animation_view = findViewById(R.id.animation_view);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                finish();
                startActivity(i);
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}