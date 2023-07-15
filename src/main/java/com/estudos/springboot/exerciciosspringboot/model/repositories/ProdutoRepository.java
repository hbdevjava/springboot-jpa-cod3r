package com.estudos.springboot.exerciciosspringboot.model.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.estudos.springboot.exerciciosspringboot.model.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
//-> extends CrudRepository<Produto, Long> tb pode ser usada.(versão simples com operações basicas de CRUD)
 
	public List<Produto> findByNomeContaining(String parteNome);
//-> CASO O METODO NA EXISTA: ele pode ser implementado na interface e o springBoot se encarrega de repassar quando for chamado	
}
