package com.cine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cine.model.VentaFuncion;
import com.cine.repo.IVentaFuncionRepo;
import com.cine.service.IVentaFuncionService;

public class VentaFuncionServiceImpl implements IVentaFuncionService{

	@Autowired
	private IVentaFuncionRepo repo;

	@Override
	public List<VentaFuncion> listarFuncionPorVenta(Integer idVenta) {

		return repo.listarFuncionPorVenta(idVenta);
	}
}
