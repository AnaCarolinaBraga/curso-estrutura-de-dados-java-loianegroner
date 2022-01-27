package com.loiane.estruturadedados.vetor.teste;

import com.loiane.estruturadedados.vetor.Vetor;

public class VetorJavaTestar {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}