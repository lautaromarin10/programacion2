/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import ejercicio1.Notificable;
/**
 *
 * @author lautaromarin
 */
public class Cliente implements Notificable {
    
    int edad = 24;
    //no hace falta necesariamente hacer un override de los metodos
    //de notificable ya que tiene un metodo default
    
    //ejemplo de uso
    private void cumplirAnios(){
        edad++;
        NotificarCambio("Cumplio años, edad actual: " + edad);
        
    }
}
