package com.ejercicio.api.ordencompra.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.ordencompra.model.Articulo;
import com.ejercicio.api.ordencompra.model.Orden;
import com.ejercicio.api.ordencompra.model.OrdenArticulo;
import com.ejercicio.api.ordencompra.model.OrdenArticuloPK;
import com.ejercicio.api.ordencompra.repositorio.ArticuloRepository;
import com.ejercicio.api.ordencompra.repositorio.OrdenArticuloRepository;
import com.ejercicio.api.ordencompra.repositorio.OrdenRepository;

@Service
public class OrdenService {

	@Autowired
	private OrdenRepository ordenRepository;

	@Autowired
	private OrdenArticuloRepository ordenArticuloRepository;

	@Autowired
	private ArticuloRepository articuloRepository;

	public List<Orden> listarTodos() {
		return (List<Orden>) ordenRepository.findAll();
	}

	public Orden obtenerEntidad(Integer idOrden) {
		try {
			return ordenRepository.findById(idOrden).get();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public Orden insertarModificar(Orden orden) {
		Orden nuevaOrden = ordenRepository.save(orden);
		for (OrdenArticulo articulo : orden.getOrdenArticulos()) {
			OrdenArticuloPK ordenArticuloPK = new OrdenArticuloPK(nuevaOrden.getIdOrden(),
					articulo.getArticulo().getCodigoArticulo());
			OrdenArticulo ordenArticulo = new OrdenArticulo();
			ordenArticulo.setOrdenArticuloPK(ordenArticuloPK);
			ordenArticuloRepository.save(ordenArticulo);

			try {
				Articulo art = articuloRepository.findById(articulo.getArticulo().getCodigoArticulo()).get();

				art.setStockArticulo(art.getStockArticulo() - articulo.getCantidadArticulo());
				articuloRepository.save(art);
			} catch (Exception e) {
				System.err.println("Error en articulo");
			}
		}
		return nuevaOrden;
	}

	public void eliminarEntidad(Integer idOrden) {
		ordenRepository.deleteById(idOrden);
	}
}
