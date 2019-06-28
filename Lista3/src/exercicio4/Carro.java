package exercicio4;

public class Carro {

	private String cor;
	private final int numeroChassis;
	
	public Carro(String cor, int numeroChassis) {
		// TODO Auto-generated constructor stub
		this.setCor(cor);
		this.numeroChassis = numeroChassis;		
	
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroChassis() {
		return numeroChassis;
	}
}
