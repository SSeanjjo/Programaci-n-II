package com.edu.uniquindio.tiendamascotas.Modelo;

import com.edu.uniquindio.tiendamascotas.Servicios.MenajeriaElectronica;

public class InventarioMensajes {

     private MenajeriaElectronica mensaje;
     private Mascota mascota; 



    public InventarioMensajes(MenajeriaElectronica mensaje) {
        this.mensaje = mensaje;
    }


    public MenajeriaElectronica getMensaje() {
        return mensaje;
    }

    public void setMensaje(MenajeriaElectronica mensaje) {
        this.mensaje = mensaje;

    }


    public void addagregarMascota(Mascota mascota){
         
    }

    public void enviarMensaje(){

        mensaje.enviarMensaje("Se ha agregado un nuevo integrante: " + mascota.getNombre()  );

    
        

    }


   





     
    
}
