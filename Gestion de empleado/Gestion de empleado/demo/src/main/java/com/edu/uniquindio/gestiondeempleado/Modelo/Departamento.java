package com.edu.uniquindio.gestiondeempleado.Modelo;

import java.util.ArrayList;

public class Departamento {

    private String nombre; 
    private String codigo; 
    private ArrayList<Empleado> empleados;

    public Departamento() {


    }

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = new ArrayList<>();
    } 

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    
    



    
}
