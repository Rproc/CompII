package exercicio4;

public class Teste {
	
	public static void main(String[] args) {
		
			ContaPoupanca Joao = new ContaPoupanca("18571");
			ContaCorrente Jose  = new ContaCorrente("14120");
			ContaCartaoDeCredito Maria = new ContaCartaoDeCredito("12524");
			
			Joao.creditar(100);
			Jose.debitar(20);
			Maria.debitar(500);
			
			System.out.println("1:  Numero Conta: " + Joao.obterNumeroConta() + " Saldo: " + Joao.obterSaldo());
			System.out.println("2:  Numero Conta: " + Jose.obterNumeroConta() + " Saldo: " + Jose.obterSaldo());
			System.out.println("3:  Numero Conta: " + Maria.obterNumeroConta() + " Saldo: " + Maria.obterSaldo());
			
			Joao.aplicarRendimentos();
		
			Jose.aplicarRendimentos();
			
			Maria.cobrarJuros();

			System.out.println("\n \n1:  Numero Conta: " + Joao.obterNumeroConta() + " Saldo: " + Joao.obterSaldo());
			System.out.println("2:  Numero Conta: " + Jose.obterNumeroConta() + " Saldo: " + Jose.obterSaldo());
			System.out.println("3:  Numero Conta: " + Maria.obterNumeroConta() + " Saldo: " + Maria.obterSaldo());
			
			Maria.pagar();
			
			System.out.println("\n \n1:  Numero Conta: " + Joao.obterNumeroConta() + " Saldo: " + Joao.obterSaldo());
			System.out.println("2:  Numero Conta: " + Jose.obterNumeroConta() + "Saldo: " + Jose.obterSaldo());
			System.out.println("3:  Numero Conta: " + Maria.obterNumeroConta() + " Saldo: " + Maria.obterSaldo());
			
		}
	
}


