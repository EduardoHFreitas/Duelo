package br.univel.duelo;

import br.univel.duelo.arma.ArmaFactory;
import br.univel.duelo.loja.Loja;
import br.univel.duelo.pistoleiro.TipoPistoleiro;
import br.univel.duelo.pistoleiro.br.PistoleiroBrFactory;

public class Main {
	public static void main(String[] args) {
		final DueloBuilder builder = new DueloBuilder();
		builder.setNome1("Ladra1")
			.setTipo1(TipoPistoleiro.FORA_DA_LEI)
			.setNome2("DoBem")
			.setTipo2(TipoPistoleiro.DENTRO_DA_LEI)
			.setPistoleiroFactory(new PistoleiroBrFactory())
			.setArmaFactory(new ArmaFactory())
			.setLojaMunicao(Loja.getInstancia());

		final Duelo duelo = builder.build();

		duelo.duelar();
	}
}
