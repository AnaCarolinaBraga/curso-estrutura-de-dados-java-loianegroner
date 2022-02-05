package com.loiane.estruturadedados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		Integer numero = scan.nextInt();

		System.out.println("Digite uma base: ");
		Integer numeroBase = scan.nextInt();

		imprimirResultado(numero);
		imprimirResultadoQualquerBase(numero, numeroBase);

	}

	public static void imprimirResultado(int numero) {
		System.out.println(numero + " em binario é " + decimalBinario(numero));
	}

	public static void imprimirResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base + " é " + decimalQualquerBase(numero, base));
	}

	//Convertendo numeros decimais para hexadecimais
	public static String decimalQualquerBase(int numero, int base) {

		if(base > 16) {
			throw new IllegalArgumentException();
		}

		Stack<Integer> pilha = new Stack<Integer>();
		String numeroBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0){
			resto = numero % base;
			pilha.push(resto);
			numero /= base ;
		}

		while(!pilha.isEmpty()) {
			numeroBase += bases.charAt(pilha.pop());
		}

		return numeroBase;

	}

	public static String decimalBinario(int numero) {

		Stack<Integer> pilha = new Stack<Integer>();
		String numBinario = "";
		int resto;

		while (numero > 0){
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2 ; //numero = numero / 2
		}

		while(!pilha.isEmpty()) {
			numBinario += pilha.pop();   //Desempilha e acrescenta no numBinario
		}

		return numBinario;

	}


}
