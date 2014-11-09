/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author franco
 */
public class BD {

    private ArrayList<Aluno> alunos =  new ArrayList<>();
    private ArrayList<Disciplina> disciplinas =  new ArrayList<>();
    private ArrayList<Matricula> matriculas =  new ArrayList<>();
    private ArrayList<Professor> professores =  new ArrayList<>();

    public BD() {
    }

    public void adcAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void setNota(String nome , int Nota ){
    
 
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void adcDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void adcMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    public void adcProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public String toString(){
        
        return "BD [alunos = "+ alunos +"\nDisciplinas = "+disciplinas +"\nMatriculas = "+ matriculas+""
                + "\nProfessores = "+ professores +" ]";
    }
    
    public StringBuilder gerarBackup() {

        StringBuilder retorno = new StringBuilder();
        retorno.append(this.toString());
        return retorno;
    }

}
