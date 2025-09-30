/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author lautaromarin
 */
public class Perro extends Animal {
    
    String raza;
    int edad;
    
    public Perro(String nombre, String raza, int edad){
        super(nombre);
        this.raza = raza;
        this.edad = edad;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }
    
}
