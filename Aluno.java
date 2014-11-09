/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;

/**
 *
 * @author franco
 */
public class Aluno {
   
    private final int matricula ;
    private String nome;
    private Date dataNascimento;

    
    public Aluno(int matricula, String nome, Date dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
        public String toString() {
        String retorno = "Matricula : "+this.getMatricula()+ "\nNome :"+this.getNome()+"\nData de nascimento :"+this.getDataNascimento();
                return retorno;
    }
}
