package br.univel.duelo.arma;

import java.util.ArrayList;
import java.util.List;

public class Pistola implements Arma {
		private Integer municoes = 0;

		private final List<ArmaObserver> observadores = new ArrayList<>();

		public void adicionarObservador(final ArmaObserver observador){
			this.observadores.add(observador);
		}

		protected void notificarObservadores(){
			this.observadores.forEach(observador -> observador.armaAtualizada(this));
		}

		@Override
		public Float atirar() {
			Float tiro = 0F;
			if (temMunicoes()){
				this.municoes--;
				tiro = potenciaTiro() * precisaoTiro();
			} else {
				System.out.println("ACABARAM AS BALAS!");
			}

			notificarObservadores();
			return tiro;
		}

		@Override
		public Float potenciaTiro() {
			return 7f;
		}

		@Override
		public Float precisaoTiro() {
			return 5f;
		}

		@Override
		public Arma recarregar(Integer municoes) {
		    this.municoes += municoes;
		    notificarObservadores();
			return this;
		}

		@Override
		public Boolean temMunicoes() {
			return municoes > 0;
		}
	}
