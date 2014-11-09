/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
tu * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author franco
 */
public class Mestre extends Professor{
    private String tituloDissertacao;
    
    public Mestre(long cpf, String nome, double salario, String tituloDissertacao) {
        super(cpf, nome, salario);
        this.tituloDissertacao = tituloDissertacao;
        
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
    
    
}
