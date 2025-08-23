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
public class bisiesto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.print("Ingrese un numero para comprobar si es bisiesto");
        int anio = Integer.parseInt(scanner.nextLine());
        
        if (esBisiesto(anio)){
            System.out.print("El numero es bisiesto");
        } else {
            System.out.print("El numero no es bisiesto");
        }
        
    }
    
    static boolean  esBisiesto(int anio){
        return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
    }
    
    
}
