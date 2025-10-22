/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author lautaromarin
 */
public interface Notificable {
    
    default public void NotificarCambio(String cambio){
        System.out.println("Cambio: " + cambio);
    }
}
