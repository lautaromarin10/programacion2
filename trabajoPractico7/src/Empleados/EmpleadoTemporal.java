/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author lautaromarin
 */
public class EmpleadoTemporal extends Empleado {
 
    double gananciaPorDia;
    
    public EmpleadoTemporal(String nombre, double gananciaPorDia){
        super(nombre);
        this.gananciaPorDia = gananciaPorDia;
    }
    
    @Override
    public double calcularSueldo(){
        return gananciaPorDia * 30;
    }
  
}
