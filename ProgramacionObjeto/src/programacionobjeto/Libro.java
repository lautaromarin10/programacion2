/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionobjeto;

/**
 *
 * @author lautaromarin
 */
public class Libro {
    
    private String titulo, autor;
    private int añoPublicacion;
    
    private boolean esAñoValido(int año){
        return año >= 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    

    public void setAñoPublicacion(int añoPublicacion) {
        
        if(esAñoValido(añoPublicacion)){
            this.añoPublicacion = añoPublicacion;
            System.out.println("El año de publicación se actualizo");
        } else {
            System.out.println("El año de publicación no puede ser menor a 0");
        }
    }
    
    
    
}
