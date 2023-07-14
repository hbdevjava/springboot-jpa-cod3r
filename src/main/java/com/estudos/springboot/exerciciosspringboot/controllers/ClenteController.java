package com.estudos.springboot.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.springboot.exerciciosspringboot.models.Cliente;

/**
 * @PathVariable é uma anotação do Spring Framework que é utilizada para mapear
 *               variáveis de modelo em URI de solicitação e usá-las como
 *               parâmetros de método. É utilizado quando o valor da variável é
 *               passada diretamente na URL. Já a anotação @RequestParam serve
 *               para pegar um trecho da url que geralmente é dinâmico.
 * 
 * @RequestParam é uma anotação do Spring Framework que é utilizada para extrair
 *               parâmetros de consulta da URL. Por exemplo, se você tem uma URL
 *               como http://localhost:8080/topicos?curso=Java, você pode
 *               usar @RequestParam para extrair o valor do parâmetro “curso” da
 *               URL
 */

@RestController
@RequestMapping("/clientes") // -> toda classe mapeada para essa URL;
public class ClenteController {

//	@GetMapping("/1")
//	public Cliente obterCliente1() {
//		return new Cliente(1, "Hebert Brito", "621.456.789-85");
//	}
//	
//	@GetMapping("/2")
//	public Cliente obterCliente2() {
//		return new Cliente(2, "Vikas Brito", "652.624.414-95");
//	}
//	
//	@GetMapping("/3")
//	public Cliente obterCliente3() {
//		return new Cliente(3, "Dora Brito", "null");
//	}

//	@GetMapping("/{id}")
//	public Cliente obterClientePorId(@PathVariable Integer id) {
//		return new Cliente(id, "Hebert Brito", "897.456.123-00");
//	}

	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam(name = "id") Integer id) {// ->
																				// http://localhost:8080/clientes?id=123
		return new Cliente(id, "Vikas Brito", "222.333.444.55");
	}
}
