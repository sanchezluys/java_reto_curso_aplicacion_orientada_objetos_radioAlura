package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
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
        //** darle me gusta a la cancion
        for (int i = 0; i < 500 ; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        //***
        System.out.println("Total me gustas de "+miCancion.getTitulo()+" son: "+miCancion.getTotalMeGusta());
        System.out.println("Total de reproducciones de "+miCancion.getTitulo()+" son "+miCancion.getTotalReproducciones());
        //**
        //** darle me gusta al podcast
        for (int i = 0; i < 100 ; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
