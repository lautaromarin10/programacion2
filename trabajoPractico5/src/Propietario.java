/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;
    
    public Computadora getComputadora(){
        return computadora;
    }
   
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        
        if(getComputadora() != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
        
    }
    
    
}
