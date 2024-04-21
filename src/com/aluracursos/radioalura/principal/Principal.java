package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Iniciando el proyecto Radio Alura");
        System.out.println("21 abril 2024");
        System.out.println("by sanchezluys");
        //****** CREAR CANCION
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("For Ever");
        miCancion.setAutor("Kiss");
        miCancion.muestraCancion();
        //****** CREAR PODCAST
        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela");
        miPodcast.setTitulo("Cafe.Tech");
        miPodcast.muestraPodcast();


    }
}
