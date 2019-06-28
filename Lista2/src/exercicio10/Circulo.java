package exercicio10;

public class Circulo {

	private double raio, area;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public void setRaio(double raio){
		this.raio = raio;
	}
	public double getRaio(){
		return raio;
		
	}
	
	public double calcularArea(){
		area = 3.14 * (raio * raio);
		return area;
		
	}
}
