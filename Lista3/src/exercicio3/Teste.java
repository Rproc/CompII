package exercicio3;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario(10, 100.00, Titulo.DOUTORADO);
		
		Contador cont = new Contador(15, 200.00, Titulo.GRADUADO);
		
		System.out.println( cont.calculaBonus(func) );
		
		
	}
}
