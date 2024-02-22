package com.edu.uniquindio.gestiondeempleado.Modelo;

import com.edu.uniquindio.gestiondeempleado.Servicios.IContribuir;

public class Tecnico extends Empleado implements IContribuir{

    private String tituloTecnologo;

    public Tecnico() {

    }

    public Tecnico(String nombre, String id, String departamento, String tituloTecnologo) {
        super(nombre, id, departamento);
        this.tituloTecnologo = tituloTecnologo;
    } 

    public String getTituloTecnologo() {
        return tituloTecnologo;
    }
    
    public void setTituloTecnologo(String tituloTecnologo) {
        this.tituloTecnologo = tituloTecnologo;
    }

    @Override

    public String contribucionEmpleado(){

        return " Cumplir con las tareas puntuales que le sujiere su jefe directo: "; 
    } 


    


    
}
