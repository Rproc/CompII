package exercicio4;

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

}
