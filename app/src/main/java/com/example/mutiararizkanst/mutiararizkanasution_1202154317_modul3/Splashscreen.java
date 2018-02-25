package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {
    private int SplashInterval = 3000; // kecepatan untuk ke screen selanjutnya (3 detik)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //berpindah dari splashscreen ke menulist utama
                startActivity(new Intent(Splashscreen.this, Login.class));
                //menampilkan toast jika masuk ke halaman login
                Toast.makeText(Splashscreen.this, "WELCOME!! silahkan Login :)", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashInterval);
    }
}
