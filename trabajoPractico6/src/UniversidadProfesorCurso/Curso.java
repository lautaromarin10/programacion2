/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesorCurso;

/**
 *
 * @author lautaromarin
 */
public class Curso {
    
    String codigo, nombre;
    private Profesor profesor;
    
    
    public void setProfesor(Profesor p) {
        // Si el profesor actual no es null y es distinto del nuevo, eliminamos la relación
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }

        // Actualizamos siempre el profesor (aunque sea null)
        this.profesor = p;

        // Si el nuevo profesor no es null y no tiene este curso, lo agregamos
        if (p != null && !p.profesorTieneEsteCurso(this)) {
            p.agregarCurso(this);
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("Curso: " + nombre + "\nCodigo: " + codigo + "\nProfesor: " + (profesor != null ? profesor : null));
    }

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
    return "Curso{" +
            "codigo='" + codigo + '\'' +
            ", nombre='" + nombre + '\'' +
            ", profesor=" + (profesor != null ? profesor : "Sin asignar") +
            '}';
    }
   
    
}
