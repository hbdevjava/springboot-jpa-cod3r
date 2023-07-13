package com.estudos.springboot.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	@GetMapping
	private String ola() {
		return "Hebert Brito";
	}
}
