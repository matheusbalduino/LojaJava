/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaalternativa;


public class Cliente extends Pessoa{
    
    private boolean Vip;
    
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
    public Cliente(String Nome, String Email, String DataNasc, String Cpf, String Sexo){
        super(Nome, Email, DataNasc, Cpf, Sexo);
    }
        
    public Cliente(String Nome, String Email, String DataNasc, String Cpf, String Sexo, Boolean Vip){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        this.Vip = Vip;
    }

    public boolean isVip() {
        return Vip;
    }

    public void setVip(boolean vip) {
        this.Vip = vip;
    }
    
    
  
}
