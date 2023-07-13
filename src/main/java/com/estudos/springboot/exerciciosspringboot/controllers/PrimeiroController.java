package com.estudos.springboot.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping
	private String opa() {
		return "HB";
	}

	@GetMapping(path = "/1")
	private String ola() {
		return "Hebert";
	}

	@GetMapping(path = "/2")
	private String nomeCompleto() {
		return "Hebert Brito";
	}
	
	@GetMapping(path = { "/3", "/4", "/5" })
	private String loveName() {
		return "Vikas Brito";
	}
	
	
	
	
	
	
	

}
