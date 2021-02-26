package com.ejercicio.api.ordencompra.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.ordencompra.model.Cliente;
import com.ejercicio.api.ordencompra.repositorio.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> listarTodos() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	public Cliente obtenerEntidad(Integer idCliente) {
		try {
			return clienteRepository.findById(idCliente).get();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

	public Cliente insertarModificar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public void eliminarEntidad(Integer idCliente) {
		clienteRepository.deleteById(idCliente);
	}
}
