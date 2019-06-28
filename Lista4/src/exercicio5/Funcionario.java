package exercicio5;

public class Funcionario {

	private Moeda salarioBase;
	
	public Moeda obterPagamento() {
		return this.getSalarioBase();
	}
	
	public void definirSalarioBase(Moeda umSalario){
		this.setSalarioBase(umSalario);
	}
	
	public Moeda obterSalarioBase(){
		return this.getSalarioBase();
	}
	
	public Moeda getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Moeda salarioBase) {
		this.salarioBase = salarioBase;
	}
	

}
