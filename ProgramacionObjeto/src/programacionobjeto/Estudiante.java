/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionobjeto;

/**
 *
 * @author lautaromarin
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificación: " + calificacion);
    }
    
    private boolean esCalificacionValida(int calificacion){
        return calificacion >= 0 && calificacion <= 10;
    }
    
    void subirCalificacion(int puntos){
        int calificacionEstimada = calificacion + puntos;
        
        if(esCalificacionValida(calificacionEstimada)){
            calificacion = calificacionEstimada;
            System.out.println("Calificación subida, calificación actual: " + calificacion);
        } else {
            System.out.println("La calificación no puede ser mayor a 10 ni menor que 0");
        }
        
        
    }
    
    void bajarCalificacion(int puntos){
        int calificacionEstimada = calificacion - puntos;
        if(esCalificacionValida(calificacionEstimada)){
            calificacion = calificacionEstimada;
            System.out.println("Calificación bajada, calificación actual: " + calificacion);
        } else {
            System.out.println("La calificación no puede ser mayor a 10 ni menor que 0");
        }
    }
    
}
