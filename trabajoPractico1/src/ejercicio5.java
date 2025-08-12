
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int primerNumero, segundoNumero;
        
        System.out.println("Ingresa el primer numero\n");
        primerNumero = Integer.parseInt((input.nextLine()));
        
        System.out.println("Ingresa el segundo numero\n");
        segundoNumero = Integer.parseInt((input.nextLine()));
        
        System.out.println("Suma: " + (primerNumero + segundoNumero));
        System.out.println("Resta: " + (primerNumero - segundoNumero));
        System.out.println("Multiplicación: " + (primerNumero * segundoNumero));
        // no se considero la División por 0
        System.out.println("División: " + ((double)primerNumero / (double)segundoNumero));
        
    }
}
