package com.grodrigues.listaprodutoscustom.model;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
    private int layoutId;
    private  List<Produto> produtos;
    public ProdutoAdapter(@NonNull  Context context, @LayoutRes int resource, @NonNull List<Produto> objects){
        super(context,resource,objects);
        this.layoutId = resource;
        this.produtos = objects;
    }

    @Override
    public View getView(int position, @Nullable View convertView,@NonNull ViewGroup parent){

        if(convertView == null){
//            convertView = LayoutInflater.from(getContext())
//                    .inflate(R.layout.item_name, parent, false);
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(this.layoutId,parent,false);

        }
        TextView prodName = (TextView) convertView.findViewById(R.id.prod_name);
        TextView prodPreco = (TextView) convertView.findViewById(R.id.prod_preco);
        Produto produto = this.produtos.get(position);

        prodName.setText(produto.getNome());
        prodPreco.setText("R$ "+ produto.getPreco());
        return convertView;
    }

}
