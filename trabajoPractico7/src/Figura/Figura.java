/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author lautaromarin
 */
public abstract class Figura {
    
    String nombre;
    
    public abstract double calcularArea();
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    
}
