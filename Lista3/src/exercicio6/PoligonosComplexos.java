package exercicio6;

import java.util.ArrayList;

public class PoligonosComplexos extends Poligono {

	int numero;
	double areaTotal = 0;
	ArrayList < Double > areasPoligonos = new ArrayList <Double>();
	
	public PoligonosComplexos(ArrayList <Double> areas){
		areasPoligonos = areas;	
	}
	
	public void calcularArea(){
		for(int i = 0; i< areasPoligonos.size(); i++){
			areaTotal = areaTotal + areasPoligonos.get(i);
		}
	}
	
	public double obterArea(){
		return areaTotal;
	}
}
