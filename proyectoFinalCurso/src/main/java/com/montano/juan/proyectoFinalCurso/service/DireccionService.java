package com.montano.juan.proyectoFinalCurso.service;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import com.montano.juan.proyectoFinalCurso.repository.DirectionRepository;
import com.sun.javafx.scene.traversal.Direction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService {

    @Autowired
    private DirectionRepository directionRepository;

    public DireccionService() {
    }

    //CRUD
    //listar Todos
    public List<Direccion> getAllDirection() {
        return directionRepository.findAll();
    }
     //añadir
    public void addNewDirection(Direccion direccion) {
        directionRepository.save(direccion);
    }
  //eliminar
    public void deleteDirectionById(String id) {
        directionRepository.deleteById(id);
    }
    //actualizar
    public void actualizarDirection(Direccion direccionUpdate){
        directionRepository.save(direccionUpdate);
    }
    public void deleteDirection(Direccion direction){
        directionRepository.delete(direction);
    }


}
