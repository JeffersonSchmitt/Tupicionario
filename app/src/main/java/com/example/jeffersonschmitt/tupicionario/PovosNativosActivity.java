package com.example.jeffersonschmitt.tupicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PovosNativosActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_povos_nativos);
    String[] povosNativosArray = getResources().getStringArray(R.array.povos_nativos);
    final String[] povosDesc = getResources().getStringArray(R.array.povos_nativos_desc);
    ArrayList<Item> list = new ArrayList<>();

    for (int i = 0; i < povosDesc.length; i++) {
      String titulo = povosNativosArray[i];
      String desc = povosDesc[i];
      Item item = new Item(titulo, desc, R.mipmap.ic_povos_nativos);
      list.add(item);
    }

    ItemAdapter itemAdapter = new ItemAdapter(this, list, R.color.povos_nativos_categoria);
    ListView listView = (ListView) findViewById(R.id.rootPovosNativos);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String desc = povosDesc[position];
        Toast.makeText(PovosNativosActivity.this, desc, Toast.LENGTH_LONG).show();
      }
    });
    listView.setAdapter(itemAdapter);
  }
}
