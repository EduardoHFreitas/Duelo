package br.univel.duelo;

/*FACTORY METHOD*/

import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;
import br.univel.duelo.pistoleiro.usa.PistoleiroUsaFactory;

/**
 * Inicia um duelo entre os pistoleiros
 *
 * @author Will
 *
 */
public class Duelo {

	//public static void main(String[] args) {
    //		// Inst�ncia dois pistoleiro para duelar
	//	new Duelo().duelar(new PistoleiroUsaFactory());
	//}


	private final Pistoleiro pistoleiro1;
	private final Pistoleiro pistoleiro2;

	public Duelo (final Pistoleiro pistoleiro1, final Pistoleiro pistoleiro2){
		this.pistoleiro1 = pistoleiro1;
		this.pistoleiro2 = pistoleiro2;
	}

	public void duelar() {
		// Enquando os dois estiverem vivos o duelo continua
		while (pistoleiro1.estaVivo() && pistoleiro2.estaVivo()) {
			pistoleiro2.defenderTiro(pistoleiro1.atirar());
			pistoleiro1.defenderTiro(pistoleiro2.atirar());
		}

		// Verifica qual pistoleiro esta vivo e imprime o nome deste como
		// vencedor do duelo
		if (pistoleiro1.estaVivo() && !pistoleiro2.estaVivo()) {
			System.out.println(String.format("Pistoleiro %s vence o duelo", pistoleiro1.getNome()));
		} else if (!pistoleiro1.estaVivo() && pistoleiro2.estaVivo()) {
			System.out.println(String.format("Pistoleiro %s vence o duelo", pistoleiro2.getNome()));
		} else {
			// Se entrar no else � porque n�o houve ganhador
			System.out.println("N�o houve vencedor do duelo");
		}

	}
}
