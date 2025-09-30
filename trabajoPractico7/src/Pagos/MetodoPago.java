/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author lautaromarin
 */
public abstract class MetodoPago implements Pagable {
    double saldo;

    public MetodoPago(Double saldo){
        this.saldo = saldo;
    }

    // Implementación genérica o abstracta
    @Override
    public abstract void pagar();

    // procesarPago ya no necesita recibir nada
    public void procesarPago() {
        this.pagar();
    }
}
