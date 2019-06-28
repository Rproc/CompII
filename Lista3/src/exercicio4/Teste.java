package exercicio4;

public class Teste {

	public static void main(String[] args) {

		Carro carro1 = FabricaCarros.criaCarro("Vinho");

		System.out.println(carro1.getCor() + " " + carro1.getNumeroChassis());

		carro1 = FabricaCarros.criaCarro("Vinho");

		System.out.println(carro1.getCor() + " " + carro1.getNumeroChassis());

		carro1 = FabricaCarros.criaCarro("Vinho");

		System.out.println(carro1.getCor() + " " + carro1.getNumeroChassis());

		carro1 = FabricaCarros.criaCarro("Vinho");

		System.out.println(carro1.getCor() + " " + carro1.getNumeroChassis());

		carro1 = FabricaCarros.criaCarro("Vinho");

		System.out.println(carro1.getCor() + " " + carro1.getNumeroChassis());

	}
}
