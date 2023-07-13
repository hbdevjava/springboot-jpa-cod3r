package com.estudos.springboot.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.springboot.exerciciosspringboot.models.Cliente;
@RestController()
@RequestMapping("/clientes")//-> toda classe mapeada para essa URL;
public class ClenteController {
	
	
	@GetMapping("/1")
	public Cliente obterCliente1() {
		return new Cliente(1, "Hebert Brito", "621.456.789-85");
	}
	
	@GetMapping("/2")
	public Cliente obterCliente2() {
		return new Cliente(2, "Vikas Brito", "652.624.414-95");
	}
	
	@GetMapping("/3")
	public Cliente obterCliente3() {
		return new Cliente(3, "Dora Brito", "null");
	}
}
