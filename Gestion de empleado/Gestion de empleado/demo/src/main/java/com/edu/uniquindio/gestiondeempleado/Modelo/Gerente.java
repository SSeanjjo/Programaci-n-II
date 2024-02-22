package com.edu.uniquindio.gestiondeempleado.Modelo;

import java.util.ArrayList;

import com.edu.uniquindio.gestiondeempleado.Servicios.IAgregarProyecto;
import com.edu.uniquindio.gestiondeempleado.Servicios.IContribuir;

public class Gerente extends Empleado implements IContribuir, IAgregarProyecto{

    private String tituloEspecializacion;
    private ArrayList<Proyecto> proyectos; 



    

    public Gerente() {

    }


    public Gerente(String nombre, String id, String departamento, String tituloEspecializacion) {
        super(nombre, id, departamento);
        this.tituloEspecializacion = tituloEspecializacion;
        this.proyectos = new ArrayList<>(); 
    }

    public String getEspecializacion() {
        return tituloEspecializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.tituloEspecializacion = especializacion;
    }

    @Override

    public String contribucionEmpleado(){

        return " Gestionar que las direcciones de la empresa cumpla con los objetivos planeados del proyecto: "; 


        
    }

    @Override

    public void añadirProyecto(Proyecto proyecto){
        proyectos.add(proyecto); 


    }


    



    



    





    
    


    
}
