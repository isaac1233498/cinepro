package com.cine.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cine.exception.ModeloNotFoundException;
import com.cine.model.Cliente;
import com.cine.service.IClienteService;

/*@RestController
@RequestMapping("/cliente")*/
public class ClienteController {
/*
	@Autowired
	public IClienteService service;

	@GetMapping
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente> lista = service.listar();
		return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable("id") Integer id) {
		Cliente cli = service.leerPorId(id);
		if (cli.getIdCliente() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
	}

	// nivel 1
	@GetMapping("/pageable")
	public ResponseEntity<Page<Cliente>> listarPageable(Pageable pageable) {
		Page<Cliente> clientes = service.listarPageable(pageable);
		return new ResponseEntity<Page<Cliente>>(clientes, HttpStatus.OK);
	}

	//Nivel 2 
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Cliente cliente) {
		Cliente cli = service.registrar(cliente);
		// cliente /4
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(cliente.getIdCliente()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	@PutMapping
	public ResponseEntity<Cliente> modificar(@Valid @RequestBody Cliente cliente){
		Cliente cli = service.modificar(cliente);
		return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id]")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Cliente cli = service.leerPorId(id);
		if (cli.getIdCliente() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id); 
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
*/
}
