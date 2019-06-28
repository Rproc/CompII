package exercicio3;

public final class Contador extends Funcionario {

		public Contador(int tempoServico, double salarioAtual, Titulo titulo) {
			super(tempoServico, salarioAtual, titulo);
		}


		public double bonusPorTitulo(Funcionario funcionario) {

			double result = funcionario.getSalarioAtual();
			
			switch (funcionario.getTitulo()) {
			
			case TECNICO:
				result = result * 0.01;
				break;

			case GRADUADO:
				result = result * 0.1;
				break;
				
			case MESTRADO:
				result = result * 0.1;
				break;
				
			case DOUTORADO:
				result = result * 0.2;
				break;
				
			}		
			
			return result;
		}
		
		
		public double bonusPorTempoServico(Funcionario funcionario){
			
			return ( funcionario.getSalarioAtual() * ( 0.0001 * funcionario.getTempoServico() ) );
			
		}
		
		
		public double calculaBonus (Funcionario funcionario){
			
			return ( this.bonusPorTempoServico(funcionario) + this.bonusPorTitulo(funcionario) );
		}

}


