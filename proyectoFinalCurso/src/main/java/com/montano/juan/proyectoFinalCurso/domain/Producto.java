package com.montano.juan.proyectoFinalCurso.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Producto {

    String nombre_producto;
    int Precio;

    public Producto(String nombre_producto, int precio) {
        this.nombre_producto = nombre_producto;
        Precio = precio;
    }

    public Producto() {
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

}
