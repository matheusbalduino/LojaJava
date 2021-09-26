/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaalternativa;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Fornecedor extends Pessoa {
    private int Id;
    private String razaoSocial;
    private String inscricaoEstadual;
    private ArrayList<Produto> Produtos;
    
    public Fornecedor(int id, String Nome, String Email, String DataNasc, String Cpf, String Sexo, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        this.Id = id;
    }
    public Fornecedor(int id, String Nome, String Email, String DataNasc, String Cpf, String Sexo, String razaoSocial, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        this.razaoSocial = razaoSocial;
        this.Id = id;
    }
    public Fornecedor(int id, String Nome, String Email, String DataNasc, String Cpf, String Sexo, String razaoSocial, String inscricaoEstadual, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.Id = id;
    }
    public Fornecedor(int id, String Nome, String Email, String DataNasc, String Cpf, String Sexo, String razaoSocial, String inscricaoEstadual, ArrayList<Produto> Produtos, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.Produtos = Produtos;
        this.Id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(ArrayList<Produto> Produtos) {
        this.Produtos = Produtos;
    }
    
}
