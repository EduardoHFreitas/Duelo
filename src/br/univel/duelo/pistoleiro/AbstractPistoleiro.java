package br.univel.duelo.pistoleiro;

import br.univel.duelo.arma.Arma;

/**
 * @author Eduardo
 *
 */
public abstract class AbstractPistoleiro implements Pistoleiro{

	private final String nome;
	private Float vida;
	private Arma arma;
	private final Float precisao;

	protected AbstractPistoleiro(final String nome, final Float vida, final Float precisao) {
		this.nome = nome;
		this.vida = vida;
		this.precisao = precisao;

	}

	@Override
	public Pistoleiro setArma(Arma arma) {
		this.arma = arma;
		return this;
	}

	@Override
	public Float atirar(){
		Float tiro = 0F;
		if (this.arma != null){
			tiro = this.arma.atirar() * precisao;
		} else {
			System.out.println(String.format("Pistoleiro %s nao tem arma!", getNome()));
		}

		return tiro;
	}

	@Override
	public Pistoleiro defenderTiro(Float tiro){
		this.vida -= tiro;
		return this;
	}

	@Override
	public Boolean estaVivo(){
		return this.vida > 0;
	}

	@Override
	public String getNome(){
		return this.nome;
	}

	public void armaAtualizada(final Arma arma){
		if(!arma.temMunicoes()){
			arma.recarregar(5);
		}
	}
}
