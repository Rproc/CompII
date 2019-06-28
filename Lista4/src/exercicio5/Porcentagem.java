package exercicio5;

public class Porcentagem {

private double valor;
	
	public Porcentagem(double valor) {
		
		this.setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		
		this.valor = 1 + (valor / 100 );
	}

}
