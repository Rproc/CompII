package exercicio2;

public class Automovel {

	private Motor motor;
	private Roda [] roda;
	
	public Automovel(Motor motor, Roda[] roda){
		
		this.motor = motor;
		this.roda = roda;
	}
	
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Roda [] getRoda() {
		return roda;
	}
	public void setRoda(Roda [] roda) {
		this.roda = roda;
	}
	
	
}
