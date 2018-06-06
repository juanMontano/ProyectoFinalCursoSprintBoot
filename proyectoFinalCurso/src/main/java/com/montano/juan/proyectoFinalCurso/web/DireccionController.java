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

    //listar
    @RequestMapping(method = RequestMethod.GET)
    public List<Direccion> getDirections(){
        return direccionService.getAllDirection();
    }
    //añadir
    @RequestMapping(method = RequestMethod.POST)
    public void addNewDirection(@RequestBody Direccion direccion){
        direccionService.addNewDirection(direccion);
    }
    //eliminar
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteDirectionById(@PathVariable String id){
        direccionService.deleteDirectionById(id);
    }

    //actualizar
    @RequestMapping(method = RequestMethod.PATCH)
    public void actualizarDirection(@RequestBody Direccion direccionUpdate){
        direccionService.actualizarDirection(direccionUpdate);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteDirection(@RequestBody Direccion direccion){
        direccionService.deleteDirection(direccion);
    }

}
