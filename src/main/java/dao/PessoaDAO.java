/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;
import repositorio.PessoaRepositorio;

/**
 *
 * @author buzan
 */
public class PessoaDAO implements PessoaRepositorio{
    
    private static List<Pessoa>pessoas = new ArrayList<>();

    @Override
    public boolean addPessoa(Pessoa p) {
        return pessoas.add(p);
    }

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoas;
    }
    
}
