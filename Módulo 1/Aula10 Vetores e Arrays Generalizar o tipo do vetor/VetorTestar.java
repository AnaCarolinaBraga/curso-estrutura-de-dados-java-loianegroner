package com.loiane.estruturadedados.vetor.teste;

import com.loiane.estruturadedados.vetor.VetorObjetos;

public class VetorTestar {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("contato 2", "2341-5678", "contato2@email.com");
		Contato c3 = new Contato("contato 3", "3214-9876", "contato3@email.com");
		
		Contato c4 = new Contato("contato 3", "3214-9876", "contato3@email.com");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		
		int existe = vetor.busca(c4);
		if (existe  > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		


		
		System.out.println(vetor);

	}

}
