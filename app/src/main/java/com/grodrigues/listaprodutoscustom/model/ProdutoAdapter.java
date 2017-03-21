package com.grodrigues.listaprodutoscustom.model;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.grodrigues.listaprodutoscustom.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grodrigues on 21/03/17.
 */

public class ProdutoAdapter extends ArrayAdapter<Produto> {

    public ProdutoAdapter(Context context, List<Produto> produtos){
        super(context,0,produtos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Produto produto = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_name, parent, false);

        }
        TextView prodName = (TextView) convertView.findViewById(R.id.prod_name);
        TextView prodPreco = (TextView) convertView.findViewById(R.id.prod_preco);
        assert produto != null;
        prodName.setText(produto.getNome());
        prodPreco.setText((int) produto.getPreco());
        return convertView;
    }

}
