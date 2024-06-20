package com.keepcoding.api.app.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.keepcoding.api.app.entity.Cliente;
import com.keepcoding.api.app.repository.ClienteRepository;
import com.keepcoding.api.app.service.ClienteService;
import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	@Transactional
	public List<Cliente> buscarTodos() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	@Transactional
	public Cliente guardar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}


}
