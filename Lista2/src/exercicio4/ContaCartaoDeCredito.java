package exercicio4;

public class ContaCartaoDeCredito extends Conta {

	public ContaCartaoDeCredito(String x){
		setNumeroConta(x);
	}
	
	public void pagar(){
		setSaldo(0);
	}
	
	public void cobrarJuros(){
		
		setSaldo(obterSaldo()*1.05);
	}
	
	public void debitar (double valor){
		
		setSaldo(obterSaldo() - valor);
	}
}
