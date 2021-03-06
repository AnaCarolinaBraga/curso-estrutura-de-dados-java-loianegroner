package com.loiane.estruturadedados.fila;

import com.loiane.estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	
}
