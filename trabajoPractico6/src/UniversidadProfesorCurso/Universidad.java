package UniversidadProfesorCurso;
import java.util.ArrayList;

/**
 *
 * @author lautaromarin
 */
public class Universidad {
    
     String nombre;
     private ArrayList<Profesor> profesores = new ArrayList<>();
     private ArrayList<Curso> cursos = new ArrayList<>();
     
     
     public void agregarProfesor(Profesor p){
         profesores.add(p);
     }
     
     public void agregarCurso(Curso c){
         cursos.add(c);
     }
     
     public Profesor buscarProfesorPorId(String id){
         
         for(Profesor profesor: profesores){
             if(profesor.id.equals(id)){
                return profesor;
            }
         }
         
         return null;
     
     }
     
     public Curso buscarCursoPorCodigo(String codigo){
         
        for(Curso curso: cursos){
            if(curso.codigo.equals(codigo)){
               return curso;
            }
        }
        
        return null;
         
     }
     
     
     public void asignarProfesorACurso(String codigoCurso, String idProfesor){
         
         Curso cursoBuscado = buscarCursoPorCodigo(codigoCurso);
         Profesor profesorBuscado = buscarProfesorPorId(idProfesor);
         
         if(cursoBuscado != null && profesorBuscado != null){
           cursoBuscado.setProfesor(profesorBuscado);
             System.out.println("Profesor añadido con exito");
           return;
         }
         
     }
     
     public void listarProfesores(){
     
         for(Profesor profesor: profesores){
             profesor.mostrarInfo();
         }
     }
     
     public void listarCursos(){
     
         for(Curso curso: cursos){
             curso.mostrarInfo();
         }
     }
     
     public void eliminarCurso(String codigo){
         Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
         
         //Entramos al profesor del curso y le eliminamos el curso de la lista del profesor
         if(cursoAEliminar != null){
           cursoAEliminar.getProfesor().eliminarCurso(cursoAEliminar);
             //eliminamos el curso de la lista;
            cursos.remove(cursoAEliminar);
         }
       
     }
     
     public void eliminarProfesor(String id){
         
         Profesor profesorAEliminar = buscarProfesorPorId(id);
         
         if(profesorAEliminar != null){
             
             //iteramos la lista de cursos del profesor y los dejamos en null
             for(Curso curso: profesorAEliminar.getCursos()){
                 curso.setProfesor(null);
             }

             profesores.remove(profesorAEliminar);
         }
      
     }
     
     public void reporteDeCantidadDeCursosDeLosProfesores(){
         
         for(Profesor profesor: profesores){
             
             System.out.println("Profesor: " + profesor.nombre + " tiene " + profesor.getCursos().size() + " cursos");
             
         }
     
     }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
     
     
    
}
