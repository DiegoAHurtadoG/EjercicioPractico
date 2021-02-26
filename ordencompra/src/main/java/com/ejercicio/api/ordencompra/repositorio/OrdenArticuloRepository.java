package com.ejercicio.api.ordencompra.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.api.ordencompra.model.OrdenArticulo;
import com.ejercicio.api.ordencompra.model.OrdenArticuloPK;

@Repository
public interface OrdenArticuloRepository extends CrudRepository<OrdenArticulo, OrdenArticuloPK> {

}
