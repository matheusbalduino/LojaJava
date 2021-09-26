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
public class Categoria {
    private String Descricao;
    private String FisicoDidital;
    private boolean Adulto;

    public Categoria(String Descricao) {
        this.Descricao = Descricao;
       
    }       
     
    public Categoria(String Descricao, String FisicoDidital) {
        this.Descricao = Descricao;
        this.FisicoDidital = FisicoDidital;
        
    }        
    public Categoria(String Descricao, String FisicoDidital, boolean Adulto) {
        this.Descricao = Descricao;
        this.FisicoDidital = FisicoDidital;
        this.Adulto = Adulto;
    }        

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getFisicoDidital() {
        return FisicoDidital;
    }

    public void setFisicoDidital(String FisicoDidital) {
        this.FisicoDidital = FisicoDidital;
    }

    public boolean isAdulto() {
        return Adulto;
    }

    public void setAdulto(boolean Adulto) {
        this.Adulto = Adulto;
    }
    
}
