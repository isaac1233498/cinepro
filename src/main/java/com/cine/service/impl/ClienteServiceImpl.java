package com.cine.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.cine.model.Cliente;
import com.cine.repo.IClienteRepo;
import com.cine.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo repo;

	@Override
	public Cliente registrar(Cliente obj) {
		return repo.save(obj);
	}

	@Override
	public Cliente modificar(Cliente obj) {
		return repo.save(obj);
	}

	@Override
	public List<Cliente> listar() {
		return repo.findAll();
	}

	@Override
	public Cliente leerPorId(Integer id) {
		Optional<Cliente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Cliente();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	@Override
	public Page<Cliente> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
}
