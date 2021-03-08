package com.claro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.claro.model.Cliente;
import com.claro.repository.Clienterepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private Clienterepository clienterepository;
	
	@GetMapping
	public List<Cliente> listar() {
	return clienterepository.findAll();
}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienterepository.save(cliente);
	}
	
}