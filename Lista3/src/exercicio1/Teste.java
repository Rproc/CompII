package exercicio1;

public class Teste {

	public static void main(String[] args) {

		Filho filho = new Filho("Procopio", new Pessoa("Alguem"), new Pessoa("OutroAlguem"));
		
		System.out.println(filho.getNome());
		System.out.println(filho.getPai().getNome());
		System.out.println(filho.getMae().getNome());

	}

}
