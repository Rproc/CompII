package exercicio9;

public class Teste {

	public static void main(String[] args) {
		
		MicroOnibus bus = new MicroOnibus(10, 200);
		
		bus.addPessoas("Tio", 82);
		bus.addPessoas("Criança", 42);
		bus.addPessoas("Sobrinho", 50);
		
		bus.verificarPeso();
	}
}
