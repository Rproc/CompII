package exercicio10;

public class Quadrado {

	private double aresta, area;
	
	public Quadrado(double aresta){
		this.aresta = aresta;
	}
	
	public void setAresta(double aresta){
		this.aresta = aresta;
	}
	
	public double getAresta(){
		return aresta;
	}
	
	public double calcularArea(){
		
		area = aresta * aresta;
		return area;
	}
}
