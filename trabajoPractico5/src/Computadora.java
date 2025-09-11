/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre; //composición
    private Propietario propietario; //asociación bidireccional
    
    public Computadora(String marca, int numeroSerie, String modelo, String chipset){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);        
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
        
    }
    
    
    public class PlacaMadre{
        private String modelo, chipset;
        
        public PlacaMadre(String modelo, String chipset){
            this.modelo = modelo;
            this.chipset = chipset;
        }
    }
    
}
