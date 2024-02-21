package com.edu.uniquindio.tiendamascotas.Modelo;


import com.edu.uniquindio.tiendamascotas.Servicios.volar;

public class Loro extends Mascota implements volar {

    private String colorAlas;

    public Loro() {
    }

    public Loro(String nombre, String id, String colorAlas) {
        super(nombre, id);
        this.colorAlas = colorAlas;
    } 

    public String getColorAlas() {
        return colorAlas;
    }

    public void setColorAlas(String colorAlas) {
        this.colorAlas = colorAlas;
    }

    @Override

    public String informacion(){


        return (" Loro con plumas" + colorAlas + " identificado con el número: " + getId() ); 
 
         
 
     }

    @Override

    public String volar(){
        return "Estor volando: ";
    }







    
    
    
}
