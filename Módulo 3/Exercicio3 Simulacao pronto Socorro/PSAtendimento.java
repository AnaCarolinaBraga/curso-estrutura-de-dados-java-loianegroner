package com.loiane.estruturadedados.fila.labs;

import com.loiane.estruturadedados.fila.FilaComPrioridade;

public class PSAtendimento implements Runnable {

	private FilaComPrioridade<Pessoa> fila;

	public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {

		while(!fila.estaVazia()) {
			try {
				System.out.println(fila.desenfileira() + " atendida.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Atendimento concluído.");
	}

}
