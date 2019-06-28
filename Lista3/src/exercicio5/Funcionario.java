package exercicio5;

public class Funcionario {

	private Moeda salarioBase;

	 
	public Moeda obterSalarioBase() {
		return salarioBase;
	}

	public void definirSalarioBase(Moeda salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Moeda obterPagamento(){
		return salarioBase;
	}
}
