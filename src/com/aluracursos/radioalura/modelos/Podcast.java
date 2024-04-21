package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripcion;

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void muestraPodcast(){
        System.out.println("*** PODCAST REGISTRADO ***");
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Presentador(a): "+this.getPresentador());
    }
}
