package exercicio2;

public class Motor {

	private int potencia;
	private double torque;
	private double consumo;
	private double preco;
	
	public Motor(int potencia, double torque, double consumo, double preco){
		
		this.potencia = potencia;
		this.torque = torque;
		this.consumo = consumo;
		this.preco = preco;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public double getTorque(){
		return torque;
	}
	
	public void setTorque(double torque){
		this.torque = torque;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}

