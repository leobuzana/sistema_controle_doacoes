/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import visao.GerenciarDoacaoVisao;

/**
 *
 * @author buzan
 */
public class GerenciarDoacaoControlador {
    private GerenciarDoacaoVisao visao;
    
    public GerenciarDoacaoControlador(GerenciarDoacaoVisao visao){
        this.visao = visao;
        visao.setVisible(true);
    }
}
