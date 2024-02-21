package com.edu.uniquindio.tiendamascotas.Modelo;


import com.edu.uniquindio.tiendamascotas.Servicios.correr;

public class Gato extends Mascota implements correr{

    private String colorPelaje; 
    private String raza;



    
    public Gato() {
    }




    public Gato(String nombre, String id, String colorPelaje, String raza) {
        super(nombre, id);
        this.colorPelaje = colorPelaje;
        this.raza = raza;
    } 


    public String getColorPelaje() {
        return colorPelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public void setRaza(String raza) {
        
        this.raza = raza;
    }

    @Override

    public String informacion(){


       return ( " Gato de color" + colorPelaje + " identificado con el número: " + getId() ); 

        

    }

    @Override

    public String correr(){

        return "Estoy Corriendo: "; 


    }



    


    




    
}
