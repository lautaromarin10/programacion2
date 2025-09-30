/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author lautaromarin
 */
public abstract class Animal {
        
    String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
    
    
    public void describirAnimal(){
        System.out.println("Nombre: " + nombre);
    };
    
}
