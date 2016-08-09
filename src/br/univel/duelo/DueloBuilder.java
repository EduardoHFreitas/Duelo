package br.univel.duelo;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.arma.ArmaFactory;
import br.univel.duelo.arma.TipoArma;
import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;

public class DueloBuilder {

	private String nome1;
	private TipoPistoleiro tipo1;
	private String nome2;
	private TipoPistoleiro tipo2;
	private PistoleiroFactory pistoleiroFactory;
	private ArmaFactory armaFactory;

	public String getNome1() {
		return nome1;
	}

	public DueloBuilder setNome1(String nome1) {
		this.nome1 = nome1;
		return this;
	}

	public TipoPistoleiro getTipo1() {
		return tipo1;
	}

	public DueloBuilder setTipo1(TipoPistoleiro tipo1) {
		this.tipo1 = tipo1;
		return this;
	}

	public String getNome2() {
		return nome2;
	}

	public DueloBuilder setNome2(String nome2) {
		this.nome2 = nome2;
		return this;
	}

	public TipoPistoleiro getTipo2() {
		return tipo2;
	}

	public DueloBuilder setTipo2(TipoPistoleiro tipo2) {
		this.tipo2 = tipo2;
		return this;
	}

	public PistoleiroFactory getPistoleiroFactory() {
		return pistoleiroFactory;
	}

	public DueloBuilder setPistoleiroFactory(PistoleiroFactory pistoleiroFactory) {
		this.pistoleiroFactory = pistoleiroFactory;
		return this;
	}

	public ArmaFactory getArmaFactory() {
		return armaFactory;
	}

	public DueloBuilder setArmaFactory(ArmaFactory armaFactory) {
		this.armaFactory = armaFactory;
		return this;
	}

	public Duelo build() {
		final Pistoleiro pistoleiro1 = this.pistoleiroFactory.create(tipo1, nome1);
		final Pistoleiro pistoleiro2 = this.pistoleiroFactory.create(tipo2, nome2);
		final Arma arma1 = this.armaFactory.create(TipoArma.LONGA);
		final Arma arma2 = this.armaFactory.create(TipoArma.LONGA);
		pistoleiro1.setArma(arma1);
		pistoleiro2.setArma(arma2);

		return new Duelo(pistoleiro1, pistoleiro2);
	}

}