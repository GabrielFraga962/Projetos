package PlanoPiloto;


	public class AnexoIII extends Empresa{


		public void run() {
			this.digitaFaturamento();
			this.calculaImposto();
			SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
		}

		@Override
		public void calculaImposto() {
			// TODO Auto-generated method stub
			this.setFaturamentoTotal();


			if (this.getFaturamentoTotal() >=0 && this.getFaturamentoTotal() <= 180000f) {
				this.setImposto(this.getFaturamentoTotal() * 0.06f - 100f);
			}
			else if (this.getFaturamentoTotal()>180000f && this.getFaturamentoTotal()<=360000.00f) {
				this.setImposto(this.getFaturamentoTotal() * 0.112f - 9360.00f);
			}
			else if (this.getFaturamentoTotal()>360000f && this.getFaturamentoTotal()<=720000.00f) {
				this.setImposto(this.getFaturamentoTotal() * 0.135f - 17640.00f);
			}
			else if (this.getFaturamentoTotal()>720000f && this.getFaturamentoTotal()<=180000.00f) {
				this.setImposto(this.getFaturamentoTotal() * 0.16f - 35640.00f);
			}
			else if (this.getFaturamentoTotal()>180000f && this.getFaturamentoTotal()<=3600000.00f) {
				this.setImposto(this.getFaturamentoTotal() * 0.21f - 125640.00f);
			}
			else if (this.getFaturamentoTotal()>3600000f && this.getFaturamentoTotal()<=4800000.00f) {
				this.setImposto(this.getFaturamentoTotal() * 0.33f - 648000.00f);
			}
			
			else {
				System.out.println(" Lamentamos, mas o seu perfil não se enquadra aos anexos do Simples Nacioanl ");
			}
			
		}
	}



