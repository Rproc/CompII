package exercicio6;

public class Triangulo extends Poligono{

	double base, altura, area;
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea(){
		area = (base * altura)/2;
	}
	
	public double obterArea(){
		return area;
	}
}
