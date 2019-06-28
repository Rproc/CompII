package exercicio8;

public class Pessoa {

	private String nome;
	private Cpf cpf;
	
	public Pessoa(String nome, Cpf cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}
	
	public void printCpf(){
		
		
	}
}
