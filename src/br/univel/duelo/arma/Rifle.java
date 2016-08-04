package br.univel.duelo.arma;

public class Rifle implements Arma{

	@Override
	public Float atirar() {
		if (temMunicoes()){
			this.municoes--;
			return potenciaTiro() * precisaoTiro();
		}
		System.out.println("ACABARAM AS BALAS!");
		return 0f;
	}

	@Override
	public Float potenciaTiro() {
		return 9f;
	}

	@Override
	public Float precisaoTiro() {
		return 9f;
	}

	@Override
	public Arma recarregar(Integer municoes) {
	    this.municoes += municoes;
		return this;
	}

	@Override
	public Boolean temMunicoes() {
		return municoes > 0;
	}
	private Integer municoes;
}
