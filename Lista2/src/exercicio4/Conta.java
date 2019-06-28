package exercicio4;

public abstract class Conta {

	 private String numeroConta;
	 private double saldo;
	
	 public double obterSaldo(){
		 return saldo;
	 }
	 
	 public void setSaldo(double n){
		 saldo = n;
	 }
	 
	 public String obterNumeroConta(){
		 return numeroConta;
	 }
	
	 public void setNumeroConta(String n){
		 numeroConta = n;
	 }
}
