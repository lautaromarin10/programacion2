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
public class precioDescuentoEcommerce {
    
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       double precio, descuento, impuesto;
               
       System.out.println("Ingrese el precio del producto");
       precio = Double.parseDouble(scanner.nextLine());
       
       System.out.println("Ingrese el porcentaje del descuento");
       descuento = Double.parseDouble(scanner.nextLine());
       
       System.out.println("Ingrese el porcentaje de impuesto");
       impuesto = Double.parseDouble(scanner.nextLine());
       
       
       double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
       
        System.out.println("El precio final es: $" + precioFinal);

    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }
    
    
}
