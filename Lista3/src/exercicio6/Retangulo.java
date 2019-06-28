package exercicio6;

public class Retangulo extends Poligono{
	
	double base, altura, area;
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea(){
		area = base * altura;
	}
	
	public double obterArea(){
		return area;
	}
	
}
