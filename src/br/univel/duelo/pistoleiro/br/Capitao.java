package br.univel.duelo.pistoleiro.br;

import java.util.Random;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

class Capitao extends AbstractPistoleiro {

	protected Capitao(String nome) {
		super(nome, 100f, 7f);
	}
}