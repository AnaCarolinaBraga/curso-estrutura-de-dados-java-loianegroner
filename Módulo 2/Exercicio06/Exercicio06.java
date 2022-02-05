package com.loiane.estruturadedados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a expressão para sabermos se é balanceada:");
		String expressao = scan.nextLine();

		imprimeResultado(expressao);

	}

	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " esta balanceado?");

		if (verificaSimbolos(expressao)) {
			System.out.println("A expressão está balanceada.");
		} else {
			System.out.println("A expressão não está balanceada.");

		}
	}

	final static String ABRE = "({[";
	final static String FECHA = ")}]";

	public static boolean verificaSimbolos(String expressao) {

		Stack<Character> pilha = new Stack<Character>();
		int index = 0;
		char simbolo, topo;

		while(index < expressao.length()) {
			simbolo = expressao.charAt(index);

			//Para saber se existe ou não o símbolo, usa o comando "indexOf". Ele retorna um indice maior que zero se existe
			if(ABRE.indexOf(simbolo) > -1) {   
				pilha.push(simbolo);
			} else if (FECHA.indexOf(simbolo) > -1) {
				//se não tiver nada nela, ja ta desbalanceado
				if (pilha.isEmpty()) {
					return false;
				} else {
					topo = pilha.pop();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;

					}

				}
			}

			index++;
		}

		return true;
	}

}
