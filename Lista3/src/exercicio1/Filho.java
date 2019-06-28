package exercicio1;

public class Filho extends Pessoa{

	private final Pessoa pai;
	private final Pessoa mae;
	private Pessoa padrasto;
	private Pessoa madrasta;
	
	public Filho(String nome, Pessoa pai, Pessoa mae) {
		super(nome);
		this.pai = pai;
		this.mae = mae;
	}

	public Pessoa getPadrasto() {
		return padrasto;
	}

	public void setPadrasto(Pessoa padrasto) {
		this.padrasto = padrasto;
	}

	public Pessoa getMadrasta() {
		return madrasta;
	}

	public void setMadrasta(Pessoa madrasta) {
		this.madrasta = madrasta;
	}

	public Pessoa getPai() {
		return pai;
	}

	public Pessoa getMae() {
		return mae;
	}
	
}
