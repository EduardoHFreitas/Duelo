package br.univel.duelo.policial;

import br.univel.duelo.arma.Arma;

public class RoboCop implements Policial{

	@Override
	public void prender() {
		System.out.println("EU SO BIXAO, VO MATA A VIADARIA TODA");
	}

	@Override
	public Float agredir() {
		return 100F;
	}

	@Override
	public Float atirar() {
		return 150F;
	}

	@Override
	public void apanhar(Float soco) {
		System.out.println("NAO VAI DA NAO");
	}

	@Override
	public void defenderTiro(Float tiro) {
		System.out.println("CHEIRA MINHA BOLA AQUI MALUCAO");
	}

	@Override
	public void setArma(Arma arma) {
		System.out.println("DA UMA AFOFADA AQUI NO MEU PIRU");
	}

}
