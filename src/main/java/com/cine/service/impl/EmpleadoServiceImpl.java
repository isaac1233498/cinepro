package com.cine.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cine.model.Empleado;
import com.cine.repo.IEmpleadoRepo;
import com.cine.service.IEmpleadoService;

public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo repo;

	@Override
	public Empleado registrar(Empleado obj) {
		return repo.save(obj);
	}

	@Override
	public Empleado modificar(Empleado obj) {
		return repo.save(obj);
	}

	@Override
	public List<Empleado> listar() {
		return repo.findAll();
	}

	@Override
	public Empleado leerPorId(Integer id) {
		Optional<Empleado> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Empleado();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
}
