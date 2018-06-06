package com.montano.juan.proyectoFinalCurso.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Direccion {

    @Id
    String id;
    String departamento;
    String nombre_calle;
    String n_Casa;
    int telefono;

    public Direccion(String id, String departamento, String nombre_calle, String n_Casa, int telefono) {
        this.id = id;
        this.departamento = departamento;
        this.nombre_calle = nombre_calle;
        this.n_Casa = n_Casa;
        this.telefono = telefono;
    }

    public Direccion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public String getN_Casa() {
        return n_Casa;
    }

    public void setN_Casa(String n_Casa) {
        this.n_Casa = n_Casa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
