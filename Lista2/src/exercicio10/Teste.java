package exercicio10;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double raio, aresta;
		int poligono;
		
		System.out.println("1- quadrado \n2-circulo");
		poligono = input.nextInt();
		
		if(poligono == 1){
			System.out.println("Aresta: ");
			aresta = input.nextDouble();
			Quadrado quad1 = new Quadrado(aresta);
			System.out.println("Area:" + quad1.calcularArea());
		}
		else if (poligono == 2){
			System.out.println("Raio: ");
			raio = input.nextDouble();
			Circulo circ1 = new Circulo(raio);
			System.out.println("Area:" + circ1.calcularArea());
		}
	}
}
