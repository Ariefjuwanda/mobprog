package com.example.sejarahindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Button btnMain = findViewById(R.id.buttonMain);
        ImageButton btnPengaturan = findViewById(R.id.buttonPengaturan);
        ImageButton btnPiala = findViewById(R.id.buttonPiala);
        ImageButton btnHelp = findViewById(R.id.buttonHelp);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,level.class));
            }
        });
    }
}