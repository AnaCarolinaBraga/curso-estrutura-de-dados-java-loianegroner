package com.loiane.estruturadedados.pilha.labs;

public class Livro {

	private String nome;
	private String isbn;
	private int anoLancamento;
	private String autor;

	public Livro() {
		super();
	}

	public Livro(String nome, String isbn, int anoLancamento, String autor) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", isbn=" + isbn + ", anoLancamento=" + anoLancamento + ", autor=" + autor + "]";
	}

}
