package br.univel.duelo.pistoleiro;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.arma.ArmaObserver;

public interface Pistoleiro extends ArmaObserver {

	Float atirar();

	Pistoleiro defenderTiro(final Float tiro);

	Boolean estaVivo();

	String getNome();

	Pistoleiro setArma(final Arma arma);
}
