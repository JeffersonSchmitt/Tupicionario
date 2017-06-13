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

public class CulinariaActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_culinaria);
    String[] culinariaArray = getResources().getStringArray(R.array.culinaria);

    final String[] culinariaDesc = getResources().getStringArray(R.array.culinaria_desc);
    ArrayList<Item> list = new ArrayList<>();
    for (int i = 0; i < culinariaDesc.length; i++) {

      String titulo = culinariaArray[i];
      String descricao = culinariaDesc[i];
      Item item = new Item(titulo, descricao, R.mipmap.ic_culinaria);
      list.add(item);
    }

    ItemAdapter adapter = new ItemAdapter(this, list, R.color.culinaria_categoria);

    ListView listView = (ListView) findViewById(R.id.rootCulinaria);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String desc = culinariaDesc[position];
        Toast.makeText(CulinariaActivity.this, desc, Toast.LENGTH_LONG).show();
      }
    });
    listView.setAdapter(adapter);
  }
}
