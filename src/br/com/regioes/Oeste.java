package br.com.regioes;

import br.com.lambda.Regiao;

public class Oeste implements Regiao {

	@Override
	public boolean avalia(int valor) {
		return valor == 7;
	}

	@Override
	public String procedencia() {
		return "Oeste";
	}

}
