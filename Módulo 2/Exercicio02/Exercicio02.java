package com.loiane.estruturadedados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadedados.pilha.Pilha;

public class Exercicio2 {

	public static void main(String[] args) {

		Pilha<Integer> pilhaPar = new Pilha<Integer>();

		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		int numero = 0;

		for(int i = 1; i <= 10; i++) {

			System.out.println("Digite um número:");
			numero = scan.nextInt();

			if (numero == 0) {

				if(pilhaPar.estaVazia()) {

					System.out.println("Erro. A pilha par já está vazia.");

				} else {

					System.out.println("A pilha par está desempilhando o " + pilhaPar.desempilha());
				}

				if (pilhaImpar.estaVazia()) {

					System.out.println("Erro. A pilha ímpar já está vazia.");

				} else {

					System.out.println("A pilha ímpar está desempilhando o " + pilhaImpar.desempilha());

				}

			} else if (numero % 2 == 0) {

				pilhaPar.empilha(numero);
				System.out.println("O numero " + numero + " foi empilhado na pilha par.");

			} else {

				pilhaImpar.empilha(numero);
				System.out.println("O numero " + numero + " foi empilhado na pilha ímpar.");

			}

		}

		System.out.println("\nElementos da pilha par " + pilhaPar);

		if (!pilhaPar.estaVazia()) {

			System.out.println("Desempilhando os elementos da pilha par:");

			while(!pilhaPar.estaVazia()) {

				System.out.println(pilhaPar.desempilha() + " foi retirado. ");

			}

		}

		System.out.println("\nElementos da pilha ímpar " + pilhaImpar);

		if (!pilhaImpar.estaVazia()) {

			System.out.println("Desempilhando os elementos da pilha ímpar:");

			while(!pilhaImpar.estaVazia()) {

				System.out.println(pilhaImpar.desempilha() + " foi retirado. ");

			}

		}

	}

}
