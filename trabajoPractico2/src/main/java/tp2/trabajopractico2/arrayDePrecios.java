/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.trabajopractico2;

/**
 *
 * @author marin
 */
public class arrayDePrecios {
    
    public static void main(String[] args){
    
        double [] precios = {100, 200, 125, 500, 2300};
        System.out.println("Precios originales");
        mostrarProductos(precios);
        
        //modificamos algunos precios
        precios[2] = 1500;
        precios [4] = 200;
        
        System.out.println("Precios modificados");
        mostrarProductos(precios);
    
    }
    
    static void mostrarProductos(double [] listaDePrecios){
    
        for(int i = 0; i < listaDePrecios.length; i++){
            System.out.println("Precio: " + listaDePrecios[i] );
        }
        
    }
    
}
