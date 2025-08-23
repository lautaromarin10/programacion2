/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionobjeto;

/**
 *
 * @author lautaromarin
 */
public class Gallina {
    
    int idGallina, edad, huevosPuestos;
    
    public void ponerHuevo(){
    huevosPuestos = huevosPuestos + 1;
    }
    
    public void envejecer(){
    edad = edad + 1;
    }
    
    public void mostrarEstado(){
        System.out.println("ID GALLINA: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos);
    }
    
}
