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
public class Doutor extends Professor{

    final double bonusSalarial = 1.3;
    private String tituloTese;
    
    public Doutor(long cpf, String nome, double salario , String tituloTese ) {
        super(cpf, nome, salario);
        this.tituloTese = tituloTese;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public String getTituloTese() {
        return tituloTese;
    }
    public double getSalarioBonus(){
        return (this.getSalario()* 1.3);
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
    
    
}
