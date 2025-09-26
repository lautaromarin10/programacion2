package trabajopractico6;

import UniversidadProfesorCurso.Curso;
import UniversidadProfesorCurso.Profesor;
import UniversidadProfesorCurso.Universidad;

/**
 *
 * @author lautaromarin
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        //1 - creo 3 profesores y 5 cursos
        Profesor profesor1 = new Profesor("lautm", "Lautaro", "Programación");
        Profesor profesor2 = new Profesor("melan", "Melany", "Contadora");
        Profesor profesor3 = new Profesor("valen", "Valentina", "Turismo");
       
        Curso curso1 = new Curso("prog1", "Introducción a la programación");
        Curso curso2 = new Curso("exc4", "Excel avanzado");
        Curso curso3 = new Curso("poo", "Programación orientada a obbjetos");
        Curso curso4 = new Curso("geo4", "Geografia avanzada");
        Curso curso5 = new Curso("exc1", "Funciones en Excel");
        
        //2- Agrego los cursos a la universidad y los profesores
        Universidad universidad = new Universidad("UTN");
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        
        //3 - Asigno profesores a cursos usando asignarProfesorACurso
        universidad.asignarProfesorACurso("prog1", "lautm");
        universidad.asignarProfesorACurso("poo", "lautm");
        
        universidad.asignarProfesorACurso("exc4", "melan");
        universidad.asignarProfesorACurso("exc1", "melan");
        
        universidad.asignarProfesorACurso("geo4", "valen");
        
        //4 - listar cursos con su profesor y profesores con sus cursos
        
        universidad.listarProfesores();
        universidad.listarCursos();
        
        //5 - Cambiar el profesor de un curso y verificar que ambos lados queden sincronizxados
        curso1.mostrarInfo(); //lautaro
        curso1.setProfesor(profesor3); //cambia de lautaro a valentina
        curso1.mostrarInfo(); //el curso muestra que valentina es la profesora
        profesor1.listarCursos(); //lautaro ya no tiene introducción a la programación
        
        //6 - remuevo un curso y veo que ya no aparece en la lista del profesor
        universidad.eliminarCurso("geo4"); //elminimo geografia avanzada
        universidad.listarCursos(); //ya no existe
        profesor3.listarCursos(); //valentina y ano tiene geografia avanzada
        
        //7 - remuevo un profesor y dejar profesor = null en los cursos
        System.out.println("Punto 7");
        universidad.eliminarProfesor("melan"); //borro a melany
        universidad.listarProfesores(); //ya no aparece melany en la lista de profesores
        universidad.listarCursos(); //profesor en null de los cursos dados por melany
        
        //8 - reporte de cursos por profesor
        universidad.reporteDeCantidadDeCursosDeLosProfesores();
        
    }
}
