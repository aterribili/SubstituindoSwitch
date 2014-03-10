package br.com.regioes;

import br.com.lambda.Regiao;

public class Sul implements Regiao {

	@Override
	public boolean avalia(int valor) {
		return valor == 2;
	}

	@Override
	public String procedencia() {
		return "Sul";
	}

}
