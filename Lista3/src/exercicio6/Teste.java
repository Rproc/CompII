package exercicio6;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList <Double> area = new ArrayList<Double>();
		ArrayList <Double> area2 = new ArrayList<Double>();
		ArrayList <Double> area3 = new ArrayList<Double>();		
		
		Circulo circulo1 = new Circulo(30);
		circulo1.calcularArea();
		Circulo circulo2 = new Circulo(1.2);
		circulo2.calcularArea();
		

		Retangulo retang1 = new Retangulo(2, 2);
		Retangulo retang2 = new Retangulo(800, 600);
	
		retang1.calcularArea();
		retang2.calcularArea();

		Triangulo tri1 = new Triangulo(2 , 1);
		tri1.calcularArea();
		Triangulo tri2 = new Triangulo(2 , 2);
		tri2.calcularArea();
		Triangulo tri3 = new Triangulo(5 , 7);
		tri3.calcularArea();
		Triangulo tri4 = new Triangulo(3, 4);
		tri4.calcularArea();
		Triangulo tri5 = new Triangulo(5, 4);
		tri5.calcularArea();
		
		area.add(retang1.obterArea());
		area.add(tri1.obterArea());
		area.add(tri3.obterArea());
		
		PoligonosComplexos complex = new PoligonosComplexos (area);
		complex.calcularArea();
		
		area2.add(retang2.obterArea());
		area2.add(tri2.obterArea());
		area2.add(tri2.obterArea());
		
		PoligonosComplexos complex1 = new PoligonosComplexos (area2);
		complex1.calcularArea();
		
		area3.add(retang1.obterArea());
		area3.add(retang2.obterArea());
		area3.add(tri4.obterArea());
		area3.add(tri5.obterArea());
		PoligonosComplexos complex2 = new PoligonosComplexos(area3);
		
		System.out.println(retang1.obterArea());
		System.out.println(retang2.obterArea());
		System.out.println(tri1.obterArea());
		System.out.println(tri2.obterArea());
		System.out.println(tri3.obterArea());
		System.out.println(circulo1.obterArea());
		System.out.println(circulo2.obterArea());
		System.out.println("1 = " + complex.obterArea());
		System.out.println("2 = " + complex1.obterArea());
		System.out.println("3 = " + complex2.obterArea());
		
	}
}
