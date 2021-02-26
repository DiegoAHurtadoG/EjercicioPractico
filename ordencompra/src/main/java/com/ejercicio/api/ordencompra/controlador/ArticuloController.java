package com.ejercicio.api.ordencompra.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.api.ordencompra.model.Articulo;
import com.ejercicio.api.ordencompra.servicio.ArticuloService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;

	@GetMapping("ejercicio/articulo")
	public List<Articulo> listar() {
		return articuloService.listarTodos();
	}

	@GetMapping("ejercicio/articulo/{codigo}")
	public Articulo obtenerArticulo(@PathVariable("codigo") String codigo) {
		return articuloService.obtenerEntidad(codigo);
	}

	@PostMapping("ejercicio/articulo")
	public Articulo guardar(@RequestBody Articulo articulo) {
		return articuloService.insertarModificar(articulo);
	}

	@PutMapping("ejercicio/articulo")
	public Articulo actualizar(@RequestBody Articulo articulo) {
		return articuloService.insertarModificar(articulo);
	}

	@DeleteMapping("ejercicio/articulo/{codigo}")
	public void eliminar(@PathVariable("codigo") String codigo) {
		articuloService.eliminarEntidad(codigo);
	}
}
