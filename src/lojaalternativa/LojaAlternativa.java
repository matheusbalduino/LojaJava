/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaalternativa;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class LojaAlternativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ENDERECOS
        Endereco end = new Endereco("av. castelo branco", "Jardim Jardim", "14025316", "Ribeirao Preto", "apto 102", "100", "SP");
        Endereco end1 = new Endereco("Almir", "bairro generico", "14025316", "Ribeirao Preto", "apto 102", "100", "SP");
        Endereco end2 = new Endereco("9 de julho", "bairro centro", "14025316", "Ribeirao Preto", "apto 102", "100", "SP");
        
        
        //CATEGORIAS
        Categoria categoria1 = new Categoria("Produtos Para Pele", "Fisico", true);
        Categoria categoria2 = new Categoria("Produtos Para o Corpo", "Fisico", true);
        Categoria categoria3 = new Categoria("Produtos Para a mente", "Digital", true);
       
        
        //FORNECEDOR SEXYSHOP
        Fornecedor fornecedor = new Fornecedor( 1 , "Oveiodavam", "cafetao@hotmail.com", "30/02/1950", "590.851.110-21", "Masculino", "HavamHot", "3285.279.513.486", null, end2 );
        
        //PRODUTOS DO SEXYSHOP
        Produto p1 = new Produto("ÓleoHot", "Óleo para Pele especial", 57.39, categoria1, true, fornecedor);
        Produto p2 = new Produto("CremeMacio", "Creme íntimo, ph neutro", 90.99, categoria1, true, fornecedor);
        Produto p3 = new Produto("Brasileirinhas", "Filme Adulto", 90.99, categoria3, true, fornecedor);
        Produto p4 = new Produto("Brinquedo", "Brinquedo Adulto inflável", 399.99, categoria2, true, fornecedor);
        
       
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(p1); 
        produtos.add(p2); 
        produtos.add(p3); 
        produtos.add(p4); 
        
        fornecedor.setProdutos(produtos);
        
        //CLIENTE SEXSHOP
        Cliente cliente = new Cliente("Carmen Lucia", "carmen_lucia@hotmail.com", "20/07/1989", "834.077.750-59", "Feminino", true, "HeteroTop", end);
        
        //FUNCIONARIO DA LOJA SEXYSHOP
        Funcionario func = new Funcionario("Jorge", "jorgehote@gmail.com", "23/04/1975", "316.615.510-41", "Masculino", "4578.789.123-54", 2421.33, 200, 350, "Unimed", end1);
        
        Date vendaData = new Date(2021, 9, 26);
        
        //Lista de itens       
        ArrayList<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
        ItemCarrinho item1 = new ItemCarrinho(produtos.get(2), 1.0, produtos.get(2).getPreco()); 
        ItemCarrinho item2 = new ItemCarrinho(produtos.get(0), 3.0, produtos.get(0).getPreco());
        ItemCarrinho item4 = new ItemCarrinho(produtos.get(3), 1.0, produtos.get(3).getPreco());
        itens.add(item1);
        itens.add(item2);
        itens.add(item4);

        //int id, String notaFiscal, Date dataVenda, Cliente cliente, Funcionario funcionario, ArrayList<ItemCarrinho> itens
        Venda venda = new Venda(1, "65231.245654.31236", vendaData, cliente, func, itens);
        
        venda.imprimirVenda();
    }

}
