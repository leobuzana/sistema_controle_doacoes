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
        adicionarBotao();
    }
    
    public void adicionarBotao(){
        visao.adicionarAcaoBotao(e->cadastrarPessoa());
    }
    
    public void cadastrarPessoa(){
        
        String nome = visao.getNome();
        String cpf = visao.getCpf();
        String email = visao.getEmail();
        
        Pessoa p = new Pessoa(nome, cpf, email);
        repositorio.addPessoa(p);
        
        visao.limpaTela();
        visao.atualizaListaPessoas(repositorio.listarPessoas());
        
        
    }
    
}
