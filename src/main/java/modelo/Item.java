/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author buzan
 */
public class Item {
    private String nomeItem;
    private int quantidade;
    private static int geradorcodigo;
    private int codigo;

    public Item(String nomeItem, int quantidade, int codigo) {
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.codigo = geradorcodigo;
        
        geradorcodigo++;
    }
    
    
}
