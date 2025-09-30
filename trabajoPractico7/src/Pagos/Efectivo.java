/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author lautaromarin
 */
public class Efectivo extends MetodoPago implements Pagable {
    
    public Efectivo(Double saldo){
       super(saldo);
    }
    
    @Override
    public void pagar(){
        System.out.println("Pagando con efectivo");
    }
    
}
