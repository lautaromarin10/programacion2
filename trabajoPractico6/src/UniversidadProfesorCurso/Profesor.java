
package UniversidadProfesorCurso;
import java.util.ArrayList;

/**
 *
 * @author lautaromarin
 */
public class Profesor {
    
    String id, nombre, especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    public void agregarCurso(Curso c){
        if(!cursos.contains(c)){
            cursos.add(c);
        }
    }
    
    public void eliminarCurso(Curso c){
        if(cursos.contains(c)){
            cursos.remove(c);
        }
    }
    
    public void listarCursos(){
        for(Curso curso: cursos){
            System.out.println(curso);
        }
    }
    
    
    public boolean profesorTieneEsteCurso(Curso c){
        return cursos.contains(c);
    }
    
    public void mostrarInfo(){
        System.out.println("Profesor: " + nombre + "\nespecialidad: " + especialidad);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString(){
        return "Profesor: " + nombre + "\nespecialidad: " + especialidad;
    }
    
}
