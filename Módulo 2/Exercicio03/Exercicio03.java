package com.loiane.estruturadedados.pilha.labs;

import com.loiane.estruturadedados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<Livro>(20);

		Livro livro1 = new Livro();
		livro1.setNome("Flores e margaridas");
		livro1.setIsbn("123456");
		livro1.setAnoLancamento(2016);
		livro1.setAutor("Ana Carolina");

		Livro livro2 = new Livro();
		livro2.setNome("Tormenta no jardim");
		livro2.setIsbn("123789");
		livro2.setAnoLancamento(2017);
		livro2.setAutor("Ana Carolina");

		Livro livro3 = new Livro();
		livro3.setNome("Pétalas ao vento");
		livro3.setIsbn("456123");
		livro3.setAnoLancamento(2018);
		livro3.setAutor("Ana Carolina");

		Livro livro4 = new Livro();
		livro4.setNome("Margaridas despedaçadas");
		livro4.setIsbn("1598753");
		livro4.setAnoLancamento(2019);
		livro4.setAutor("Ana Carolina");

		Livro livro5 = new Livro();
		livro5.setNome("Flores cristalizadas");
		livro5.setIsbn("147963");
		livro5.setAnoLancamento(2020);
		livro5.setAutor("Ana Carolina");

		Livro livro6 = new Livro();
		livro6.setNome("Espinhos solares");
		livro6.setIsbn("852456");
		livro6.setAnoLancamento(2021);
		livro6.setAutor("Ana Carolina");

		System.out.println("Empilhando os livros na pilha...");

		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);

		System.out.println("A pilha está assim no momento: " + pilha);

		System.out.println("Temos " + pilha.tamanho() + " elementos na pilha.");

		System.out.println("Vamos retirar o elemento do topo da pilha: " + pilha.desempilha());

		System.out.println("Agora o elemento que está no topo é: " + pilha.topo());

		System.out.println("Temos " + pilha.tamanho() + " elementos na pilha.");

		while(!pilha.estaVazia()) {
			System.out.println("Vamos desempilhar o próximo elemento: " + pilha.desempilha());
		}

		System.out.println("Temos " + pilha.tamanho() + " elementos na pilha.");

		System.out.println("Sua pilha está vazia." + pilha);
	}

}
