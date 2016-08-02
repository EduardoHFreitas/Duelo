package br.univel.duelo.pistoleiro;

import java.util.Objects;

public class PistoleiroFactory {

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
