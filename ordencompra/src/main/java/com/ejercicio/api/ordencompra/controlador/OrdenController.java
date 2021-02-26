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

import com.ejercicio.api.ordencompra.model.Orden;
import com.ejercicio.api.ordencompra.servicio.OrdenService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrdenController {

	@Autowired
	private OrdenService ordenService;

	@GetMapping("ejercicio/orden")
	public List<Orden> listar() {
		return ordenService.listarTodos();
	}

	@GetMapping("ejercicio/orden/{idOrden}")
	public Orden obtenerOrden(@PathVariable("idOrden") Integer idOrden) {
		return ordenService.obtenerEntidad(idOrden);
	}

	@PostMapping("ejercicio/orden")
	public Orden guardar(@RequestBody Orden orden) {
		return ordenService.insertarModificar(orden);
	}

	@PutMapping("ejercicio/orden")
	public Orden actualizar(@RequestBody Orden orden) {
		return ordenService.insertarModificar(orden);
	}

	@DeleteMapping("ejercicio/orden/{idOrden}")
	public void eliminar(@PathVariable("idOrden") Integer idOrden) {
		ordenService.eliminarEntidad(idOrden);
	}
}
