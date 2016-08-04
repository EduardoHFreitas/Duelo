package br.univel.duelo.pistoleiro.usa;

import java.util.Random;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Representa um pistoleiro no nosso joguinho com as a��es b�sicas deste, sendo
 * atirar e defender tiro
 *
 * @author Will
 *
 */
class Forasteiro extends AbstractPistoleiro {

	protected Forasteiro(String nome) {
		super(nome, 80f, 4f);
	}
}