package com.edu.uniquindio.tiendamascotas.Modelo;

import java.util.ArrayList;

public class TiendaMascota {


    private ArrayList<Mascota> mascotas;
   

    public TiendaMascota() {
        this.mascotas = new ArrayList<>();
       
    }
     
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    
   

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public boolean agregarMascota(Mascota mascota){
        return mascotas.add(mascota);

    }
    public void mostrarMascota(){
        System.out.println("Las mascotas registradas son : ");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
            
            
        }
    }
    

       
    



   




    






    
}
