package trabajopractico4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private static int generadorID;
    
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        incrementarEmpleados();
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(15000.0);
    }
    
    //Sobrecarga de constructor
    public Empleado(String nombre, String puesto){
        this.id = generarID();
        incrementarEmpleados();
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(15000.0);
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void actualizarSalario(double salario){
        setSalario(salario);
    }
    //fin setters
    
    //Metodo sobrecargado.
    public void setSalario(){
        salario = 0;
    }
    
    //Metodo sobrecargado
    public void actualizarSalario(int porcentajeAumento){
        
        double aumentoDeSalario = salario + salario * (porcentajeAumento / 100.0);
        actualizarSalario(aumentoDeSalario);
    }
    //Fin Metodo sobrecargado.
    
    //utils
    public void incrementarEmpleados(){
        totalEmpleados++;
    }
    
        private int generarID(){
        return generadorID++;
    }
        
    public static int mostrarTotalEmpleados(){
        //se dice que retorna el total de empleados.
        return totalEmpleados;
    }
    //Fin utils

    @Override
    public String toString(){
        return "Empleado: " + nombre + "\nPuesto: " + puesto + "\nSalario: " + salario; 
    }
    
  
    
}
