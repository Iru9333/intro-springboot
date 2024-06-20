package com.keepcoding.api.app.service;

import java.util.List;
import com.keepcoding.api.app.entity.Cliente;

public interface ClienteService {
	//metodo para devolver todos los clientes
	public List<Cliente> buscarTodos();
	
	//metodo que devuelve cliente por id
	public Cliente buscarPorId(Long id);
	
	//metodo para registrar un cliente
	public Cliente guardar(Cliente cliente);
	

}
