/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author lautaromarin
 */
public class Transferencia extends MetodoPago implements Pagable {
    
    public Transferencia(double saldo){
        super(saldo);
    }
    
    @Override
    public void pagar(){
        System.out.println("Pagando con Transferencia");
    }
}
