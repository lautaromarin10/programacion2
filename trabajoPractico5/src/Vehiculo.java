/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Vehiculo {
    private String patente, modelo;
    private Motor motor; //agregación
    private Conductor conductor; //asociación bidireccional


    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor){
         this.conductor = conductor;
         
         if(conductor != null && conductor.getVehiculo() != this){
             conductor.setVehiculo(this);
         }
         
    }
    
    public Conductor getConductor(){
        return conductor;
    }
    
    
}
