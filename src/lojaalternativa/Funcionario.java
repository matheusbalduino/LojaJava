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
    private String Salario;
    private String ValeT;
    private String ValeA;
    private String Convenio;
    
   Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        
    }

     Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        
        this.CartTra = CartTra;
        
    }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, String Salario){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
    }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, String Salario, String ValeT){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
        this.ValeT = ValeT;
            }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, String Salario, String ValeT, String ValeA){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        
        this.CartTra = CartTra;
        this.Salario = Salario;
        this.ValeT = ValeT;
        this.ValeA = ValeA; 
    }

    Funcionario(String Nome, String Email, String DataNasc, String Cpf, String Sexo,
    String CartTra, String Salario, String ValeT, String ValeA, String Convenio){
        super(Nome, Email, DataNasc, Cpf, Sexo);
        
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

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public String getValeT() {
        return ValeT;
    }

    public void setValeT(String ValeT) {
        this.ValeT = ValeT;
    }

    public String getValeA() {
        return ValeA;
    }

    public void setValeA(String ValeA) {
        this.ValeA = ValeA;
    }

    public String getConvenio() {
        return Convenio;
    }

    public void setConvenio(String Convenio) {
        this.Convenio = Convenio;
    }
    
    
}
