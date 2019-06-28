package exercicio5;

public class Vendedor extends Funcionario {

	private Porcentagem comissao;
	
	public Vendedor(Porcentagem comissao) {
		this.setComissao(comissao);
	}
	
	@Override
	public Moeda obterPagamento() {
		return ( new Moeda(this.getSalarioBase().getNome(), ( this.getComissao().getValor() * this.getSalarioBase().getValor() )) );
	}
		

	public Porcentagem getComissao() {
		return comissao;
	}

	public void setComissao(Porcentagem comissao) {
		
		this.comissao = comissao;
	}
	
}
