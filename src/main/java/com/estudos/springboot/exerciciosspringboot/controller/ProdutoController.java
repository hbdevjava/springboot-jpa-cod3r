package com.estudos.springboot.exerciciosspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.springboot.exerciciosspringboot.model.entities.Produto;
import com.estudos.springboot.exerciciosspringboot.model.repositories.ProdutoRepository;

import jakarta.validation.Valid;

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
	// -> permite que o Spring resolva e injete automaticamente as dependências.
	// -> O Spring cria esse objeto "produtoRepository" e injeta nela metodos e
	// comportamentos

//	@PostMapping
//	@ResponseBody
//	public Produto novoProduto(@RequestParam String nome, 
//			@RequestParam Double preco, 
//			@RequestParam Double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//	}

//  SIMPLIFICANDO O CODIGO ACIMA
//	@PostMapping
//	@ResponseBody
//	public Produto novoProduto(@Valid Produto produto) {// -> @Valid valida as regras definidas pela anotation
//		produtoRepository.save(produto);
//		return produto;
//	}

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	@ResponseBody
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	@ResponseBody
	public List<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
//		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNomeLike(parteNome);
	}
	
	

	@GetMapping("/{id}")
	@ResponseBody
	public Optional<Produto> obterProdutoPorId(@PathVariable Long id) {
		return produtoRepository.findById(id);
	}

//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//
//	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public void delete(@PathVariable Long id) {
		produtoRepository.deleteById(id);
		
	}
	
	

}
