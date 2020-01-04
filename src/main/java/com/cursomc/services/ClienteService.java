package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Cliente;
import com.cursomc.repositories.ClienteRepository;
import com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> resultado = repo.findById(id);
		return resultado.orElseThrow(() -> new ObjectNotFoundException(
				String.format("Objeto não encontrado! Id: %d, Tipo: %s", id, Cliente.class.getName())
		));
	}
}
