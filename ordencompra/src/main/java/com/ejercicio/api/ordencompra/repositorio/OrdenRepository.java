package com.ejercicio.api.ordencompra.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.api.ordencompra.model.Orden;

@Repository
public interface OrdenRepository extends CrudRepository<Orden, Integer> {

}
