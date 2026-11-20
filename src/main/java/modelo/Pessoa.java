/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author buzan
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String email;
    private static int geradorcodigo;
    private int codigo;
    
    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.codigo = geradorcodigo;
        
        geradorcodigo++;
    }

    @Override
    public String toString() {
        return "Pessoa" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", codigo=" + codigo;
    }
    
    
    
}
