/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import visao.CadastrarPessoaVisao;
import visao.MenuVisao;

/**
 *
 * @author buzan
 */
public class MenuControlador {
    private MenuVisao visao;
    private CadastarPessoaControlador pessoa;
    
    public MenuControlador(MenuVisao visao){
        this.visao = visao;  
    }
    
    public void chamarTelaCadastrarPessoa(){
        CadastrarPessoaVisao visao = new CadastrarPessoaVisao();
    }
    
}
