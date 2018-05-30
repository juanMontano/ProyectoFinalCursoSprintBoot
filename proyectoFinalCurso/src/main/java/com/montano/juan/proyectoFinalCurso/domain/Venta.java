package com.montano.juan.proyectoFinalCurso.domain;

import java.util.List;

public class Venta {

    Vendedor vendedor;
    List<Producto> list_productos;

    public Venta(Vendedor vendedor, List<Producto> list_productos) {
        this.vendedor = vendedor;
        this.list_productos = list_productos;
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
