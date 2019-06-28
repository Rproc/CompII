package exercicio5;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.definirSalarioBase(new Moeda(1000.00));

		System.out.println(f1.obterSalarioBase().getValor());
		System.out.println(f1.obterPagamento().getValor());
		
		Vendedor f2 = new Vendedor();
		
		f2.definirSalarioBase(new Moeda (800.00));
		
		f2.setComissao(new Porcentagem(0.2));
		System.out.println(f2.getComissao().getPorcent());
		
		System.out.println(f2.obterPagamento().getValor());
				

	}
}