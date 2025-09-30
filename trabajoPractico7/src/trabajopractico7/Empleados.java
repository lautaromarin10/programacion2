package trabajopractico7;
import Empleados.EmpleadoPlanta;
import Empleados.EmpleadoTemporal;
import Empleados.Empleado;
import java.util.ArrayList;

public class Empleados {


    public static void main(String args[]) {
       
        EmpleadoPlanta empleadoPlanta = new EmpleadoPlanta("Lautaro", 10000);
        EmpleadoPlanta empleadoPlanta2 = new EmpleadoPlanta("Melany", 12000);
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("Carlos", 6000);
        EmpleadoTemporal empleadoTemporal2 = new EmpleadoTemporal("Marcos", 4000);
        
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        listaEmpleados.add(empleadoPlanta);        
        listaEmpleados.add(empleadoPlanta2);        
        listaEmpleados.add(empleadoTemporal);        
        listaEmpleados.add(empleadoTemporal2);        
        
        for(Empleado empleado: listaEmpleados){
            if(empleado instanceof EmpleadoPlanta){
                System.out.println("Empleado de planta con sueldo de $"+ empleado.calcularSueldo());
            } else if(empleado instanceof EmpleadoTemporal){
                System.out.println("Empleado temporal con sueldo de $"+ empleado.calcularSueldo());
            }
        }
        
    }
}
