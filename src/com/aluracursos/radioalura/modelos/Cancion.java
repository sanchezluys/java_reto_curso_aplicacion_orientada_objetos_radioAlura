package com.aluracursos.radioalura.modelos;

public class Cancion extends Audio{
    private String album;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void muestraCancion(){
        System.out.println("** CANCION REGISTRADA **");
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("** ****************** **");
    }

    @Override
    public int getClasificacion() {
        if(getTotalMeGusta() > 5000){
            return 8;
        }
        else
        {
            return 4;
        }
    }
}
