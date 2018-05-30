package com.montano.juan.proyectoFinalCurso.web;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import com.montano.juan.proyectoFinalCurso.service.DireccionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direction")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class DireccionController {

    @Autowired
    DireccionService direccionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Direccion> getDirections(){
        return direccionService.getAllDirection();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewDirection(@RequestBody Direccion direccion){
        direccionService.addNewDirection(direccion);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteDirection(@PathVariable int id){
        direccionService.deleteDirection(id);
    }

}
