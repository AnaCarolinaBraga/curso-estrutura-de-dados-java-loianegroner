package com.loiane.estruturadedados.fila.labs;

import com.loiane.estruturadedados.fila.Fila;

public class Exercicio01 {

	public static void main(String[] args) {

		Fila<Documento> fila = new Fila<Documento>();

		fila.enfileira(new Documento("A", 1));
		fila.enfileira(new Documento("B", 2));
		fila.enfileira(new Documento("C", 5));
		fila.enfileira(new Documento("D", 9));

		while(!fila.estaVazia()) {
			Documento doc = fila.desenfileira();
			System.out.println("Imprimindo documento " + doc.getNome());
		}

		System.out.println("Todos os documentos foram impressos.");


	}

}
