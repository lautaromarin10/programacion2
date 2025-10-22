/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import ejercicio1.Pago;
import ejercicio1.PagoconDescuento;

/**
 *
 * @author lautaromarin
 */
public class TarjetaCredito implements Pago, PagoconDescuento {
 
    @Override
    public void procesarPago(double montoAPagar){
        System.out.println("Procesando el pago del monto $" + montoAPagar + " con tarjeta");
    }

    @Override
    public void aplicarDescuento(double montoAPagar, double montoDescuento) {
         
        double montoTotal = montoAPagar;
        
        if(montoTotal > montoDescuento){
            System.out.println("Aplicando descuento de $" + montoDescuento + " Pesos");
            montoTotal = montoTotal - montoAPagar;
        }
        
        System.out.println("Pagando el monto final de: $" + montoTotal + " Pesos");
    }
}
