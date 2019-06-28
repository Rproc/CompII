package exercicio8;

public class Integral {
	
	private double iD;

	//private double i;
	public double calculaIntegral(Funcao f, double x0, double xn){
		
		for (double i = x0; i < xn; i=i+iD) {
			f.fx(i);
		}
	}

	public double getiD() {
		return iD;
	}

	public void setiD(double iD) {
		this.iD = iD;
	}
	
	
}
