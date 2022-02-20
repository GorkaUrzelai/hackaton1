package com.turismo.springbootapplicationrun.controller;



public class Datos {

    int duracion, cantidadPersonas, presupuesto;
    String rangoDeEdad, tipo_grupo;

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getRangoDeEdad() {
        return rangoDeEdad;
    }

    public String getTipo_grupo() {
        return tipo_grupo;
    }

    public void setTipo_grupo(String tipo_grupo) {
        this.tipo_grupo = tipo_grupo;
    }

    public void setRangoDeEdad(String rangoDeEdad) {
        this.rangoDeEdad = rangoDeEdad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
