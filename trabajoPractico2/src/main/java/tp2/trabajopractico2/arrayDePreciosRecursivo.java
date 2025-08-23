/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.trabajopractico2;

/**
 *
 * @author marin
 */
public class arrayDePreciosRecursivo {
    
    public static void main(String[] args){
    
        double [] precios = {100, 200, 125, 500, 2300};
        System.out.println("Precios originales");
        mostrarProductosRecursivo(precios, 0);
        
        //modificamos algunos precios
        precios[2] = 1500;
        precios [4] = 200;
        
        System.out.println("Precios modificados");
        mostrarProductosRecursivo(precios, 0);
    
    }
    
    static void mostrarProductosRecursivo(double [] listaDePrecios, int indice){
        
        if (indice >= listaDePrecios.length){
        return;
        }
        
        System.out.println("Precio: " + listaDePrecios[indice]);
        
        mostrarProductosRecursivo(listaDePrecios, indice + 1);
        
    }
    
}
