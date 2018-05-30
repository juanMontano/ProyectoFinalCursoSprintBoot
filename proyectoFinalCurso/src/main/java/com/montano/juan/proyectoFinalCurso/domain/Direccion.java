package com.montano.juan.proyectoFinalCurso.domain;

import java.util.List;

public class Direccion {

    int id;
    String departamento;
    String nombre_calle;
    String n_Casa;
    int telefono;

    public Direccion(int id, String departamento, String nombre_calle, String n_Casa, int telefono) {
        this.id = id;
        this.departamento = departamento;
        this.nombre_calle = nombre_calle;
        this.n_Casa = n_Casa;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
