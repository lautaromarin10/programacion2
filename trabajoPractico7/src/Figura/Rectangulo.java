/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author lautaromarin
 */
public class Rectangulo extends Figura {
    Double largo, ancho;
    
    public Rectangulo(String nombre, double largo, double ancho){
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea(){
        return largo * ancho;
    }
    
}
