/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author lautaromarin
 */
public abstract class Empleado {
    
    String nombre;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double calcularSueldo();
    
}
