package com.loiane.estruturadedados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	
		public boolean adiciona(int posicao, T elemento) {
		
		if (!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida."); //Verifica se a posição é válida
		}
		
		this.aumentaCapacidade();
		
		for (int i=this.tamanho-1; i>=posicao; i--) { //estamos iterando o vetor de trás para frente
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;

		}
	}
	
	public T busca(int posicao) {
		if (!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida."); //Exceção especial para tipos de argumentos inválidos
		}
		
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

    	//Exercicios
	//Exercicio 1: Implementar um contem parecido com o contain do ArrayList
	public boolean contem(T elemento) {
		return busca(elemento) >= -1;
	
	}

    	//Exercicio 2: Implementar o método ultimoIndice parecido com o lastIndexOf do ArrayList
	public int ultimoIndice(T elemento) {
		for (int i = this.tamanho-1 ; i > 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

		//Exercício 3: implemente o método remove(T), onde será possível remover um elemento da lista passando o mesmo como parâmetro.
	public void remove(T elemento) {
		remove(busca(elemento));
	}

	// Exercícío 4:implemente o método obtem(int posicao), onde será possível obter o elemento dando uma posição do vetor
	public T obtem(int posicao) {
		return busca(posicao);
	}

		// Execício 5: Implementar o método limpar que tira todos os elementos da lista.
	public void limpar() {
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
		
	
	public void remove(int posicao) {
		if (!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
		
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");

		
		return s.toString();
	}
	

	

	

}
