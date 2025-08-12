/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author lautaromarin
 */
public class ejercicio8Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       
       int primerNumero, segundoNumero;
       
       System.out.println("Ingresa el primer numero a dividir\n");
       primerNumero = Integer.parseInt(input.nextLine());
       
       System.out.println("Ingresa el segundo numero a dividir\n");
       segundoNumero = Integer.parseInt(input.nextLine());
       
       System.out.println("Resultado: " + ((double) primerNumero / (double) segundoNumero));
       
    }
}
