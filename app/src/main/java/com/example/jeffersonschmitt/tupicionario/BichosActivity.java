package com.example.jeffersonschmitt.tupicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BichosActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bichos);

    String[] bichosArray = getResources().getStringArray(R.array.bichos);

    final String[] bichosDescArray = getResources().getStringArray(R.array.bichos_desc);
    ArrayList<Item> list = new ArrayList<>();
    for (int i = 0; i < bichosDescArray.length; i++) {
      String titulo = bichosArray[i];
      String desc = bichosDescArray[i];
      Item item = new Item(titulo, desc, R.mipmap.ic_bichos);
      list.add(item);
    }

    ItemAdapter itemAdapter = new ItemAdapter(this, list, R.color.bichos_categoria);

    ListView listView = (ListView) findViewById(R.id.rootBichos);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String desc = bichosDescArray[position];
        Toast.makeText(BichosActivity.this, desc, Toast.LENGTH_LONG).show();
      }
    });

    listView.setAdapter(itemAdapter);
  }
}
