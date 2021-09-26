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
public class Funcionario extends Pessoa {
    private String CartTra;
    private double Salario;
    private double ValeT;
    private double ValeA;
    private String Convenio;
    
   Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        
    }

     Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra,  Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        
        this.CartTra = CartTra;
        
    }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, double Salario,  Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
    }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, double Salario, double ValeT,  Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
        this.ValeT = ValeT;
            }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, double Salario, double ValeT, double ValeA, Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
        this.ValeT = ValeT;
        this.ValeA = ValeA; 
    }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, double Salario, double ValeT, double ValeA, String Convenio,  Endereco endereco){
        super(Nome, Email, DataNasc, Cpf, Sexo, endereco);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
        this.ValeT = ValeT;
        this.ValeA = ValeA; 
        this.Convenio = Convenio;
    }

    public String getCartTra() {
        return CartTra;
    }

    public void setCartTra(String CartTra) {
        this.CartTra = CartTra;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getValeT() {
        return ValeT;
    }

    public void setValeT(double ValeT) {
        this.ValeT = ValeT;
    }

    public double getValeA() {
        return ValeA;
    }

    public void setValeA(double ValeA) {
        this.ValeA = ValeA;
    }

    public String getConvenio() {
        return Convenio;
    }

    public void setConvenio(String Convenio) {
        this.Convenio = Convenio;
    }
    
    
}
