package programacionobjeto;

/**
 *
 * @author lautaromarin
 */
public class ProgramacionObjeto {

    public static void main(String[] args) {
        
        //Estudiantes
        Estudiante lautaro = new Estudiante();
        
        lautaro.nombre = "Lautaro";
        lautaro.apellido = "Marin";
        lautaro.curso = "Programación";
        lautaro.calificacion = 10;
        
        lautaro.mostrarInfo();
        lautaro.bajarCalificacion(2);
        lautaro.subirCalificacion(10); //no se puede porque se excede de la calificacion 10
        lautaro.subirCalificacion(1); // se puede ya que da 9
        
        
        //Mascota
        Mascota luz = new Mascota();
        
        luz.nombre = "Luz";
        luz.especie = "Perro";
        luz.edad = 12;
        
        luz.mostrarInfo();
        luz.cumplirAnios();
        
        //Libro
        Libro fahrenheit451 = new Libro();
        
        System.out.println(fahrenheit451.getAñoPublicacion()); //0
        
        fahrenheit451.setAñoPublicacion(1954); //seteamos una fecha valida
        System.out.println(fahrenheit451.getAñoPublicacion()); //retorna 1954
        
        fahrenheit451.setAñoPublicacion(-100); //Mensaje: El año de publicación no puede ser menor a 0
        
        
       //Gallinas
       Gallina turuleca = new Gallina();
       Gallina pepita = new Gallina();
               
        //turuleca
       turuleca.idGallina = 1;
       turuleca.edad = 2;
       turuleca.huevosPuestos = 20;
       
       turuleca.envejecer();
       turuleca.ponerHuevo();
       
        //pepita
       pepita.idGallina = 2;
       pepita.edad = 1;
       pepita.huevosPuestos = 5;
       
       pepita.ponerHuevo();
       pepita.ponerHuevo();
       
       turuleca.mostrarEstado();
       pepita.mostrarEstado();
       
       //Nave espacial
       NaveEspacial nave1 = new NaveEspacial();
       
       nave1.nombre = "Apolo";
       nave1.combustible = 50;
       
       nave1.despegar();
       nave1.avanzar(40); //avance 40 unidades, 10 de combustible restante
       nave1.avanzar(30); //no pude avanzar porque no llego con el combustible
       nave1.recargarCombustible(80); //recargue combustible, tengo 60 ahora
       nave1.avanzar(50);
       nave1.mostrarEstado();
       
    }
    
}
