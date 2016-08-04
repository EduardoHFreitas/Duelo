package br.univel.duelo.pistoleiro;

import java.util.Random;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.pistoleiro.usa.Pistoleiro;

/**
 * @author Eduardo
 *
 */
public abstract class AbstractPistoleiro implements Pistoleiro{

	private final String nome;
	private Float vida;
	private Arma arma;

	protected AbstractPistoleiro(final String nome, final Float vida) {
		this.nome = nome;
		this.vida = vida;
	}

	@Override
	public Pistoleiro setArma(Arma arma) {
		this.arma = arma;
		return this;
	}

	protected Pistoleiro (String nome) {
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
		return new Random().nextFloat() * 70;
	}

	/**
	 * Utilizado pelo pistoleiro para defender um tiro disparado pelo outro, a
	 * for�a do tiro � subtraida da vida do pistoleiro
	 *
	 * @param tiro
	 */
	public Pistoleiro defenderTiro(Float tiro) {
		// O codigo abaixo � o mesmo que vida = vida - tiro;
		Float perda = vida;
		vida -= tiro;
		System.out.println(this.getNome() + " perdeu " + (perda - vida) + " de vida");
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
