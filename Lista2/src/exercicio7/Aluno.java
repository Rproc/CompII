package exercicio7;

import java.util.ArrayList;


public class Aluno extends Pessoa{

	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void printarDados(){
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		
		for (Nota notaAtual : notas) {
			
			System.out.print("Nota: " + notaAtual.getValor() + "   ;   ");
			System.out.println("Data: " + notaAtual.getData().toString());
			
		}
		
		System.out.println("----------------------");
		
	}
}
