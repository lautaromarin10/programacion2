/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author lautaromarin
 */
public class TrabajoPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciamos los empleados
        Empleado lautaro = new Empleado("Lautaro", "Developer");
        Empleado matias = new Empleado(10, "Matias", "Developer Senior", 1500.000);
        
        //imprimimos la información
        System.out.println(lautaro.toString());
        System.out.println(matias.toString());
        
        //mostramos el totalDeEmpleados
        System.out.println(Empleado.mostrarTotalEmpleados()); //2
    }
    
}
