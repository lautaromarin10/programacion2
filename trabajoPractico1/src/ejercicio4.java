/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author lautaromarin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingresa tu nombre\n");
        nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad\n");
        edad = input.nextInt();
        
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad);
    }
}
