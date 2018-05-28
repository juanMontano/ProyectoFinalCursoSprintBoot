package com.montano.juan.proyectoFinalCurso.web;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import com.montano.juan.proyectoFinalCurso.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/direction")
public class DireccionController {

    @Autowired
    DireccionService direccionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Direccion> getDirections(){
        return direccionService.getAllDirection();
    }

}
