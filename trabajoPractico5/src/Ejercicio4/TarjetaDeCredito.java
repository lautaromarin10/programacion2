package Ejercicio4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class TarjetaDeCredito {
    private int numero;
    private String fechaVencimiento;
    private Cliente cliente; //bidireccional
    private Banco banco; //agregacion
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
}
