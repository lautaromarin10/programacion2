package Ejercicio6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Reserva {
    private String fecha;
    private double hora;
    private Mesa mesa; //Agregación
    private ClienteMesa cliente; //asociación unidireccional
    
    
    public Reserva(String fecha, double hora, Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void setCliente(ClienteMesa cliente){
        this.cliente = cliente;
    }
    
}
