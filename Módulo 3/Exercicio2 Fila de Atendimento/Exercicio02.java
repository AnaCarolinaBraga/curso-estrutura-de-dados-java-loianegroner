package com.loiane.estruturadedados.fila.labs;

import java.util.Scanner;

import com.loiane.estruturadedados.fila.Fila;

public class Exercicio02 {

	public static void main(String[] args) {

		Fila<String> atendimentoNormal = new Fila<String>();
		Fila<String> atendimentoPrioritario = new Fila<String>();
		Scanner scan = new Scanner(System.in);
		String opcao = "";
		int contadorN = 0;
		int contadorP = 0;


		final int MAX_PRIORIDADE = 3;


		while(!opcao.equalsIgnoreCase("C")) {

			opcao = menu(scan);

			switch (opcao) {
			case "A":
				String pessoa = "" + contadorN;
				atendimentoNormal.enfileira("" + contadorN);
				System.out.println(pessoa + " esta a espera de atendimento.");
				contadorN++;
				break;
			case "B":
				String pessoaP = "" + contadorP;
				atendimentoPrioritario.enfileira("" + contadorP + " Prioritario");
				System.out.println(pessoaP + " esta a espera de atendimento prioritário.");
				contadorP++;
				break;

			default:
				break;
			}

		}

		System.out.println("Atendente informou que não há mais pessoas para atender.");

		while(!atendimentoNormal.estaVazia() || !atendimentoPrioritario.estaVazia()) {

			int contadorDois = 0;

			while(!atendimentoPrioritario.estaVazia() && contadorDois < MAX_PRIORIDADE) {
				atendePessoa(atendimentoPrioritario);
				contadorDois++;
			}

			if(!atendimentoNormal.estaVazia()) {
				atendePessoa(atendimentoNormal);
			}
			if(atendimentoPrioritario.estaVazia()) {
				while (!atendimentoNormal.estaVazia()) {
					atendePessoa(atendimentoNormal);
				}
			}
		}

	}

	public static void atendePessoa(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida + " foi atendida");
	}

	protected static String menu(Scanner scan){

		boolean entradaValida = false;
		String opcao = null;

		while(!entradaValida) {

			System.out.println("O atendimento é normal ou prioritário? Digite A, B ou C");
			System.out.println("A) Normal");
			System.out.println("B) Prioritário");
			System.out.println("C) Sair");

			try {

				opcao = scan.nextLine();

				if(opcao.equals("A") || opcao.equals("B") || opcao.equals("C")) {
					entradaValida = true;

				} else {
					throw new Exception();
				}
			} catch (Exception e) {

				System.out.println("Entrada inválida, digite novamente");
			}

		}

		return opcao;
	}


}