package com.ejercicio.api.ordencompra.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.ordencompra.model.Articulo;
import com.ejercicio.api.ordencompra.repositorio.ArticuloRepository;

@Service
public class ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;

	public List<Articulo> listarTodos() {
		return (List<Articulo>) articuloRepository.findAll();
	}

	public Articulo obtenerEntidad(String codigoArticulo) {
		try {
			return articuloRepository.findById(codigoArticulo).get();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public Articulo insertarModificar(Articulo articulo) {
		return articuloRepository.save(articulo);
	}

	public void eliminarEntidad(String codigoArticulo) {
		articuloRepository.deleteById(codigoArticulo);
	}
}
