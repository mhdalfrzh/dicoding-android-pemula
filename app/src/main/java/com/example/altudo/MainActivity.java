package com.example.altudo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CardView bodoamatid;
    CardView bumimanusia;
    CardView negerimenara;
    CardView laskarpelangi;
    CardView sangpemimpi;
    CardView dilan;
    CardView limacm;
    CardView daunjatuh;
    CardView searching;
    CardView great;
    CardView powerhabit;
    CardView tentangkamu;
    CardView gariswaktu;
    CardView anakkuat;
    CardView filosofiteras;
    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        bodoamatid = findViewById(R.id.bodoamatid);
        bumimanusia = findViewById(R.id.bumimanusia);
        negerimenara = findViewById(R.id.negerimenara);
        laskarpelangi = findViewById(R.id.laskarpelangi);
        sangpemimpi = findViewById(R.id.sangpemimpi);
        dilan = findViewById(R.id.dilan);
        limacm = findViewById(R.id.limacm);
        daunjatuh = findViewById(R.id.daunjatuh);
        searching = findViewById(R.id.searching);
        great = findViewById(R.id.great);
        powerhabit = findViewById(R.id.powerhabit);
        tentangkamu = findViewById(R.id.tentangkamu);
        gariswaktu = findViewById(R.id.gariswaktu);
        anakkuat = findViewById(R.id.anakkuat);
        filosofiteras = findViewById(R.id.filosofiteras);
        profile = findViewById(R.id.profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ProfileActivity.class));

            }
        });

        bodoamatid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, BodoAmatActivity.class));

            }
        });

        bumimanusia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, BumimanActivity.class));

            }
        });

        negerimenara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MenaraActivity.class));

            }
        });

        laskarpelangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, LaskarActivity.class));

            }
        });

        sangpemimpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, PemimpiActivity.class));

            }
        });

        dilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, DilanActivity.class));

            }
        });

        limacm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, LimacmActivity.class));

            }
        });

        daunjatuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, DaunActivity.class));

            }
        });

        searching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MeaningActivity.class));

            }
        });

        great.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, GreatActivity.class));

            }
        });

        powerhabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, HabitActivity.class));

            }
        });

        tentangkamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, TentangActivity.class));

            }
        });

        gariswaktu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, GarisActivity.class));

            }
        });

        anakkuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, AnakActivity.class));

            }
        });

        filosofiteras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, FilosofiActivity.class));

            }
        });
    }

    public void onBackPressed(){
        Intent a= new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}

