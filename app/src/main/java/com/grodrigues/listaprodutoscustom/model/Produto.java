package com.grodrigues.listaprodutoscustom.model;

import com.orm.SugarRecord;

/**
 * Created by grodrigues on 20/03/17.
 */

public class Produto extends SugarRecord {

    private double preco;
    private String nome;
    private boolean removido;

    public Produto(){}

    public Produto(double preco,String nome){
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + getId() + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
