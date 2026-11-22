/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import visao.GerenciarEstoqueVisao;

/**
 *
 * @author buzan
 */
public class GerenciarEstoqueControlador {
    GerenciarEstoqueVisao visao;
    
    public GerenciarEstoqueControlador(GerenciarEstoqueVisao visao){
        this.visao = visao;
        visao.setVisible(true);
    }
    
}
