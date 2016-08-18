package br.univel.duelo.policial;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.pistoleiro.Pistoleiro;

public class PistoleiroAdapter implements Pistoleiro {

	private final Policial policial;

	public PistoleiroAdapter(final Policial policial) {
		this.policial = policial;
	}

	@Override
	public void armaAtualizada(Arma arma) {

	}

	@Override
	public Float atirar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pistoleiro defenderTiro(Float tiro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean estaVivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pistoleiro setArma(Arma arma) {
		// TODO Auto-generated method stub
		return null;
	}
}