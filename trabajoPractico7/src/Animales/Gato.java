/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author lautaromarin
 */
public class Gato extends Animal {
    
    int edad;
    
    public Gato(String nombre, int edad){
        super(nombre);
        this.edad = edad;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MIAU");
    }
    
}
