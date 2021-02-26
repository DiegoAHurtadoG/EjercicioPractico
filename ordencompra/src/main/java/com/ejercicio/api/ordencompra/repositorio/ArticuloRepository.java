package com.ejercicio.api.ordencompra.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.api.ordencompra.model.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, String> {

}
