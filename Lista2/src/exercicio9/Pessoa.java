package exercicio9;

public class Pessoa {
	
		private String nome;
		private double peso;

		public Pessoa(double peso, String nome){
			this.setNome(nome);
			this.peso = peso;
		}
		
		public double getPeso(){
			return peso;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
}
