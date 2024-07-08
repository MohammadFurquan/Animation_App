package com.example.soundcloud;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView alien;
    MediaPlayer playSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void animate (View view) {

        alien = findViewById(R.id.alienImage);
        playSound = MediaPlayer.create(getApplicationContext(),R.raw.aliensound);

        alien.animate().translationYBy(-2000).rotationYBy(3600).scaleYBy(-0.7f).scaleXBy(-0.7f).alpha(0.3f).setDuration(5000);

        playSound.start();

    }
}