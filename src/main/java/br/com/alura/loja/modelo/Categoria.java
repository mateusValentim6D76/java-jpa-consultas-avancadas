package br.com.alura.loja.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

	@EmbeddedId
	private CategoriaId id;

	public Categoria() {
	}

	public Categoria(String nome) {
		this.id = new CategoriaId(nome, "xpto");
	}

	/*
	 * Delegated method
	 */
	public String getNome() {
		return this.id.getNome();
	}
	
	public String getTipo() {
		return this.id.getTipo();
	}

}
