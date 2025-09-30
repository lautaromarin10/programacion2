/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author lautaromarin
 */
public class Vaca extends Animal {
    
    String color;
    
    public Vaca(String nombre, String color){
        super(nombre);
        this.color = color;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MUUUU");
    }
    
}
