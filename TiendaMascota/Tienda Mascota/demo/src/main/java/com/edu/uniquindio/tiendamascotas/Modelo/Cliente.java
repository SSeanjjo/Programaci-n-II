package com.edu.uniquindio.tiendamascotas.Modelo;

public class Cliente {

    private String nombre;
    private String telefono;
    private String correo; 
    private Mascota mascota;


    public Cliente() {


    }

    public Cliente(String nombre, String telefono, String correo, Mascota mascota) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public Mascota getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }


    
    

    
}
