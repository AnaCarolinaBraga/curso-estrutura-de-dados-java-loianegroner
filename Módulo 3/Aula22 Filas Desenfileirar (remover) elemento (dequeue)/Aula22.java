package com.loiane.estruturadedados.fila.teste;

import com.loiane.estruturadedados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);

		System.out.println(fila);

		fila.desenfileira();
		fila.desenfileira();

		System.out.println(fila.espiar());

		System.out.println(fila);
	}

}
