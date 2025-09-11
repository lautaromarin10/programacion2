package Ejercicio10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class CuentaTitular {
    private int dni;
    private String nombre;
    private CuentaBancaria cuentaBancaria;
    
    public CuentaBancaria getCuentaBancaria(){
        return cuentaBancaria;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null){
            cuentaBancaria.setCuentaTitular(this);
        }
        
    }
    
}
