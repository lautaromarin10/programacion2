package Ejercicio9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class CitaMedica {
    private String fecha;
    private Double hora;
    private Paciente paciente; //unidireccional
    private Profesional profesional; //unidireccional

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    
    
}
