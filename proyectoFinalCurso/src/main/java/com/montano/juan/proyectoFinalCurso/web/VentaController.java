package com.montano.juan.proyectoFinalCurso.web;


import com.montano.juan.proyectoFinalCurso.domain.Venta;
import com.montano.juan.proyectoFinalCurso.service.VentaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class VentaController {

    @Autowired
    VentaService ventaService;
    //listar
    @RequestMapping(method = RequestMethod.GET)
    public List<Venta> getAllVentas() {
        return ventaService.getAllVentas();
    }
    //añadir
    @RequestMapping(method = RequestMethod.POST)
    public void addNewVenta(@RequestBody Venta venta){
        ventaService.addNewVenta(venta);
    }
    //eliminar
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void eliminarVenta(@PathVariable String id){
        ventaService.elimnarVenta(id);
    }
    //actualizar
    @RequestMapping(method = RequestMethod.PATCH)
    public void actualizarVenta(@RequestBody Venta ventaUpdate){
        ventaService.actulizarVenta(ventaUpdate);

    }
}
