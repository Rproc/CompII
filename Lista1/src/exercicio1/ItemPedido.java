package exercicio1;

import java.util.ArrayList;

public class ItemPedido {

	private int quantidade;
	ArrayList <Produto> produto = new ArrayList<Produto>();
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 0)
			this.quantidade = quantidade;
		else
			System.out.println("Digite valores nao-negativos");
	}
	
}
