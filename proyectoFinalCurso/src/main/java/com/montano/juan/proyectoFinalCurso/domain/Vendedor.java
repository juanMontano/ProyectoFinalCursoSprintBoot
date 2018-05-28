package com.montano.juan.proyectoFinalCurso.domain;

public class Vendedor {

    String Nombre;
    Direccion direccion;

    public Vendedor(String nombre, Direccion direccion) {
        Nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
