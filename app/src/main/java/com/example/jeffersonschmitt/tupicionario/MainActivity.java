package com.example.jeffersonschmitt.tupicionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView tvBichos = (TextView) findViewById(R.id.tvBichos);

    tvBichos.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, BichosActivity.class);
        startActivity(intent);
      }
    });

    TextView tvCulinaria = (TextView) findViewById(R.id.tvCulinaria);
    tvCulinaria.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, CulinariaActivity.class);
        startActivity(intent);
      }
    });

    TextView tvPlanta = (TextView) findViewById(R.id.tvPlantas);
    tvPlanta.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, PlantasActivity.class);
        startActivity(intent);
      }
    });

    TextView tvPovosNativos = (TextView) findViewById(R.id.tvPovosNativos);
    tvPovosNativos.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, PovosNativosActivity.class);
        startActivity(intent);
      }
    });
  }
}
