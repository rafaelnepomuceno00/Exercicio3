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
public class TesteMotos {
        public static void main(String[] args) {
     Motos M1 = new Motos();
        M1.Ano = "2002";
        M1.Modelo = "Softail Fatboy" ;
        M1.Marca = "Harley Davidson";
       System.out.println ("Marca Moto1: " + M1.Marca ); 
     Motos M2 = new Motos();
        M2.Ano = "1998";
        M2.Modelo = "Sporter 883" ;
        M2.Marca = "Harley Davidson";
          System.out.println ("Ano Moto2: " + M2.Ano ); 
     Motos M3 = new Motos();
        M3.Ano = "2002";
        M3.Modelo = "Softail Fatbob" ;
        M3.Marca = "Harley Davidson";
         System.out.println ("Marca Moto3: " + M3.Marca
                 
         );       
        
    
        }
    
}
