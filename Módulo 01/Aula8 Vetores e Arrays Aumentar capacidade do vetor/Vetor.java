package com.loiane.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	//Adiciona elementos dentro do vetor
	public boolean adiciona(String elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//Adiciona elementos dentro de determinada posição no vetor
	public boolean adiciona(int posicao, String elemento) {
		
		if (!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida."); //Verifica se a posição é válida
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--) { //estamos iterando o vetor de trás para frente
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	//Para aumentar a capacidade do vetor
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;

		}
	}
	
	//Retorna o elemento de determinada posição. Também verifica se posição solicitada é válida.
	public String busca(int posicao) {
		if (!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida."); //Exceção especial para tipos de argumentos inválidos
		}
		
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) {
		for (int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//Para retornar o tamanho real do nosso vetor
	public int tamanho() {
		return this.tamanho;
	}

	//Para retornar os elementos reais do nosso vetor
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