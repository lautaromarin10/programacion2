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
public class descuentoEspecial {
    
    static double descuentoGlobal = 0.10; 
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double precioProducto;
        
        System.out.println("Ingrese el precio del producto");
        precioProducto = Double.parseDouble(scanner.nextLine());
        
        System.out.println("El descuento especial aplicado es: " + (descuentoGlobal * 100));
        System.out.println("El precio final con descuento es: " + calcularDescuentoEspecial(precioProducto));
        
    }
    
    static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * (1 - descuentoGlobal);
        return descuentoAplicado;
    }

}
