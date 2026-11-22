/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import visao.SituacaoPessoaVisao;

/**
 *
 * @author buzan
 */
public class SituacaoPessoaControlador {
    
    private SituacaoPessoaVisao visao;
    
    public SituacaoPessoaControlador(SituacaoPessoaVisao visao){
        this.visao = visao;
        visao.setVisible(true);
    }
    
}
