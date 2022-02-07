package com.loiane.estruturadedados.vetor.teste;

import com.loiane.estruturadedados.vetor.Lista;

public class ListaTestar {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista(3);
		
		vetor.adiciona("oi");
		
		//Podemos fazer dessa forma aqui tambem
		Lista<Contato> vetordecontatos = new Lista(4);
		
		Contato c1 = new Contato("contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("contato 2", "2341-5678", "contato2@email.com");
		Contato c3 = new Contato("contato 3", "3214-9876", "contato3@email.com");
		
		vetordecontatos.adiciona(c1);
		

	}

}
