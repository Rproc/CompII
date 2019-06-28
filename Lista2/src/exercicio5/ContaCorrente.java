package exercicio5;

public class ContaCorrente extends ContaBancaria{

	final private double taxaJuros = 7/100;
	final private double limiteSaque = 200;
	final private double taxaServico = 50;
	
	public ContaCorrente(String x){
		setNumeroConta(x);
	}
	
	public void aplicarRendimentos(){
		setSaldo(obterSaldo() + taxaJuros + taxaServico);
	}
	
	public void transferencia(ContaPoupanca conta1, double valor){
		this.setSaldo(obterSaldo() - valor);
		conta1.setSaldo(conta1.obterSaldo() + valor);
	}
	
	
}
