package com.edu.uniquindio.gestiondeempleado.Modelo;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Proyecto> proyectos;

    public Empresa() {

        this.proyectos = new ArrayList<>();
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }
    
    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }


    
    
}
