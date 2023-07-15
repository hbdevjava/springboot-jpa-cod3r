package com.estudos.springboot.exerciciosspringboot.model.entities;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * A interface Serializable é uma interface de marcador em Java que é usada para
 * “marcar” classes Java para que os objetos dessas classes possam obter certa
 * capacidade. A serialização em Java é o processo no qual a instância de um
 * objeto é transformada em uma sequência de bytes e é útil quando precisamos
 * enviar objetos pela rede, salvar no disco ou comunicar de uma JVM com outra.
 * 
 * -> "MODEL == SERVICE"
 * 
 */

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank//-> valida != vazio
	private String nome;
	
	@Min(0)
	private Double preco;	
	
	@Min(0)
	@Max(1)
	private Double desconto;
	

	public Produto() {

	}

	public Produto(String nome, Double preco, Double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id;
	}

}
