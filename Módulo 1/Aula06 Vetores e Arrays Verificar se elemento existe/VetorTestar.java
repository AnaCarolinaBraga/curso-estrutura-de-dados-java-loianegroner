package com.loiane.estruturadedados.vetor.teste;

import com.loiane.estruturadedados.vetor.Vetor;

public class VetorTestar {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		//Testar o novo método de busca
		System.out.println(vetor.busca("elemento 1"));
		System.out.println(vetor.busca("elemento 7"));

	
	}

}