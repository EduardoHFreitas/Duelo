package br.univel.duelo.pistoleiro;

import br.univel.duelo.arma.Arma;

public interface Pistoleiro {

	Float atirar();

	Pistoleiro defenderTiro(final Float tiro);

	Boolean estaVivo();

	String getNome();

	Pistoleiro setArma(final Arma arma);
}
