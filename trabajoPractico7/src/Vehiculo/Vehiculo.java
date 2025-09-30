/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author lautaromarin
 */
public class Vehiculo {
    String marca, modelo;
    
    public void mostrarInfo(){
        System.out.println("Vehiculo de marca " + marca + " y modelo " + modelo);
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
}
