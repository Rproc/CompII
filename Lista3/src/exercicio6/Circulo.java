package exercicio6;

public class Circulo extends Poligono{
	
	double raio;
	double area;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public void calcularArea(){
		area = 3.14 * (raio * raio);	
	}
	
	public double obterArea(){
		return area;
	}
}
