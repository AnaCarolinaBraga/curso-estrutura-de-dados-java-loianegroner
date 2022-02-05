package com.loiane.estruturadedados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a palavra para sabermos se é palíndromo:");
		String palavra = scan.nextLine();

		boolean palin = testaPalindromo(palavra);

		if (palin) {

			System.out.println("A palavra é um palindromo.");

		} else {

			System.out.println("A palavra não é um palindromo.");

		}

	}

	public static boolean testaPalindromo(String palavra) {

		Stack<Character> pilha = new Stack<Character>();

		for(int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}

		String palavraInversa = "";

		while(!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
		}

		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}

}
