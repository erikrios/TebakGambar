package com.erikriosetiawan.tebakgambar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewLine, imageViewWhatsApp, imageViewSnapchat, imageViewTwitter, imageViewInstagram, imageViewYoutube;
    public static final String KEY_ICON_NAME = "nama_icon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickIcon();
    }

    private void setInisialisasi() {
        imageViewLine = findViewById(R.id.imageView_line);
        imageViewWhatsApp = findViewById(R.id.imageView_whatsapp);
        imageViewSnapchat = findViewById(R.id.imageView_snapchat);
        imageViewTwitter = findViewById(R.id.imageView_twitter);
        imageViewInstagram = findViewById(R.id.imageView_instagram);
        imageViewYoutube = findViewById(R.id.imageView_youtube);
    }

    private void onClickIcon() {

        imageViewLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lineSendIntent = new Intent(MainActivity.this, TebakActivity.class);
                lineSendIntent.putExtra(KEY_ICON_NAME, "Line");
                startActivity(lineSendIntent);
            }
        });

        imageViewWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent whatsAppSendIntent = new Intent(MainActivity.this, TebakActivity.class);
                whatsAppSendIntent.putExtra(KEY_ICON_NAME, "WhatsApp");
                startActivity(whatsAppSendIntent);
            }
        });

        imageViewSnapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent snapchatSendIntent = new Intent(MainActivity.this, TebakActivity.class);
                snapchatSendIntent.putExtra(KEY_ICON_NAME, "Snapchat");
                startActivity(snapchatSendIntent);
            }
        });

        imageViewTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent twitterSendIntent = new Intent(MainActivity.this, TebakActivity.class);
                twitterSendIntent.putExtra(KEY_ICON_NAME, "Twitter");
                startActivity(twitterSendIntent);
            }
        });

        imageViewInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent instagramSendIntent = new Intent(MainActivity.this, TebakActivity.class);
                instagramSendIntent.putExtra(KEY_ICON_NAME, "Instagram");
                startActivity(instagramSendIntent);
            }
        });

        imageViewYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent youtubeSendIntent = new Intent(MainActivity.this, TebakActivity.class);
                youtubeSendIntent.putExtra(KEY_ICON_NAME, "YouTube");
                startActivity(youtubeSendIntent);
            }
        });
    }
}
