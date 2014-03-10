package br.com.regioes;

import br.com.lambda.Regiao;

public class Norte implements Regiao {

	@Override
	public boolean avalia(int valor) {
		return valor == 3;
	}

	@Override
	public String procedencia() {
		return "Norte";
	}

}
