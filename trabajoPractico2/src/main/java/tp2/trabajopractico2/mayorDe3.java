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
public class mayorDe3 {
    
    public static void main(String[] args){
    
    int numeroMayor;
    int [] listaDeNumeros = solicitarLista();
        
    
    numeroMayor = numeroMayorDeLaLista(listaDeNumeros);
    
    System.out.println("El numero mas grande los ingresados es: " + numeroMayor);
  
           
    }
    
    static int [] solicitarLista(){
        
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[3];
        
        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese el " + (i+1) + " numero");
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }
        
        return numeros;
        
    }
    
    static int numeroMayorDeLaLista(int [] listaDeNumeros){
        
       int numeroMayor = listaDeNumeros[0];
        
        for(int i = 1; i < listaDeNumeros.length; i++){
           if (numeroMayor < listaDeNumeros[i]){
               numeroMayor = listaDeNumeros[i];
           }
        }
        
        return numeroMayor;
    }
    
   
    
}
