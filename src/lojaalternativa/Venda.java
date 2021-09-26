/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaalternativa;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Venda {
    
    private int id;
    private String notaFiscal;
    private Date dataVenda;
    private Cliente cliente;
    private double valorVenda;
    private Funcionario funcionario;
    private ArrayList<ItemCarrinho> itens;
    private double total;

    public Venda(int id, String notaFiscal, Date dataVenda, Cliente cliente, Funcionario funcionario, ArrayList<ItemCarrinho> itens) {
        this.id = id;
        this.notaFiscal = notaFiscal;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.itens = itens;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemCarrinho> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        for(int i = 0; i < itens.size(); i++){
            this.total += itens.get(i).getTotalProdutos();
        }
    }
     
        //MÉTODO IMPRIMIR VENDA
    public void imprimirVenda() {

        System.out.println("----SuperShopping Alternativo-----");
        System.out.println("Nota fiscal nº: " + this.notaFiscal);

        //CONVERTE A DATA NO FORMATO DD/MM/YYYY. EX.: 25/06/2021
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        String s = formatter.format(this.getDataVenda());

        System.out.println("Data da venda nº: " + s);

        System.out.println("Funcionário Reponsável: " + this.funcionario.getNome());
        System.out.println("Cliente: " + this.cliente.getNome());
        
        if(this.cliente.isVip()){
            System.out.println(" VIP: SIM");
        } else{
            System.out.println(" VIP: NÃO");
        }
        
        System.out.println("Endereco: " + this.cliente.getEndereco().getLogradouro());

        System.out.println("ITENS:");

        for (int i = 0; i < itens.size(); i++) {

            System.out.println("Item: " + itens.get(i).getProduto().getNome());
            System.out.println("Fornecedor: " + itens.get(i).getProduto().getFornecedor().getNome());
            System.out.println("Categoria: " + itens.get(i).getProduto().getCategoria().getDescricao());
            System.out.println("Quantidade: " + itens.get(i).getQuantidade());
            System.out.println("Valor Unitário: " + itens.get(i).getProduto().getPreco());
            System.out.println("SubTotal: " + itens.get(i).getTotalProdutos());
            
             System.out.println("*****************:");
        }

        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        this.setTotal(total);
        System.out.println("Total da Venda: " + this.getTotal());

    }
    
}
