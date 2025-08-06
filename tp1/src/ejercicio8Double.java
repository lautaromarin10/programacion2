
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class ejercicio8Double {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
       
       double primerNumero, segundoNumero;
       
       System.out.println("Ingresa el primer numero a dividir\n");
       primerNumero = Double.parseDouble(input.nextLine());
       
       System.out.println("Ingresa el segundo numero a dividir\n");
       segundoNumero = Double.parseDouble(input.nextLine());
       
       System.out.println("Resultado: " + ((double) primerNumero / (double) segundoNumero));
    }
}
