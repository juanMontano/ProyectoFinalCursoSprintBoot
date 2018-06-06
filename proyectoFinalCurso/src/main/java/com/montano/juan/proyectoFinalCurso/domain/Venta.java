package com.montano.juan.proyectoFinalCurso.domain;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Venta {

    @Id
    String id;
    Vendedor vendedor;
    List<Producto> list_productos;

    public Venta(String id, Vendedor vendedor, List<Producto> list_productos) {
        this.id = id;
        this.vendedor = vendedor;
        this.list_productos = list_productos;
    }

    public Venta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Producto> getList_productos() {
        return list_productos;
    }

    public void setList_productos(List<Producto> list_productos) {
        this.list_productos = list_productos;
    }
}
