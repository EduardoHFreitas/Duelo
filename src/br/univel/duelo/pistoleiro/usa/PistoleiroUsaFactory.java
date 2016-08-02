package br.univel.duelo.pistoleiro.usa;

import java.util.Objects;

import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;

public class PistoleiroUsaFactory implements PistoleiroFactory {

	public Pistoleiro create(final TipoPistoleiro tipo, final String nome) {
		Objects.requireNonNull(tipo, "Tipo cannot be null");
		switch (tipo) {
		case DENTRO_DA_LEI:
			return new Cherife(nome);
		case FORA_DA_LEI:
			return new Forasteiro(nome);
		default:
			throw new RuntimeException("Tipo de pistoleiro invalido!");
		}
	}
}
