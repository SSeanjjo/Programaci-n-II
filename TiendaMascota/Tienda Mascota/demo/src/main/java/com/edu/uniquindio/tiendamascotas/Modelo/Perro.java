package com.edu.uniquindio.tiendamascotas.Modelo;


import com.edu.uniquindio.tiendamascotas.Servicios.correr;

public class Perro extends Mascota implements correr{
    
    private String tamaño; 
    private String raza;

    public Perro() {

    }


    public Perro(String nombre, String id, String tamaño, String raza) {
        super(nombre, id);
        this.tamaño = tamaño;
        this.raza = raza;
    }





    public String getTamaño() {
        return tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    

    
    public String informacion() {

        return "  Perro de raza: " + raza + " identificado con el número: " + getId();
    }

    

    @Override

    public String correr(){

        return "Estoy Corriendo: "; 


    }

    

    

    



    


}
