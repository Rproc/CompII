package exercicio1;

public class Teste {

	public static void main(String[] args) {

		ItemPedido item1 = new ItemPedido();
		Produto p1 = new Produto("Arroz", "Comida", 2.95, 0.15);
		
		
		System.out.println(p1.getNome() + " --- " + p1.getDescricao() + " ---- " + p1.getPrecoUnitario());
	}

}
