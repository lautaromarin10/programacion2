/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.trabajopractico2;


/**
 *
 * @author marin
 */
    
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marin
 */
public class calculadoraDeNumeros {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //negativos, ceros, positivos
        int [] clasificacion = {0, 0, 0};
        int numeroIngresado;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el numero " + i + " a clasificar: ");
            numeroIngresado = Integer.parseInt(scanner.nextLine());
            clasificacion = clasificarNumeros(clasificacion, numeroIngresado);
        }
        
        System.out.println("Resultados:\n Positivos: " + clasificacion[2] + "\n Negativos: " + clasificacion[0] + "\n Ceros: " + clasificacion[1]);
        
        
        
    }
            
    
    static int[] clasificarNumeros(int[] clasificacion, int numeroIngresado) {
    if (numeroIngresado > 0) {
        clasificacion[2] += 1;
    } else if (numeroIngresado < 0) {
        clasificacion[0] += 1;
    } else {
        clasificacion[1] += 1;
    }
    return clasificacion;
}
    
    
    
}

