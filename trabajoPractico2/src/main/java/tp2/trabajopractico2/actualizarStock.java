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
public class actualizarStock {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int stockActual, cantidadVendidas, cantidadRecibidas;
        
        System.out.println("Ingrese el stock actual del producto");
        stockActual = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese la cantidad venidad");
        cantidadVendidas = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese la cantidad recibida");
        cantidadRecibidas = Integer.parseInt(scanner.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendidas, cantidadRecibidas);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    
    }
    
    static int actualizarStock(int stockActual, int CantidadVendida, int cantidadRecibida){
    
        
        return  stockActual - CantidadVendida + cantidadRecibida;
    }
    
}
