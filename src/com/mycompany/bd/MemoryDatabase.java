/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bd;

import com.mycompany.produto.Produto;
import java.util.ArrayList;

/**
 *
 * @author 10156
 */
public class MemoryDatabase {
    public static ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public static void carregarDadosExemplo(){
        listaProdutos.add(new Produto(0, "Computador", 1500.0));
        listaProdutos.add(new Produto(1, "Teclado", 100.0));
        listaProdutos.add(new Produto(2, "Mouse", 50.0));
        listaProdutos.add(new Produto(3, "Monitor", 300.0));
        listaProdutos.add(new Produto(4, "Impressora", 200.0));
        listaProdutos.add(new Produto(5, "Cadeira de Escritório", 250.0));
        listaProdutos.add(new Produto(6, "Webcam", 80.0));
        listaProdutos.add(new Produto(7, "Headset", 120.0));
        listaProdutos.add(new Produto(8, "Microfone", 150.0));
        listaProdutos.add(new Produto(9, "Mousepad", 20.0));
        listaProdutos.add(new Produto(10, "Pendrive", 30.0));
        listaProdutos.add(new Produto(11, "HD Externo", 200.0));
        listaProdutos.add(new Produto(12, "Roteador", 90.0));
        listaProdutos.add(new Produto(13, "Cabo HDMI", 15.0));
        listaProdutos.add(new Produto(14, "Carregador de Notebook", 70.0));
        listaProdutos.add(new Produto(15, "Suporte para Notebook", 50.0));
    }
}
