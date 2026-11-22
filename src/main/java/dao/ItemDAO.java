/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Item;
import repositorio.ItemRepositorio;

/**
 *
 * @author buzan
 */
public class ItemDAO implements ItemRepositorio{
    
    private static List<Item> itens = new ArrayList<>();

    @Override
    public boolean adicionaItem(Item i) {
        return itens.add(i);
    }

    @Override
    public List<Item> listarTodosItens() {
        return itens;
    }
    
}
