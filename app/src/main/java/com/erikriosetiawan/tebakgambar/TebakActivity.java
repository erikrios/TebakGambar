package com.erikriosetiawan.tebakgambar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {

    ImageView imageViewTebak;
    EditText editTextJawab;
    Button buttonCek;
    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInisialisasi();
        cekJawaban();
        onClickCheckButton();
    }

    private void setInisialisasi() {

        imageViewTebak = findViewById(R.id.imageView_tebak);
        editTextJawab = findViewById(R.id.editText_jawab);
        buttonCek = findViewById(R.id.button_cek);
    }

    private void cekJawaban() {

        Intent receiveIntent = getIntent();
        String namaIcon = receiveIntent.getStringExtra(MainActivity.KEY_ICON_NAME);
        if (namaIcon.equalsIgnoreCase("Line")) {
            imageViewTebak.setImageResource(R.drawable.line);
            jawaban = "Line";
        } else if (namaIcon.equalsIgnoreCase("WhatsApp")) {
            imageViewTebak.setImageResource(R.drawable.whatsapp);
            jawaban = "WhatsApp";
        } else if (namaIcon.equalsIgnoreCase("Snapchat")) {
            imageViewTebak.setImageResource(R.drawable.snapchat);
            jawaban = "Snapchat";
        } else if (namaIcon.equalsIgnoreCase("Twitter")) {
            imageViewTebak.setImageResource(R.drawable.twitter);
            jawaban = "Twitter";
        } else if (namaIcon.equalsIgnoreCase("Instagram")) {
            imageViewTebak.setImageResource(R.drawable.instagram);
            jawaban = "Instagram";
        } else if (namaIcon.equalsIgnoreCase("YouTube")) {
            imageViewTebak.setImageResource(R.drawable.youtube);
            jawaban = "YouTube";
        }
    }

    private void onClickCheckButton() {

        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextJawab.getText().toString().equalsIgnoreCase(jawaban)) {
                    Toast.makeText(TebakActivity.this, "Jawaban Anda Benar", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(TebakActivity.this, "Jawaban Anda Salah!", Toast.LENGTH_LONG).show();
                    Toast toast = new Toast(TebakActivity.this);
                }
            }
        });
    }
}
