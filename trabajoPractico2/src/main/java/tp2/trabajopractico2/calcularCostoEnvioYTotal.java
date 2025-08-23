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
public class calcularCostoEnvioYTotal {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        double peso, precioProducto, costoEnvio;
        String zonaEnvio;
        
        System.out.println("Ingrese el precio del producto");
        precioProducto = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ingrese el peso del paquete");
        peso = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional)");
        zonaEnvio = scanner.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zonaEnvio);
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto, costoEnvio));
    
    }
    
    static double calcularCostoEnvio(double peso, String zona){
        return zona.equalsIgnoreCase("Nacional") ? peso * 5 : peso * 10;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
}
