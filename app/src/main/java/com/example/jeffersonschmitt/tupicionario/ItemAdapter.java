package com.example.jeffersonschmitt.tupicionario;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jefferson Schmitt on 02/06/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

  private int backgroundColor;

  public ItemAdapter(Context context, ArrayList<Item> list, int backgroundColor) {
    super(context, 0, list);
    this.backgroundColor = backgroundColor;
  }

  @NonNull @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View itemView = convertView;
    if (itemView == null) {

      itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
    }

    Item item = getItem(position);

    TextView titulo = (TextView) itemView.findViewById(R.id.item_titulos);

    titulo.setText(item.getTitulo());

    TextView descricao = (TextView) itemView.findViewById(R.id.item_descricao);

    descricao.setText(item.getDescricao());

    ImageView icone = (ImageView) itemView.findViewById(R.id.icone);
    icone.setImageResource(item.getImagem());

    LinearLayout layoutTextos = (LinearLayout) itemView.findViewById(R.id.item_layout_textos);

    int color = ContextCompat.getColor(getContext(), backgroundColor);

    layoutTextos.setBackgroundColor(color);

    return itemView;
  }
}
