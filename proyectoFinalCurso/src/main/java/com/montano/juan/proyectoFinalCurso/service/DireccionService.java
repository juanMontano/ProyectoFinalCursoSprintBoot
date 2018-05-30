package com.montano.juan.proyectoFinalCurso.service;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;

@Service
public class DireccionService {

    private List<Direccion> listDirection =new ArrayList<>();

    public DireccionService() {
        listDirection.add(new Direccion(0,"cochabamba","uruguay","123",5478));
        listDirection.add(new Direccion(1,"cochabamba","san martin","58",589));
    }

    //CRUD de direction
    public List<Direccion> getAllDirection(){
     return listDirection;
  }
public void addNewDirection(Direccion direccion){
        listDirection.add(direccion);
}
public void deleteDirection(int id){
        listDirection.remove(id);
}
}
