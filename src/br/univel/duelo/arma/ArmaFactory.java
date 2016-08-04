package br.univel.duelo.arma;

import java.util.Objects;

public class ArmaFactory {

	public Arma create(TipoArma tipo){
		Objects.requireNonNull(tipo, "Tipo de arma nao pode ser nulo!");
		switch (tipo){
		case LONGA:
			break;
		case CURTA:
			break;
		default:
			throw new RuntimeException("Tipo de arma desconhecido!");
		}
	}

}
