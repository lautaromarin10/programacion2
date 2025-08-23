/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class sumaDepares {
    
     public static void main(String[] args){
     
         int acumulador, numero;
         acumulador = 0;
         numero = 1;
         Scanner scanner = new Scanner(System.in);
         
         while (numero != 0){
             System.out.print("Ingrese un numero, 0 para salir ");
             numero = Integer.parseInt(scanner.nextLine());
             acumulador += agregarSiEsPar(numero);
         }
         
         System.out.println("La suma de los numeros pares da como resultado: " + acumulador);
         
         
     
     }
     
     static int agregarSiEsPar(int numeroAEvaluar){
         return numeroAEvaluar % 2 == 0 ? numeroAEvaluar : 0;
     }
    
}
