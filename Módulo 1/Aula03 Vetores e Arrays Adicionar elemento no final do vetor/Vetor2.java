package com.loiane.estruturadedados.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adiciona(String elemento) throws Exception {
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
		}
				
	}
}