package exercicio4;

public class ContaPoupanca extends ContaBancaria{

	private String aniversario;
	private double taxaRendimento = 0.1/100;
	
	public ContaPoupanca(String x){
		setNumeroConta(x);
	}

	public void aplicarRendimentos(){
		setSaldo(obterSaldo() + taxaRendimento);
	}


	public String getAniversario() {
		return aniversario;
	}


	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	

}
