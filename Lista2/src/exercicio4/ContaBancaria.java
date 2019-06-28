package exercicio4;

public abstract class ContaBancaria extends Conta{

	public void creditar(double valor){
		double total;
		total = obterSaldo() + valor;
		setSaldo(total);
	}
	
	public void debitar (double valor){
		
		setSaldo(obterSaldo() - valor);
	}
	
	public abstract void aplicarRendimentos();

}
