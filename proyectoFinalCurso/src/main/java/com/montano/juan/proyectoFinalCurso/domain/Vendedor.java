package com.montano.juan.proyectoFinalCurso.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Vendedor {
 @Id
 String id;
    String Nombre;
    Direccion direccion;

    public Vendedor(String id, String nombre, Direccion direccion) {
        this.id = id;
        Nombre = nombre;
        this.direccion = direccion;
    }

    public Vendedor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
