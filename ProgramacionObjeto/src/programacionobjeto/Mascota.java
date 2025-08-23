/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionobjeto;

/**
 *
 * @author lautaromarin
 */
public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nAños: " + edad);
    }
    
    void cumplirAnios(){
        edad = edad + 1;
        System.out.println(nombre + " cumplio " + edad + " Años");
    }
    
}
