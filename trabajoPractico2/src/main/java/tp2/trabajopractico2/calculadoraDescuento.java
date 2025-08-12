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
public class calculadoraDescuento {
    
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      double precio, precioFinal;
      String categoria;
      
      System.out.println("Ingrese el precio del producto");
      precio = Double.parseDouble(scanner.nextLine());
      
      System.out.println("Ingresa la categoria que le corresponda");
      categoria = scanner.nextLine();
      
      
      precioFinal = precio * ( 1 - devolverDescuento(categoria));
        
      System.out.print("El producto que tiene un precio de " + precio + " y pertenece a la categoria " + categoria + 
                 " se le aplicará un descuento del " + (devolverDescuento(categoria) * 100) + "% y queda con un precio final de " + precioFinal);
      
    }
    
  
    static double devolverDescuento(String categoria){
        
        if(categoria.equalsIgnoreCase("a")){
            return 0.10;
        } else if (categoria.equalsIgnoreCase("b")){
            return 0.15;
        }
          else if (categoria.equalsIgnoreCase("c")){
            return 0.20;        
        } else {
            return 1;
        }
        
    }
    

    
    
}
