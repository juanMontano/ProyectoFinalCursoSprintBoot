package com.montano.juan.proyectoFinalCurso.service;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import com.montano.juan.proyectoFinalCurso.domain.Producto;
import com.montano.juan.proyectoFinalCurso.domain.Vendedor;
import com.montano.juan.proyectoFinalCurso.domain.Venta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaService {
    private List<Venta> listaVentas=new ArrayList<>();
    private List<Producto> listaProduct=new ArrayList<>();
    private Vendedor vendedor= new Vendedor("jose",new Direccion(4,"cochabamba","petrolera","125",124587));

    public VentaService(){
        listaProduct.add(new Producto("mandarina",2));
        listaProduct.add(new Producto("platano",5));
        listaVentas.add(new Venta(vendedor,listaProduct));
    }

    public List<Venta> getAllVentas(){
        return listaVentas;
    }

    public void addNewVenta(Venta venta){
        listaVentas.add(venta);
    }
}
