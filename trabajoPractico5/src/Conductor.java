/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Conductor {
    private String nombre, licencia;
    private Vehiculo vehiculo;
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
     public void setVehiculo(Vehiculo vehiculo){
         this.vehiculo = vehiculo;
         
         if(vehiculo != null && vehiculo.getConductor() != this){
             vehiculo.setConductor(this);
         }
    }
    
}
