/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author franco
 */
public abstract class Professor { 
    
    private  final long cpf;
    private String nome ;
    private double salario ;
    
    
    public Professor (long cpf , String nome , double salario){
        this.salario = salario;
        this.cpf = cpf;
        this.salario = salario;
    }

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
