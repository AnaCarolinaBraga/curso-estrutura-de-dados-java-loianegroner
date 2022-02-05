package com.loiane.estruturadedados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadedados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {


		Pilha<Integer> pilha = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		int adicionarPilha = 0;


		for (int i = 1; i <= 10; i++) {

			System.out.println("Digite um número: ");

			adicionarPilha = scan.nextInt();

			if (adicionarPilha % 2 == 0) {

				pilha.empilha(adicionarPilha);
				System.out.println("Em elemento foi adicionado na pilha.");

			} else {

				Integer desempilharPilha = pilha.desempilha();

				if (desempilharPilha == null) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Um elemento foi retirado da pilha.");
				}
			}

		}

		System.out.println("Nossa pilha agora está assim: " + pilha);

		if (!pilha.estaVazia()) {
			while (!pilha.estaVazia()) {

				System.out.println("Estamos desempilhando, retirando da pilha o " + pilha.desempilha());

			}
			System.out.println("Nossa pilha agora está vazia. " + pilha);
		}

	}

}

