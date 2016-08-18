package br.univel.duelo.loja;

public class Loja {

	private Integer municoes = 5;
	private static Loja instancia;

	private Loja(){

	}

	public static Loja getInstancia(){
		if (instancia == null){
			instancia = new Loja();
		}
		return instancia;
	}

	public Integer venda (final Integer quantidade){
		Integer quantidadeVendida = 0;
		if (quantidade >= municoes){
			quantidadeVendida = municoes;
			municoes = 0;
			/*
			 * quantidadeVendida = municoes
			 * municoes = 0
			 */
		} else {
			municoes -= quantidade;
			quantidadeVendida = quantidade;
		}
		return quantidadeVendida;
	}

}
