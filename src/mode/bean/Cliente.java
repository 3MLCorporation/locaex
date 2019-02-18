/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mode.bean;

import java.util.Date;


/**
 *
 * @author lucas.gabriel
 */
public class Cliente extends Usuario {
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String endereco;

   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Cliente(String nomeUsuario, String senha) {
        super(nomeUsuario, senha);
    }
 
}
