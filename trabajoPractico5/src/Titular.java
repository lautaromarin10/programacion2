/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Titular {
    
      private String nombre;
      private int dni;
      
      //asociacion bidireccional
      private Pasaporte pasaporte;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
    this.pasaporte = pasaporte;
}
      
      
      public Titular(String nombre,int dni){
        setNombre(nombre);
        setDni(dni);
      }
      
}
