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
public class ItemCarrinho {
    private Produto Produto;
    private Double Quantidade;
    private Double totalProdutos;

    public ItemCarrinho(Produto Produto) {
        this.Produto = Produto;
    }

    public ItemCarrinho(Produto Produto, Double Quantidade) {
        this.Produto = Produto;
        this.Quantidade = Quantidade;
    }

    public ItemCarrinho(Produto Produto, Double Quantidade, Double totalProdutos) {
        this.Produto = Produto;
        this.Quantidade = Quantidade;
        this.totalProdutos = totalProdutos;
    }
    
    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
    }

    public Double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Double Quantidade) {
        this.Quantidade = Quantidade;
    }

    public Double getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(Double totalProdutos) {
        this.totalProdutos = totalProdutos;
    }
    
}
