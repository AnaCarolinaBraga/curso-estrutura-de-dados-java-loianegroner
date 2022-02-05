package com.loiane.estruturadedados.pilha.teste;

import com.loiane.estruturadedados.pilha.Pilha;

public class Aula14 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i=1; i<= 10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}