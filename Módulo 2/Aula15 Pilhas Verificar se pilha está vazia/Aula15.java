package com.loiane.estruturadedados.pilha.teste;

import com.loiane.estruturadedados.pilha.Pilha;

public class Aula15 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());
	}

}