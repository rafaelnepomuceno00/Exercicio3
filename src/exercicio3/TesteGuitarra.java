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
public class TesteGuitarra {
    public static void main(String[] args) {
    Guitarras G1 = new Guitarras();
        G1.Ano = "2014";
        G1.Cordas = 7;
        G1.Marca = "Ibanez";
        System.out.println ("Modelo Guitarra 1: " + G1.Marca );
Guitarras G2 = new Guitarras();
        G2.Ano = "1963";
        G2.Cordas = 6;
        G2.Marca = "Gibson Les paul";
        System.out.println ("Ano Guitarra 2: " + G2.Ano );
Guitarras G3 = new Guitarras();
        G3.Ano = "2014";
        G3.Cordas = 6;
        G3.Marca = "Strinberg Stratocaster";
                
        System.out.println ("Cordas Guitarra 3: " + G3.Cordas );
    
        }
        }
