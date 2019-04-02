/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author ifnmg
 */
public class TesteProfessores {
public static void main(String[] args) {
    Professores P1 = new Professores();
        P1.nome = "Emerson Santana";
        P1.formação = "Engenharia eletrica";
        P1.salario = 5000;
        System.out.println ("Nome professor 1: " +P1.nome );
Professores P2 = new Professores();
        P2.nome = "Danivalton Rodrigues";
        P2.formação = "Matematica";
        P2.salario = 10000;
        System.out.println ("Salario professor 2: " +P2.salario );
Professores P3 = new Professores();
        P3.nome = "Daniel Brito Bulhoes";
        P3.formação = "Sistemas de Informação";
        P3.salario = 15000;
        System.out.println ("Nome professor 1: " +P3.formação );
             
        
    
        }  
}
