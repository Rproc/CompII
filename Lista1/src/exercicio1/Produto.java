package exercicio1;

public class Produto {

	private String nome;
	private String descricao;
	private double precoUnitario;
	private double desconto;
	
	public Produto(String nome, String descricao, double precoUnitario, double desconto){
		
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		if (precoUnitario >= 0.0)
			this.precoUnitario = precoUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		if (desconto >= 0.0)
		this.desconto = desconto;
	}
	
}
