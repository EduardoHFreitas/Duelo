package br.univel.duelo.policial;

import br.univel.duelo.arma.Arma;

public interface Policial {

	void prender();

	Float agredir();

	Float atirar();

	void apanhar (final Float soco);

	void defenderTiro(final Float tiro);

	void setArma (final Arma arma);


}
