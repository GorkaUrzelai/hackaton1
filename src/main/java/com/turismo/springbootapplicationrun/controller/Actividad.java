package com.turismo.springbootapplicationrun.controller;

public class Actividad {

    int coste, duracion;
    String lugar, nombre;
    String categoria;
    String imagen;

    public Actividad(String nombre,String imagen, String categoria, int coste, int duracion, String lugar) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.lugar = lugar;
        this.categoria = categoria;
        this.coste = coste;
        this.duracion = duracion;
    }

    public int getCoste() {
        return coste;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getImagen() {
        return imagen;
    }
}
