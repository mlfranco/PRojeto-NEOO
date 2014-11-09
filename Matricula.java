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
public class Matricula {

    private Aluno aluno;
    private Disciplina disciplina;
    private Integer pontuacao;

    public Matricula(Aluno aluno, Disciplina disciplina ,Integer pontuacao) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.pontuacao = pontuacao;
    }
        public Matricula(Aluno aluno, Disciplina disciplina ) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.pontuacao = null;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) { 
        
        if ( (pontuacao > 0 )&& ( pontuacao <100 ) ){
            this.pontuacao = pontuacao;
        }else {
            System.out.println("Valor invalido.");
        }
        
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }



}
