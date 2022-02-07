package com.loiane.estruturadedados.fila.teste;

import com.loiane.estruturadedados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(5);
		fila.enfileira(4);
		fila.enfileira(3);


		
		System.out.println(fila); //retorna [3,4,5]
	}

}
