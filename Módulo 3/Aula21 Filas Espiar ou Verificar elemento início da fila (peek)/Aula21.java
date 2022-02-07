package com.loiane.estruturadedados.fila.teste;

import com.loiane.estruturadedados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();

		System.out.println(fila.espiar());  //null

		fila.enfileira(1);
		fila.enfileira(2);

		System.out.println(fila.espiar());  //1

	}

}
