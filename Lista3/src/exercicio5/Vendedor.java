package exercicio5;

public class Vendedor extends Funcionario{
	
	private Porcentagem comissao;
	
	@Override
	public Moeda obterPagamento(){
		Moeda m1 = new Moeda(obterSalarioBase().getValor() * getComissao().getPorcent());
		//m1 = obterSalarioBase().getValor() * getComissao().getPorcent();
		return m1;
	}
	
	public Porcentagem getComissao(){
		return comissao;
	}
	
	public void setComissao(Porcentagem comissao){
		this.comissao = comissao;
	}
}
