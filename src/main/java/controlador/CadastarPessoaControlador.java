/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.PessoaDAO;
import modelo.Pessoa;
import visao.CadastrarPessoaVisao;

/**
 *
 * @author buzan
 */
public class CadastarPessoaControlador {
    
    private Pessoa modelo;
    private CadastrarPessoaVisao visao;
    private PessoaDAO repositorio;
    
    public CadastarPessoaControlador(CadastrarPessoaVisao visao, PessoaDAO repositorio){
        this.visao = visao;
        this.repositorio = repositorio;
    }
    
    public void adicionarBotao(){
        
    }
    
    public void cadastrarPessoa(){
        
    }
    
}
