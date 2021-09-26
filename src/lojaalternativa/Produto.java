/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaalternativa;

/**
 *
 * @author Matheus
 */
public class Produto {
    private String Nome;
    private String Descricao;
    private double Preco;
    private Categoria Categoria;
    private boolean Delivery;
    private Fornecedor fornecedor;

    public Produto(String Nome, String Descricao, double Preco, Categoria Categoria, boolean Delivery, Fornecedor fornecedor) {
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Preco = Preco;
        this.Categoria = Categoria;
        this.Delivery = Delivery;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    public boolean isDelivery() {
        return Delivery;
    }

    public void setDelivery(boolean Delivery) {
        this.Delivery = Delivery;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
