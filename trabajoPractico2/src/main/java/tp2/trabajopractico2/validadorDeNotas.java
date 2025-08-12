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
public class validadorDeNotas {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numero;
    
    do{
        System.out.println("Ingrese un unero entre 0 y 10");
        numero = Integer.parseInt(scanner.nextLine());
        
    } while (numero < 0 || numero > 10);
    
    }
    
}
