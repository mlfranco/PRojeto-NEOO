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
public class Disciplina {

    private final int codigo;
    private int cargaHoraria;
    private String nome;


    public Disciplina(int codigo, int cargaHoraria, String nome) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString(){
        String retorno ="Nome da disciplina: "+this.getNome()+"\nCodigo: "+this.getCodigo()+"\nCarga Horaria: "+this.getCargaHoraria();      
        return retorno;
    }



}
