package br.univel.duelo.arma;

public class Pistola implements Arma {
		private Integer municoes = 0;

		@Override
		public Float atirar() {
			if (temMunicoes()){
				this.municoes--;
				return potenciaTiro() * precisaoTiro();
			}
			System.out.println("ACABARAM AS BALAS!");
			return 0f;
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
			return this;
		}

		@Override
		public Boolean temMunicoes() {
			return municoes > 0;
		}
	}
