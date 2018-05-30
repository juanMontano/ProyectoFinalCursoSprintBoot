package com.montano.juan.proyectoFinalCurso.web;


import com.montano.juan.proyectoFinalCurso.domain.Venta;
import com.montano.juan.proyectoFinalCurso.service.VentaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ventas")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Venta> getAllVentas() {
        return ventaService.getAllVentas();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewVenta(@RequestBody Venta venta){
        ventaService.addNewVenta(venta);
    }
}
