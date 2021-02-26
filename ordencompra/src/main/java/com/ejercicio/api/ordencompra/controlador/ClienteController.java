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

import com.ejercicio.api.ordencompra.model.Cliente;
import com.ejercicio.api.ordencompra.servicio.ClienteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("ejercicio/cliente")
	public List<Cliente> listar() {
		return clienteService.listarTodos();
	}

	@GetMapping("ejercicio/cliente/{idCliente}")
	public Cliente obtenerCliente(@PathVariable("idCliente") Integer idCliente) {
		return clienteService.obtenerEntidad(idCliente);
	}

	@PostMapping("ejercicio/cliente")
	public Cliente guardar(@RequestBody Cliente cliente) {
		return clienteService.insertarModificar(cliente);
	}

	@PutMapping("ejercicio/cliente")
	public Cliente actualizar(@RequestBody Cliente cliente) {
		return clienteService.insertarModificar(cliente);
	}

	@DeleteMapping("ejercicio/cliente/{idCliente}")
	public void eliminar(@PathVariable("idCliente") Integer idCliente) {
		clienteService.eliminarEntidad(idCliente);
	}
}
