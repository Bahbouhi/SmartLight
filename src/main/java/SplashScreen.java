package com.example.bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen s = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.BLACK)
                .withFooterText("ILISI 2020 ©")
                .withLogo(R.drawable.aveclogo);
        s.getFooterTextView().setTextColor(Color.YELLOW);
        View es = s.create();
        setContentView(es);
    }
}
