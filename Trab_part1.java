/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Trab_part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BD Banco_de_Dados = new BD();
        Doutor doutor1 = new Doutor(111, "matheus", 1000, "tese foda");
        Disciplina aed1 = new Disciplina(1010, 5, "aed1");
        Date data = new Date(1, 1, 1);
        Aluno aluno2 = new Aluno(222, "Lulu", data);
        Aluno aluno1 = new Aluno(111, "matheus", data);
        Matricula mat1 = new Matricula(aluno1, aed1, 100);       
        Matricula mat2 = new Matricula(aluno2, aed1, 100);
        mat2.setPontuacao(1100);

        Scanner scan = new Scanner(System.in);

        Banco_de_Dados.adcDisciplina(aed1);
        Banco_de_Dados.adcAluno(aluno1);
        Banco_de_Dados.adcAluno(aluno2);
        Banco_de_Dados.adcMatricula(mat2);
        Banco_de_Dados.adcMatricula(mat1);
        
        int opc = 7;
        while (opc != 8) {

            System.out.println("############## MENU ############# ");
            //System.out.println("### Opçoes para Banco de Dados### ");
            System.out.println("1 - Alunos ");
            System.out.println("2 - Professores ");
            System.out.println("3 - Disciplina ");
            System.out.println("4 - Imprimir Banco de Dados");
            //System.out.println("####### Opçoes para 'dados' #####");
            System.out.println("5 - Matricular Aluno ");
            System.out.println("6 - Cadastras nota de aluno");
            System.out.println("7 - Listar disciplinas de um aluno");
            System.out.println("8 - Listar disciplinas de um Professor");

            opc = scan.nextInt();

            if (opc == 1) {
                System.out.println("#################");
                System.out.println("1 - Inserir Aluno");
                System.out.println("2 - Excluir aluno");
                System.out.println("3 - Listar Alunos");
                System.out.println("#################");

                opc = scan.nextInt();
                if (opc == 1) {
                    int matricula, dia, mes, ano;
                    String nome;
                    System.out.println("Digite o Numero de matricula : ");
                    matricula = scan.nextInt();
                    System.out.println("Digite Nome do aluno :");
                    nome = scan.nextLine();
                    System.out.println("Digite a Data");
                    dia = scan.nextInt();
                    mes = scan.nextInt();
                    ano = scan.nextInt();
                    Date data2 = new Date(ano, mes, dia);
                    Aluno aluno = new Aluno(matricula, nome, data2);
                    Banco_de_Dados.adcAluno(aluno);

                }
                if (opc == 2) {

                }
                if (opc == 3) {
                    ArrayList<Aluno> alunos = Banco_de_Dados.getAlunos();
                    for (Aluno i : alunos) {
                        System.out.println(i);
                    }

                }

            }
            if (opc == 2) {
                System.out.println("#################");
                System.out.println("1 - Inserir Professor");
                System.out.println("2 - Excluir Professor");
                System.out.println("3 - Listar Professores");
                System.out.println("#################");

                opc = scan.nextInt();
                if (opc == 1) {

                }
                if (opc == 2) {

                }
                if (opc == 3) {

                }
            }

            if (opc == 3) {
                System.out.println("#################");
                System.out.println("1 - Inserir Disciplina");
                System.out.println("2 - Excluir Disciplina");
                System.out.println("3 - Listar Disciplinas");
                System.out.println("#################");

                opc = scan.nextInt();
                if (opc == 1) {

                }
                if (opc == 2) {

                }
                if (opc == 3) {

                }
            }
            if (opc == 4) {

            }
            if (opc == 5) {
                Aluno alunoAux = new Aluno();
                System.out.print("Digite o nome do aluno :");
                String nome = scan.next();
                System.out.print("Digite a nota do aluno");
                int nota = scan.nextInt();
                
                  ArrayList<Aluno> alunos = Banco_de_Dados.getAlunos();
                    for (Aluno i : alunos) {
                        if (i.getNome().equals(nome)){
                            alunoAux = i;
                        }
                    }
                
                //Matricula matAux = new Matricula(,,); 
                
            }
            if (opc == 6) {

            }
        }

    }

}
