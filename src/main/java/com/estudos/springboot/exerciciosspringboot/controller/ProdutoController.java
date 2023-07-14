package com.estudos.springboot.exerciciosspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.springboot.exerciciosspringboot.model.entities.Produto;
import com.estudos.springboot.exerciciosspringboot.model.repositories.ProdutoRepository;

/**
 * @ResponseBody é uma anotação do Spring MVC que indica que o valor retornado
 *               pelo método deve ser vinculado diretamente ao corpo da resposta
 *               HTTP em vez de ser vinculado a um modelo e renderizado em uma
 *               visualização
 */

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	//-> permite que o Spring resolva e injete automaticamente as dependências.
	//-> O Spring cria esse objeto "produtoRepository" e injeta nela metodos e comportamentos


	@PostMapping
	@ResponseBody
	public Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;
	}
	

}
