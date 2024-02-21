package com.edu.uniquindio.tiendamascotas;

import com.edu.uniquindio.tiendamascotas.Modelo.Gato;
import com.edu.uniquindio.tiendamascotas.Modelo.Perro;
import com.edu.uniquindio.tiendamascotas.Modelo.TiendaMascota;

public class Main {
    public static void main(String[] args) {
        

        Gato gato = new Gato("Gris ", "7 ", "Gris", "Criollo "); 
        

        Perro perro = new Perro("Tomy: ", "3 :", "Grande ", "Lobo Siberiano"); 
        
        System.out.println(perro.correr());



        TiendaMascota tiendaMascota = new TiendaMascota(); 
        tiendaMascota.agregarMascota(perro);
        tiendaMascota.mostrarMascota();


        

        


        
       


    } 


}