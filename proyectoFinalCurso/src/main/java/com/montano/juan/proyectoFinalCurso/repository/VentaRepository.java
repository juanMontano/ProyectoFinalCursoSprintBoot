package com.montano.juan.proyectoFinalCurso.repository;

import com.montano.juan.proyectoFinalCurso.domain.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VentaRepository extends MongoRepository<Venta,String> {
}
