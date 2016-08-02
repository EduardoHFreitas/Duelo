package br.univel.duelo.pistoleiro.usa;

import java.util.Random;

import br.univel.duelo.pistoleiro.Pistoleiro;

class Cherife implements Pistoleiro {

	/**
	 * Armazena em tempo de execu��o o nome do pistoleiro
	 */
	private String nome;
	/**
	 * Armazena em tempo de execu��o o quantidade de vida que o pistoleiro ainda
	 * tem, todo pistoleiro come�a com a vida em 100%
	 */
	private float vida = 100;

	/**
	 * Construtor para cria��o de um pistoleiro novo, sendo necess�rio informar
	 * um nome para o mesmo
	 *
	 * @param nome
	 */
	protected Cherife(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Faz o disparo do pistoleiro, o disparo � baseado na for�a que um tiro
	 * pode ter, sendo de 0 .. 100
	 *
	 * @return for�a que o tira tem
	 */
	public Float atirar() {
		// Para atirar utiliza um Random para gerar a for�a do disparo, por�m
		// quando se utilizar nextFloat � gerado um n�mero entre 0.0 a 1.0, por
		// isso � necess�rio multiplicar por 100 para termos um pot�ncia maior
		// no tiro. Exemplo, se o random gerar 0.9 ap�s a multiplica��o teremos
		// um tiro com 90 de for�a
		return new Random().nextFloat() * 100;
	}

	/**
	 * Utilizado pelo pistoleiro para defender um tiro disparado pelo outro, a
	 * for�a do tiro � subtraida da vida do pistoleiro
	 *
	 * @param tiro
	 */
	public Cherife defenderTiro(Float tiro) {
		// O codigo abaixo � o mesmo que vida = vida - tiro;
		vida -= tiro;
		return this;
	}

	/**
	 * Informa se o pistoleiro esta vivo
	 *
	 * @return true para vivo e false para morto
	 */
	public Boolean estaVivo() {
		// C�digo vida > 0 � igual ao c�digo abaixo, por�m de forma mais
		// reduzida, � retornado direto um boolean para vida maior que zero, o
		// retorno � boolean devido a defini��o no m�todo
		// if (vida > 0) {
		// return true;
		// } else {
		// return false;
		// }
		return vida > 0;
	}
}