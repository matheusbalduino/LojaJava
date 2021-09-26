/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaalternativa;


public class Cliente extends Pessoa{
    
    private boolean Vip;
    private String OpcaoSexual;
    
    public Cliente(String Nome){
        super(Nome);
    }
    public Cliente(String Nome, String Email){
        super(Nome, Email);
    }
    public Cliente(String Nome, String Email, String DataNasc){
        super(Nome, Email, DataNasc);
    }
    public Cliente(String Nome, String Email, String DataNasc, String Cpf){
        super(Nome, Email, DataNasc, Cpf);        
    }
    public Cliente(String Nome, String Email, String DataNasc, String Cpf, String Sexo, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
    }
    
    public Cliente(String Nome, String Email, String DataNasc, String Cpf, String Sexo, Boolean Vip, Endereco endereco){
     super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
     this.Vip = Vip;
    } 
    public Cliente(String Nome, String Email, String DataNasc, String Cpf, String Sexo, Boolean Vip, String OpcaoSexual, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        this.Vip = Vip;
        this.OpcaoSexual = OpcaoSexual;
    }

    public boolean isVip() {
        return Vip;
    }

    public void setVip(boolean vip) {
        this.Vip = vip;
    }
    
    public String getOpcaoSexual(){
        return this.OpcaoSexual;
    }
    
    public void setOpcaoSexual(String OpcaoSexual){
        this.OpcaoSexual = OpcaoSexual;
    }
    
}
