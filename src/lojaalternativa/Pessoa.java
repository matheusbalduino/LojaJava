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
public abstract class Pessoa {
    private String Nome;
    private String Email;
    private String DataNasc;
    private String Cpf;
    private String Sexo;
    
     public Pessoa(String Nome){
        this.Nome = Nome;
      
    }
    public Pessoa(String Nome, String Email){
        this.Nome = Nome;
        this.Email = Email;
        
    }
    
    public Pessoa(String Nome, String Email, String DataNasc){
        this.Nome = Nome;
        this.Email = Email;
        this.DataNasc = DataNasc;
        
    }
    
    public Pessoa(String Nome, String Email, String DataNasc, String Cpf){
        this.Nome = Nome;
        this.Email = Email;
        this.DataNasc = DataNasc;
        this.Cpf = Cpf;
        
    }
    
    public Pessoa(String Nome, String Email, String DataNasc, String Cpf, String Sexo){
        this.Nome = Nome;
        this.Email = Email;
        this.DataNasc = DataNasc;
        this.Cpf = Cpf;
        this.Sexo = Sexo;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
