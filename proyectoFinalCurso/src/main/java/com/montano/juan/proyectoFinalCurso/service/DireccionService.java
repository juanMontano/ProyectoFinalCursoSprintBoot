package com.montano.juan.proyectoFinalCurso.service;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DireccionService {
  public List<Direccion> getAllDirection(){
      List<Direccion> directions= new ArrayList<>();
      directions.add(new Direccion("cochabamba","uruguay","123",5478));
      directions.add(new Direccion("cochabamba","san martin","58",589));
      return directions;
  }
}
