package com.loiane.estruturadedados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Ana");
		lista.add("Braga");
		System.out.println(lista);
		
		lista.add(1, "Carolina");
		System.out.println(lista);
		
		boolean existe = lista.contains("ana");
		if (existe) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Element não existe no vetor");
		}
		
		int posicao = lista.indexOf("Braga");
		if (posicao > -1) {
			System.out.println("Elemento existe no vetor na posicao " + posicao);
		} else {
			System.out.println("Element não existe no vetor");
		}
		
		System.out.println(lista.get(2));
		
		lista.add("Santos");
		lista.add("Anjos");
		System.out.println(lista);
		
		lista.remove(3);
		lista.remove("Anjos");
		System.out.println(lista);
		
		System.out.println(lista.size());
		
	}

}
