package exercicio2;

public class Teste {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(150, 1.5, 7.8, 5245.00);
		Roda [] roda = new Roda [4];

		for (int i = 0; i < roda.length; i++) {
			roda[i] = new Roda (17);
		}
		
		
		Automovel carro = new Automovel(m1, roda);
		
		System.out.println(carro.getMotor().getPotencia());
		
	}

}
