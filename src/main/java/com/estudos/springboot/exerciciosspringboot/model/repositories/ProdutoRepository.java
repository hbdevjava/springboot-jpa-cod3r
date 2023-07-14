package com.estudos.springboot.exerciciosspringboot.model.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.estudos.springboot.exerciciosspringboot.model.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
//-> extends CrudRepository<Produto, Long> tb pode ser usada.
}
