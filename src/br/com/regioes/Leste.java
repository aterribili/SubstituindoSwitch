package br.com.regioes;

import br.com.lambda.Regiao;

public class Leste implements Regiao {

	@Override
	public boolean avalia(int valor) {
		return valor == 5;
	}

	@Override
	public String procedencia() {
		return "Leste";
	}

}
