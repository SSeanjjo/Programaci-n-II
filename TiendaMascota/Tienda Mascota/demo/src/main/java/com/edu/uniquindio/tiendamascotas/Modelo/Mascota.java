package com.edu.uniquindio.tiendamascotas.Modelo;

public abstract class Mascota {

    private String nombre;
    private String id; 

    public Mascota() {
    }

    public Mascota(String nombre, String id) {
        this.nombre = nombre;
        this.id = id; 
    } 


    public String getNombre() {
        return nombre;

    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public abstract String informacion(); 

    


    


    
}
