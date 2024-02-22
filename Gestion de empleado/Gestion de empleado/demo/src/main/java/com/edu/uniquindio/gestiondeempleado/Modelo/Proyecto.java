package com.edu.uniquindio.gestiondeempleado.Modelo;

import java.util.ArrayList;

public class Proyecto {

    private String nombre; 
    private String codigo; 
    private ArrayList<Empleado> empleadosAsignados;



    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
    } 

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEmpleadosAsignados(ArrayList<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }

    
    
}
