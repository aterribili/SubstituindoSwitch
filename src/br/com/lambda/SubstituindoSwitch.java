package br.com.lambda;

import java.util.ArrayList;
import java.util.List;

import br.com.regioes.Leste;
import br.com.regioes.Norte;
import br.com.regioes.Oeste;
import br.com.regioes.Sul;

public class SubstituindoSwitch {
	private List<Regiao> regioes = new ArrayList<>();

	public String buscaRegiao(int valor) {
		regioes.add(new Sul());
		regioes.add(new Norte());
		regioes.add(new Leste());
		regioes.add(new Oeste());

		for (Regiao regiao : regioes) {
			if (regiao.avalia(valor))
				return regiao.procedencia();
		}

		return "Região não encontrada.";
	}
}
