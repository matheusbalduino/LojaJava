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
    private String razaoSocial;
    private String inscricaoEstadual;
    private ArrayList<Produto> Produtos;
    
    public Fornecedor(String Nome, String Email, String DataNasc, String Cpf, String Sexo){
        super(Nome, Email, DataNasc, Cpf, Sexo);
    }
    public Fornecedor(String Nome, String Email, String DataNasc, String Cpf, String Sexo, String razaoSocial){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        this.razaoSocial = razaoSocial;
    }
    public Fornecedor(String Nome, String Email, String DataNasc, String Cpf, String Sexo, String razaoSocial, String inscricaoEstadual){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public Fornecedor(String Nome, String Email, String DataNasc, String Cpf, String Sexo, String razaoSocial, String inscricaoEstadual, ArrayList<Produto> Produtos){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.Produtos = Produtos;
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
