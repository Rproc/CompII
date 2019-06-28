package exercicio3;

enum Titulo {TECNICO, GRADUADO, MESTRADO, DOUTORADO}

public class Funcionario {

	private int tempoServico; 
	private double salarioAtual;
	private Titulo titulo;
	
	public Funcionario(int tempoServico, double salarioAtual, Titulo titulo) {
		this.setSalarioAtual(salarioAtual);
		this.setTempoServico(tempoServico);
		this.setTitulo(titulo);
	}
	
	
	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	public double getSalarioAtual() {
		return salarioAtual;
	}
	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	public Titulo getTitulo() {
		return titulo;
	}
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
}
