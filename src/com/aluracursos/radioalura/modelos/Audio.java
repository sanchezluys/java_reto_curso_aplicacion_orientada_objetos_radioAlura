package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private String autor;
    private int duracion;
    private int totalMeGusta;
    private int totalReproducciones;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void reproduce() {
        this.totalReproducciones++;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}


