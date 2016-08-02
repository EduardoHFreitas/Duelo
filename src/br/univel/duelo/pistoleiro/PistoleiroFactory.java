package br.univel.duelo.pistoleiro;

public interface PistoleiroFactory {

	Pistoleiro create(final TipoPistoleiro tipo, final String nome);

}
