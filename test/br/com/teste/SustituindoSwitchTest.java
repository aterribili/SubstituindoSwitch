package br.com.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.lambda.SubstituindoSwitch;

public class SustituindoSwitchTest {

	@Test
	public void DeveBuscarRegiaoSul() {

		Assert.assertEquals("Sul", new SubstituindoSwitch().buscaRegiao(2));
	}

	@Test
	public void DeveBuscarRegiaoNorte() {

		Assert.assertEquals("Norte", new SubstituindoSwitch().buscaRegiao(3));
	}

	@Test
	public void DeveBuscarRegiaoLeste() {

		Assert.assertEquals("Leste", new SubstituindoSwitch().buscaRegiao(5));
	}

	@Test
	public void DeveBuscarRegiaoOeste() {

		Assert.assertEquals("Oeste", new SubstituindoSwitch().buscaRegiao(7));
	}

}
