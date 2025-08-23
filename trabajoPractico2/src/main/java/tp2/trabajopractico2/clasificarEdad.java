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
public class clasificarEdad {
    
    
       public static void main(String[] args){
           
           
          int edad = solicitarEdad();
          clasificarEdad(edad);
           
       }
    
    
      static int solicitarEdad(){
        
        Scanner scanner = new Scanner(System.in);
        int edad;
        
            System.out.println("Ingresa la edad a clasificar");
            edad = Integer.parseInt(scanner.nextLine());
        
        return edad;
        
        }
      
     static void clasificarEdad(int edad){
         
        if (edad < 12){
            System.out.println("Eres un Niño");
        } else if ( edad >= 12 && edad <= 17 ){
            System.out.println("Eres un Adolescente");
        } else if ( edad >= 18 && edad <= 59){
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto Mayor");
        }
         
     }
      
}
