/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionobjeto;

/**
 *
 * @author lautaromarin
 */
public class NaveEspacial {
    
    String nombre;
    int combustible;
    
    //auxiliares
    private int limiteCarga = 100;
    private boolean enTierra = true;
    
    private boolean tengoCombustible(){
        //no puedo despegar ni avanzar sin combustible
        return combustible > 0;
    }
    
    private boolean puedoAvanzarHacia(int distancia){
        return combustible >= distancia && !enTierra;
    }
    
    private boolean puedoRecargar(int cantidad){
        return combustible + cantidad <= limiteCarga;
    }
   
    
    void despegar(){
        if(tengoCombustible() && enTierra){
            System.out.println("Despegando");
            enTierra = false;
        } else {
            System.out.println("No tenes combustible o ya estas volando");
        }
    }
    
    
    void avanzar(int distancia){
        
        if(puedoAvanzarHacia(distancia)){
            System.out.println("Avanzamos");
            combustible = combustible - distancia;
        } else {
            System.out.println("No podemos avanzar esa distancia porque nuestro combustible no nos permite llegar");
        }
        
    }
    
    void recargarCombustible(int cantidad){
        if(puedoRecargar(cantidad)){
            combustible = combustible + cantidad;
            System.out.println("Recargamos combustible\nCombustible actual: " + combustible);
        } else {
            System.out.println("No podemos recargar esa cantidad porque supera el limite");
        }
    }
    
    void mostrarEstado(){
        System.out.println("La nave " + nombre + " tiene " + combustible + " cantidad de combustible");
    }
    
}
