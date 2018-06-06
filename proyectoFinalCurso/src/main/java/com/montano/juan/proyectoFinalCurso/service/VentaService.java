package com.montano.juan.proyectoFinalCurso.service;

import com.montano.juan.proyectoFinalCurso.domain.Venta;
import com.montano.juan.proyectoFinalCurso.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public VentaService() {
    }

    //listar
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }
    //añadir
    public void addNewVenta(Venta venta) {
        ventaRepository.save(venta);
    }
    //eliminar
    public void elimnarVenta(String id){
        ventaRepository.deleteById(id);
    }
    //actulizar
    public void actulizarVenta(Venta ventaUpdate){
        ventaRepository.save(ventaUpdate);
    }
}
