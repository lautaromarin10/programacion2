package Ejercicio4;


import Ejercicio4.TarjetaDeCredito;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito;
    
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        //validación
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this);
        }
    }
    
        
    public TarjetaDeCredito getTarjetaDeCredito(){
        return tarjetaDeCredito;
    }
}
