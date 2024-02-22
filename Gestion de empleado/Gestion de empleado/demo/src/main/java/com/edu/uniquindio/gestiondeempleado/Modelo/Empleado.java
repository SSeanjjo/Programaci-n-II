package com.edu.uniquindio.gestiondeempleado.Modelo;

public abstract class Empleado {

    private String nombre; 
    private String id; 
    private String departamento;

    
    public Empleado() {
    }


    public Empleado(String nombre, String id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    } 


    public String getDepartamento() {
        return departamento;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    

    
}
