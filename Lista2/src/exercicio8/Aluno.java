package exercicio8;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoa {

		private ArrayList<Nota> notas = new ArrayList<Nota>();

		public Aluno(String nome, String cpf) {
			super(nome, new Cpf(cpf));

		}

		public ArrayList<Nota> getNotas() {
			return notas;
		}

		public void setNotas(ArrayList<Nota> notas) {
			this.notas = notas;
		}

		public void addNota(double valor, Date data) {

			this.getNotas().add(new Nota(valor, data));

		}

		public double getMedia() {
			
			double media = 0;

			for (Nota notaAtual : notas) {

				media += notaAtual.getValor(); 

			}
			
			return media = media / this.getNotas().size();

		}

		public void printarDados() {

			System.out.println("Nome: " + this.getNome());
			System.out.println("CPF: " + this.getCpf().getNumero());

			for (Nota notaAtual : notas) {

				System.out.print("Nota: " + notaAtual.getValor() + "   ;   ");
				System.out.println("Data: " + notaAtual.getData().toString());

			}
			
			System.out.println("Media Final: " + this.getMedia());

		}
	

}
