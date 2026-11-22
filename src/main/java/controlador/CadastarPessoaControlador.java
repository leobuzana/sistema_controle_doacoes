/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.PessoaDAO;
import modelo.Pessoa;
import repositorio.PessoaRepositorio;
import visao.CadastrarPessoaVisao;

/**
 *
 * @author buzan
 */
public class CadastarPessoaControlador {
    
    private Pessoa modelo;
    private CadastrarPessoaVisao visao;
    private PessoaRepositorio repositorio;
    
    public CadastarPessoaControlador(CadastrarPessoaVisao visao, PessoaRepositorio repositorio){
        this.visao = visao;
        this.repositorio = repositorio;
    }
    
    public void adicionarBotao(){
        
    }
    
    public void cadastrarPessoa(){
        
    }
    
}
