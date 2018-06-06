package com.montano.juan.proyectoFinalCurso.repository;

import com.montano.juan.proyectoFinalCurso.domain.Direccion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DirectionRepository extends MongoRepository<Direccion,String> {
}
