package com.loiane.estruturadedados.fila.labs;

import java.util.Random;

import com.loiane.estruturadedados.fila.Fila;

public class Exer04 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		for(int i = 0; i< 10; i++) {
			fila.enfileira(i);
		}

		//quantas vezes vai falar "batatinha quente um dois tres"
		Random aleatorio = new Random();
		int num = 0;
		while (num == 0) {
			num = aleatorio.nextInt(10);
		}
		System.out.println("Número = " + num);

		//fila circular
		while(fila.tamanho() > 1) {
			for (int i = 0; i < num; i++) {
				fila.enfileira(fila.desenfileira());
			}
			System.out.println("Eliminado: " + fila.desenfileira());
		}

		System.out.println("Ganhador: " + fila.desenfileira());
	}

}
