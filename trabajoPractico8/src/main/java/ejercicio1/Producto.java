/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import ejercicio1.Pagable;
/**
 *
 * @author lautaromarin
 */
public class Producto implements Pagable {
    public String nombre;
    private double precio;
    
    @Override
    public double calcularTotal(){
       return precio;
    }    
}
