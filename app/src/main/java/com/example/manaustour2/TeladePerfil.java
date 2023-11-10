package com.example.manaustour2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TeladePerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_perfil);

        getSupportActionBar().hide();
    }
}
