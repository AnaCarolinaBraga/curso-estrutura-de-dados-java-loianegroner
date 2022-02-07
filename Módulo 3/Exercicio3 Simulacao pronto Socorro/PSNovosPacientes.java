package com.loiane.estruturadedados.fila.labs;

import java.util.Random;

import com.loiane.estruturadedados.fila.FilaComPrioridade;

public class PSNovosPacientes implements Runnable{

	private FilaComPrioridade<Pessoa> fila;
	private int count = 7;
	private Random prioridade = new Random();



	public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {

		for (int i=0; i< 8; i++) {
			try {
				Thread.sleep(8000);
				Pessoa p = new Pessoa("" + count, prioridade.nextInt(3));
				fila.enfileira(p);
				count++;
				System.out.println(p + " enfileirado.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
